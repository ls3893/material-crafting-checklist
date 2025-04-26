//Scene 2A -- Minecraft Add Item (of varying quantity)
package application.ui;

import application.Item;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MineAddItem
{
	public Scene mineAddScene(Stage primaryStage)
    {
		//Default value
			Item item = new Item();
		//Header
    		Label mineTitle = new Label("Minecraft Add Item");
    		HBox mineTitleForm = new HBox(mineTitle);
    		mineTitleForm.setId("mine-header");
	
    	//Category Dropdown
    		Label mineCategoryLabel = new Label("Category:");
    		ComboBox<String> mineCategoryDrop = new ComboBox<>(); 
    		mineCategoryDrop.getItems().addAll("Basic", "Block", "Tool", "Defense", 
    			                       "Mechanism", "Food", "Other", "Dye", 
    			                       "Wool", "Brewing"); 
    	
    		mineCategoryDrop.setPromptText("Select one"); 
  
    		
    	// Item Dropdown
    		Label mineItem = new Label("Item:");
    		ComboBox<String> mineItemDrop = new ComboBox<>();
    		mineItemDrop.getItems().addAll(item.getIDs());


    		mineItemDrop.setPromptText("Select one"); 

    		
    		
    	// Quantity/Textfield of Item
    		Label mineX = new Label(" x ");
    		TextField mineQuantityText = new TextField();

    	// Add Button
    		Button mineAddItem = new Button("Add Item");
    		HBox mineAddItemForm = new HBox(mineAddItem);
    		
    	// Functionality of Controls
    		
    		//Sets the user selected category 
    		mineCategoryDrop.setOnAction(e ->
    		{ 
    			String mineSelectedCategory = mineCategoryDrop.getValue();
    			item.setCategory(mineSelectedCategory); 
    			    
    			mineItemDrop.getItems().clear();  
    			    
    			mineItemDrop.getItems().addAll(item.getIDs());

    		});

    		//Sets the used selected item
    		mineItemDrop.setOnAction(e ->
    		{
    			String selectedItem = mineItemDrop.getValue();
    		    item.setID(selectedItem);
    			System.out.println("Selected Item: " + selectedItem);


    		});
    		
    		//Sets the user selected quantity
    		mineQuantityText.setOnAction(e -> 
    		{
    			String selectedQuantityText = mineQuantityText.getText();
    			try 
    			{
    				int mineQuantity = Integer.parseInt(selectedQuantityText);
    				item.setQuantity(mineQuantity);
    			} 
    			catch (NumberFormatException ex) 
    			{
    				System.out.println("Please enter a valid number.");
    			}
    		});
    		
    		//Saves the item, its category, and quantity
    		mineAddItem.setOnAction(e -> 
    		{
    		    System.out.println("Saving item...");
    		    item.getCategory();
    		    item.getID();
    		    item.getQuantity();
    		});
    		
    			
    	//Formation on screen of JavaFX components
    		HBox mineCategoryForm = new HBox(10);
    		mineCategoryForm.getChildren().addAll(mineCategoryLabel, mineCategoryDrop);
    		mineCategoryForm.setId("mine-category");
    		
    		HBox mineItemForm= new HBox(10);
    		mineItemForm.getChildren().addAll(mineItem, mineItemDrop, mineX, mineQuantityText);
    
    	
    		VBox layout = new VBox(10);
    		layout.getChildren().addAll(mineTitleForm, mineCategoryForm, mineItemForm, mineAddItemForm);

    		Scene mineAddItemScene = new Scene(layout, 600, 400);
    		mineAddItemScene.getStylesheets().add(getClass().getResource("/application/resources/mineStyle.css").toExternalForm());
    		return mineAddItemScene;
    	}
}
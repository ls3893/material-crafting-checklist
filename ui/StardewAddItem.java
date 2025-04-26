//Scene 2B -- Stardew Add Item (of varying quantity)
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

public class StardewAddItem
{
	public Scene stardewAddScene(Stage primaryStage)
    {
		//Default value
		Item item = new Item();
		//Header
    		Label stardewTitle = new Label("Minecraft Add Item");
    		HBox stardewTitleForm = new HBox(stardewTitle);
    		stardewTitleForm.setId("mine-header");
	
    	//Category Dropdown
    		Label stardewCategoryLabel = new Label("Category:");
    		ComboBox<String> stardewCategoryDrop = new ComboBox<>(); 
    		stardewCategoryDrop.getItems().addAll("Bombs", "Fences", "Sprinklers", "Artisan Equipment", 
                    							  "Fertilizer", "Seeds", "Decor", "Fishing", "Rings", 
                    							  "Edible Items", "Consumables", "Lighting", 
                    							  "Refining Equipment", "Furniture", "Storage Equipment",
                    							  "Signs", "Misc"); 
    	
    		stardewCategoryDrop.setPromptText("Select one"); 
  
    		
    	// Item Dropdown
    		Label stardewItem = new Label("Item:");
    		ComboBox<String> stardewItemDrop = new ComboBox<>();
    		stardewItemDrop.getItems().addAll(item.getIDs());


    		stardewItemDrop.setPromptText("Select one"); 

    		
    		
    	// Quantity/Textfield of Item
    		Label stardewX = new Label(" x ");
    		TextField stardewQuantityText = new TextField();

    	// Add Button
    		Button stardewAddItem = new Button("Add Item");
    		HBox stardewAddItemForm = new HBox(stardewAddItem);
    		
    	// Functionality of Controls
    		
    		//Sets the user selected category 
    		stardewCategoryDrop.setOnAction(e ->
    		{ 
    			String stardewSelectedCategory = stardewCategoryDrop.getValue();
    			item.setCategory(stardewSelectedCategory); 
    			    
    			stardewItemDrop.getItems().clear();  
    			    
    			stardewItemDrop.getItems().addAll(item.getIDs());
    		});

    		//Sets the used selected item
    		stardewItemDrop.setOnAction(e ->
    		{
    			String selectedItem = stardewItemDrop.getValue();
    		    item.setID(selectedItem);
    			System.out.println("Selected Item: " + selectedItem);


    		});
    		
    		//Sets the user selected quantity
    		stardewQuantityText.setOnAction(e -> 
    		{
    			String selectedQuantityText = stardewQuantityText.getText();
    			try 
    			{
    				int stardewQuantity = Integer.parseInt(selectedQuantityText);
    				item.setQuantity(stardewQuantity);
    			} 
    			catch (NumberFormatException ex) 
    			{
    				System.out.println("Please enter a valid number.");
    			}
    		});
    		
    		//Saves the item, its category, and quantity
    		stardewAddItem.setOnAction(e -> 
    		{
    		    System.out.println("Saving item...");
    		    item.getCategory();
    		    item.getID();
    		    item.getQuantity();
    		});
    		
    			
    	//Formation on screen of JavaFX components
    		HBox stardewCategoryForm = new HBox(10);
    		stardewCategoryForm.getChildren().addAll(stardewCategoryLabel, stardewCategoryDrop);
    		stardewCategoryForm.setId("mine-category");
    		
    		HBox mineItemForm= new HBox(10);
    		mineItemForm.getChildren().addAll(stardewItem, stardewItemDrop, stardewX, stardewQuantityText);
    
    	
    		VBox layout = new VBox(10);
    		layout.getChildren().addAll(stardewTitleForm, stardewCategoryForm, mineItemForm, stardewAddItemForm);

    		Scene stardewAddItemScene = new Scene(layout, 600, 400);
    		stardewAddItemScene.getStylesheets().add(getClass().getResource("/application/resources/stardewStyle.css").toExternalForm());
    		return stardewAddItemScene;
    	}
}
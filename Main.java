//OLD AS OF 4.23-- TO BE DELETED

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application 
{
	public String savedGameSelect = null;
	
	@Override
	public void start(Stage primaryStage) 
	{
		//Game selection initial and reappearing
		
		
		//Game Selection 
		Label gameSelectDropLabel = new Label("Game: ");
		ComboBox<String> gameSelectionDrop = new ComboBox<>();
		gameSelectionDrop.getItems().addAll("Minecraft", "Stardew Valley");
		
		
		
		//Create List button
		Button createList = new Button("Create New List");
		
		
		
		
		createList.setOnAction(e ->
		{
			String selectedGame = gameSelectionDrop.getValue();

			//Minecraft Material Farming Checklist
			if (selectedGame.equals("Minecraft"))
			{
				savedGameSelect = selectedGame;
				
				Stage mineItemCheck = new Stage();
				
				//Item Type
				Label mineItemTypeLabel = new Label("Item type: ");
				ComboBox<String> mineItemTypeDrop = new ComboBox<>();
				mineItemTypeDrop.getItems().addAll("Pickaxe", "Sword"); //change this to the information from csv
				
				//Select Item
				Label mineItemDropLabel = new Label("Pick an item: ");
				ComboBox<String> mineItemDrop = new ComboBox<>();
				mineItemDrop.getItems().addAll("Pickaxe", "Sword"); //change this to the information from csv
				
				//Number of desired item needed
				Label mineX = new Label(" x ");
				TextField mineNumItems = new TextField();
				
				
				
				//Buttons
				Button mineCreateList = new Button("Create New List");
				Button mineViewList = new Button("View Lists");
				
				//Organization
				HBox mineItemTypeForm = new HBox(10, mineItemTypeLabel, mineItemTypeDrop);
				HBox mineItemNumForm = new HBox(10, mineX, mineNumItems);
				HBox mineItemDropForm = new HBox(10, mineItemDropLabel, mineItemDrop);
				HBox mineItemSelectForm = new HBox(10, mineItemDropForm, mineItemNumForm);
				HBox mineButtonsForm = new HBox(10, mineCreateList, mineViewList);
		        VBox mineForm = new VBox(15,mineItemTypeForm,
		        	mineItemSelectForm, mineButtonsForm);
				
				
				//Minecraft Scene
				Scene mineScene = new Scene(mineForm, 300, 100);
				
				mineItemCheck.setScene(mineScene);
				mineItemCheck.setTitle("Minecraft Item");
				mineItemCheck.show();
						
				mineItemCheck.setScene(mineScene);
				
			}
			
			//Stardew Valley Scene
			else if (selectedGame.equals("Stardew Valley"))
			{
				savedGameSelect = selectedGame;
				
				Stage stardewItemCheck = new Stage();
				

				//Select Item
				Label stardewItemDropLabel = new Label("Item: ");
				ComboBox<String> stardewItemDrop = new ComboBox<>();
				stardewItemDrop.getItems().addAll("Scarecrow", "Chest"); //change this to the information from csv
				
				
				//Number of desired item needed
				Label stardewX = new Label("   x    ");
				TextField stardewNumItems = new TextField();
				
				
				
				
				//Buttons
				Button stardewCreateList = new Button("Create New List");
				Button stardewViewList = new Button("View Lists");
				
				
				
				//Format of Stardew stage
				HBox stardewItemNumForm = new HBox(10, stardewX, stardewNumItems);
				HBox stardewItemDropForm = new HBox(10, stardewItemDropLabel, stardewItemDrop);
				HBox stardewItemSelectForm = new HBox(10, stardewItemDropForm, stardewItemNumForm);
				HBox stardewButtonsForm = new HBox(10, stardewCreateList, stardewViewList);
		        VBox stardewForm = new VBox(15, stardewItemSelectForm, stardewButtonsForm);
				
				
				//Stardew Scene
				Scene stardewScene = new Scene(stardewForm, 500, 300);
				
				stardewItemCheck.setScene(stardewScene);
				stardewItemCheck.setTitle("Stardew Valley Item");
				stardewItemCheck.show();
						
				stardewItemCheck.setScene(stardewScene);
			}
		});
		
		HBox horizControls = new HBox(10, gameSelectDropLabel, gameSelectionDrop);
        VBox vertControls = new VBox(15, horizControls, createList);
		
		
		Scene materialFarmChecklist = new Scene(vertControls, 300, 100);
		materialFarmChecklist.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(materialFarmChecklist);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}


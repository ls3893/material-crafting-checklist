package application.ui;

import java.util.ArrayList;
import java.util.HashMap;

import application.Item;
import application.SceneController;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application 
{
 //Stage #1 -- start => minecraft/stardew valley
	@Override
    public void start(Stage primaryStage) 
    {
    
        primaryStage.setTitle("Material Farming Checklist");
   
        
        
        
        
 //Scene #1 -- Welcome! AND Game Selection
        
        // Welcome label
        Label welcome = new Label("Welcome to Material Farming Checklist");
        welcome.setId("header");

        // Game selection UI
        VBox gameSelectorSet = createGameSelector(primaryStage);

        // Layout with both welcome and game selector
        VBox layout1 = new VBox(30); 
        layout1.getChildren().addAll(welcome, gameSelectorSet);
        layout1.setAlignment(Pos.CENTER);

        // Scene and CSS
        Scene scene = new Scene(layout1, 600, 400);
        scene.getStylesheets().add(getClass().getResource("/application/resources/application.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	//Function of Game Selection
    public VBox createGameSelector(Stage primaryStage) 
    {
        ComboBox<String> gameSelectionDrop = new ComboBox<>();
        gameSelectionDrop.setId("choicebox");
        gameSelectionDrop.getItems().addAll("Minecraft", "Stardew Valley");
        gameSelectionDrop.setPromptText("Select a game");

        Button createListButton = new Button("Create List");
        createListButton.setId("button");
        createListButton.setOnAction
        (e -> 
        {
            String gameChoice = gameSelectionDrop.getValue();
            if ("Minecraft".equals(gameChoice)) 
            {
            	SceneController.switchToMineScene(primaryStage); 
            } 
            else if ("Stardew Valley".equals(gameChoice)) 
            {
            	SceneController.switchToStardewScene(primaryStage); 
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(gameSelectionDrop, createListButton);
        layout.setAlignment(Pos.CENTER);

        return layout;
    }
    

    public static void main(String[] args) 
    {
        launch(args);
    }
    
}


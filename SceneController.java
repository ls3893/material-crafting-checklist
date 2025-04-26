// SceneController.java
package application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import application.ui.MineScene;
import application.ui.StardewAddItem;
import application.ui.StardewScene;
import application.ui.CraftingChecklistScene;
import application.ui.Main;
import application.ui.MineAddItem;

public class SceneController 
{
    public static void switchToMineScene(Stage primaryStage) 
    {
        Scene scene = new MineAddItem().mineAddScene(primaryStage);
        primaryStage.setScene(scene);
    }

    public static void switchToStardewScene(Stage primaryStage) 
    {
        Scene scene = new StardewAddItem().stardewAddScene(primaryStage);
        primaryStage.setScene(scene);
    }
}
//    public static void switchToCraftingChecklistScene(Stage primaryStage) 
//    {
//        CraftingChecklistScene sceneBuilder = new CraftingChecklistScene();
//        Scene scene = sceneBuilder.createScene(primaryStage);
//        primaryStage.setScene(scene);
//    }
//
//	public static Object switchToMainMenu(Stage primaryStage) 
//	{
//		return null;
//	}
//
//	public static Object switchToMainMenu1(Stage primaryStage) 
//	{
//		return null;
//	}
//
//}
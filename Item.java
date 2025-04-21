import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.lang.Integer;

public class Item
{
	public Game game = new Game();
	public Scanner kb;
	public String gameChoice;
	public String category;
	public String ID;
	public HashMap<String, Integer> recipe;
	public int recipeCount;
	public String recipeSource;
	public int quantity;

	//Displays game selection choices
	public void displayGames()
	{
		System.out.println("Minecraft or Stardew Valley");
	}
	
	public String getGame(Scanner kb)
	{
		this.gameChoice = kb.nextLine();
		
		return gameChoice;
	}
	//Displays all the different item categories
	public void displayCategories()
	{
		if(gameChoice.equals("Minecraft"))
		{
			System.out.println("Basic\n"
					+ "Block\n"
					+ "Tool\n"
					+ "Defense\n"
					+ "Mechanism\n"
					+ "Food\n" 
					+ "Other\n" 
					+ "Dye\n" 
					+ "Wool\n" 
					+ "Brewing");
		}
		else if(gameChoice.equals("Stardew Valley"))
		{
			System.out.println("Bombs\n" 
					+ "Fences\n"
					+ "Sprinklers\n"
					+ "Artisan Equipment\n"
					+ "Fertilizer\n"
					+ "Seeds\n"
					+ "Decor\n"
					+ "Fishing\n"
					+ "Rings\n"
					+ "Edible Items\n"
					+ "Consumables\n"
					+ "Lighting\n"
					+ "Refining Equipment\n"
					+ "Furniture\n"
					+ "Storage Equipment\n"
					+ "Signs\n"
					+ "Misc");
		}
	}
	
	//Gets the category
	public String getCategory(Scanner kb)
	{
		this.category = kb.nextLine();
		
		return category;
	}
	
	//Displays all the items from the chosen category
	public void displayIDs()
	{
		
		if(gameChoice.equals("Minecraft"))
		{
			Set<String> keys = game.Minecraft(category).keySet();
			for(String key : keys)
			{	
				System.out.println(key);
			}
		}
		else if(gameChoice.equals("Stardew Valley"))
		{
			Set<String> keys = game.StardewValley(category).keySet();
			for(String key : keys)
			{
				System.out.println(key);
			}
		}
	}
	
	//Gets item name 
	public String getID(Scanner kb)
	{
		this.ID = kb.nextLine();
		
		return ID;
	}
	
	//Gets base recipe 
	public HashMap<String, Integer> getRecipe()
	{
		HashMap<String, Integer> recipe = new HashMap<>();
		this.recipe = recipe;
		
		if(gameChoice.equals("Minecraft"))
		{
			ArrayList<String> list = game.Minecraft(category).get(ID);
			for(int i = 1; i < list.size()-1; i+=2)
			{
				recipe.put(list.get(i), Integer.parseInt(list.get(i+1)));
			}
		}
		else if(gameChoice.equals("Stardew Valley"))
		{
			ArrayList<String> list = game.StardewValley(category).get(ID);
			for(int i = 1; i < list.size()-2; i+=2)
			{
				recipe.put(list.get(i), Integer.parseInt(list.get(i+1)));
			}
		}
		return recipe;
	}
	
	//Gets yielded amount of items made by recipe
	public int getCount()
	{
		if(gameChoice.equals("Minecraft"))
		{
			ArrayList<String> list = game.Minecraft(category).get(ID);
			this.recipeCount = Integer.parseInt(list.get(2));
		}
		else if(gameChoice.equals("Stardew Valley"))
		{
			ArrayList<String> list = game.StardewValley(category).get(ID);
			this.recipeCount = Integer.parseInt(list.get(2));
		}
		return recipeCount;
	}
	
	public String getRecipeSource()
	{
		if(gameChoice.equals("Stardew Valley"))
		{
			ArrayList<String> list = game.StardewValley(category).get(ID);
			this.recipeSource = list.get(3);
			
			return recipeSource;
		}
		else 
		{
			return null;
		}
		
	}
	
	public int getQuantity(Scanner kb)
	{
		this.quantity = kb.nextInt();
		return quantity;
	}
	
	//Updates recipe to have proper amount of materials per wanted number of items by user
	public HashMap<String, Integer> updatedQuantities()
	{
		for(String key : recipe.keySet())
		{
			Integer value = recipe.get(key);
			value = value * quantity;
			recipe.put(key, value);
		}
		
		return recipe;
	}
}
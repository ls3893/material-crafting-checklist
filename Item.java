import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.lang.Integer;

public class Item
{
	public Game game = new Game();
	public String gameChoice;
	public String category;
	public String ID;
	public HashMap<String, Integer> recipe;
	public int harvest;
	public String recipeSource;
	public int quantity;
	
	
	public String choice1;
	public String choice2;
	public String choice3;
	public int choice4;

	public Item()
	{
		gameChoice = "";
		category = "";
		ID = "";
		recipe = null;
		harvest = 0;
		recipeSource = "";
		quantity = 0;
	}
	
	public Item(String gameChoice, String category, String ID, HashMap<String, Integer> recipe, String recipeSource, int quantity)
	{
		this.gameChoice = gameChoice;
		this.category = category;
		this.ID = ID;
		this.recipe = recipe;
		this.recipeSource = recipeSource;
		this.quantity = quantity;
	}
	
	//Displays game selection choices
	public void displayGames()
	{
		System.out.println("Minecraft or Stardew Valley");
	}
	
	public String getGame(String choice1)
	{
		gameChoice = choice1;
		
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
	public String getCategory(String choice2)
	{
		category = choice2;
		
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
	public String getID(String choice3)
	{
		ID = choice3;
		
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
			for(int i = 2; i < list.size()-1; i+=2)
			{
				recipe.put(list.get(i), Integer.parseInt(list.get(i+1)));
			}
		}
		return recipe;
	}
	
	//Gets yielded amount of items made by recipe
	public int getHarvest()
	{
		if(gameChoice.equals("Minecraft"))
		{
			ArrayList<String> list = game.Minecraft(category).get(ID);
			harvest = Integer.parseInt(list.get(0));
		}
		else if(gameChoice.equals("Stardew Valley"))
		{
			ArrayList<String> list = game.StardewValley(category).get(ID);
			harvest = Integer.parseInt(list.get(0));
		}
		return harvest;
	}
	
	public String getRecipeSource()
	{
		if(gameChoice.equals("Stardew Valley"))
		{
			ArrayList<String> list = game.StardewValley(category).get(ID);
			recipeSource = list.get(1);
			
			return recipeSource;
		}
		else 
		{
			return null;
		}
		
	}
	
	public int getQuantity(int choice4)
	{
		quantity = choice4;
		return quantity;
	}
	
	//Updates recipe to have proper amount of materials per wanted number of items by user
	public HashMap<String, Integer> updatedRecipeQuantities()
	{
		recipe = getRecipe();
		harvest = getHarvest();
		System.out.println(recipe.keySet());
	
		boolean flag = false; 
		int mult = 1;
		int num = harvest;
	
		while(flag != true)
		{
			num *= mult;
			if(num >= quantity)
			{
				flag = true;
			}
			else
			{
				mult++;
			}
		}
		
		for(String key : recipe.keySet())
		{
			Integer value = recipe.get(key);
			value = value * mult;
			recipe.put(key, value);
		}
		
		return recipe;
	}
	
	public String toString()
	{
		return String.format("Game: %s\nCategory: %s\nID: %s\nRecipe: %s\nRecipe Source: %s\nQuantity: %d" , 
							gameChoice,
							category,
							ID, 
							recipe, 
							recipeSource,
							quantity);
	}
}

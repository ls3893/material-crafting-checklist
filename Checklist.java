import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Checklist
{
	public Item item = new Item();
	public Scanner kb = new Scanner(System.in);
	public String gameChoice;
	public String category;
	public String ID;
	public HashMap<String, Integer> recipe = new HashMap<>();
	public int harvest;
	public String recipeSource;
	public int quantity;
	
	public Item addItem()
	{
		item.displayGames();
		String choice1 = kb.nextLine();
		gameChoice = item.getGame(choice1);
		
		item.displayCategories();
		String choice2 = kb.nextLine();
		category = item.getCategory(choice2);
		
		item.displayIDs();
		String choice3 = kb.nextLine();
		ID = item.getID(choice3);

		recipeSource = item.getRecipeSource();
		int choice4 = kb.nextInt();
		quantity = item.getQuantity(choice4);
		
		recipe = item.updatedRecipeQuantities();
		
		Item newItem = new Item(gameChoice, category, ID, recipe, recipeSource, quantity);
		
		return newItem;
	}
	
	public void removeItem(ArrayList<Item> list)
	{
		boolean found = false; 
		
		Item currentItem;
		
		System.out.println("Enter ID of item to remove: ");
		String desc = kb.nextLine();
		desc += kb.nextLine();
		
		for(int i = 0; i < list.size() && found == false; i++)
		{
			currentItem = list.get(i);
			String temp = ID;
			
			if(desc.equals(temp))
			{
				list.remove(i);
				found = true;
				System.out.printf("Removing %s from checklist\n", desc);
			}
		}
		
		if(found != true)
		{
			System.out.printf("No %s's found in checklist\n", desc);
		}
		
		
	}
	
	public Item editItemQuantity(Item item)
	{
		int newQuantity = kb.nextInt();
		
		item.setQuantity(newQuantity);
		item.updatedRecipeQuantities();
		
		return item;
	}
	
}

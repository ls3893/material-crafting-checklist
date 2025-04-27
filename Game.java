import java.util.HashMap;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Game
{
	public HashMap<String, ArrayList<String>> Minecraft(String category)
	{
		String csvFile = "src/allcrafting-mc.csv";
		
		ArrayList<String> list = new ArrayList<>();
		list = readWithBR(csvFile);
				
		HashMap<String, ArrayList<String>> basic = new HashMap<>();
		HashMap<String, ArrayList<String>> block = new HashMap<>();
		HashMap<String, ArrayList<String>> tool = new HashMap<>();
		HashMap<String, ArrayList<String>> defense = new HashMap<>();
		HashMap<String, ArrayList<String>> mechanism = new HashMap<>();
		HashMap<String, ArrayList<String>> food = new HashMap<>();
		HashMap<String, ArrayList<String>> other = new HashMap<>();
		HashMap<String, ArrayList<String>> dye = new HashMap<>();
		HashMap<String, ArrayList<String>> wool = new HashMap<>();
		HashMap<String, ArrayList<String>> brewing = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).contains("Basic_"))
			{
				String[] array1 = splitter(list, i);
				ArrayList<String> arrayList1 = listEntry(array1);
				
				basic.put(array1[1], arrayList1);
			}
			else if(list.get(i).contains("Block_"))
			{
				String[] array2 = splitter(list, i);
				ArrayList<String> arrayList2 = listEntry(array2);
				
				block.put(array2[1], arrayList2);
			}
			else if(list.get(i).contains("Tool_"))
			{
				String[] array3 = splitter(list, i);
				ArrayList<String> arrayList3 = listEntry(array3);
				
				tool.put(array3[1], arrayList3);
			}
			else if(list.get(i).contains("Defense_"))
			{
				String[] array4 = splitter(list, i);
				ArrayList<String> arrayList4 = listEntry(array4);
				
				defense.put(array4[1], arrayList4);
			}
			else if(list.get(i).contains("Mechanism_"))
			{
				String[] array5 = splitter(list, i);
				ArrayList<String> arrayList5 = listEntry(array5);
				
				mechanism.put(array5[1], arrayList5);
			}
			else if(list.get(i).contains("Food_"))
			{
				String[] array6 = splitter(list, i);
				ArrayList<String> arrayList6 = listEntry(array6);
				
				food.put(array6[1], arrayList6);
			}
			else if(list.get(i).contains("Other_"))
			{
				String[] array7 = splitter(list, i);
				ArrayList<String> arrayList7 = listEntry(array7);
				
				other.put(array7[1], arrayList7);
			}
			else if(list.get(i).contains("Dye_"))
			{
				String[] array8 = splitter(list, i);
				ArrayList<String> arrayList8 = listEntry(array8);
				
				dye.put(array8[1], arrayList8);
			}
			else if(list.get(i).contains("Wool_"))
			{
				String[] array9 = splitter(list, i);
				ArrayList<String> arrayList9 = listEntry(array9);
				
				wool.put(array9[1], arrayList9);
			}
			else if(list.get(i).contains("Brewing_"))
			{
				String[] array10 = splitter(list, i);
				ArrayList<String> arrayList10 = listEntry(array10);
				
				brewing.put(array10[1], arrayList10);
			}
		}
		
		if(category.equals("Basic"))
		{
			return basic;
		}
		else if(category.equals("Block"))
		{
			return block;
		}
		else if(category.equals("Tool"))
		{
			return tool;
		}
		else if(category.equals("Defense"))
		{
			return defense;
		}
		else if(category.equals("Mechanism"))
		{
			return mechanism;
		}
		else if(category.equals("Food"))
		{
			return food;
		}
		else if(category.equals("Other"))
		{
			return other;
		}
		else if(category.equals("Dye"))
		{
			return dye;
		}
		else if(category.equals("Wool"))
		{
			return wool;
		}
		else if(category.equals("Brewing"))
		{
			return brewing;
		}
		else
			return null;
	}
	
	public HashMap<String, ArrayList<String>> StardewValley(String category)
	{
		String csvFile = "src/allcrafting-sdv.csv";
		
		ArrayList<String> list = new ArrayList<>();
		list = readWithBR(csvFile);
		
		HashMap<String, ArrayList<String>> bombs = new HashMap<>();
		HashMap<String, ArrayList<String>> fences = new HashMap<>();
		HashMap<String, ArrayList<String>> sprinklers = new HashMap<>();
		HashMap<String, ArrayList<String>> artisanEquipment = new HashMap<>();
		HashMap<String, ArrayList<String>> fertilizer = new HashMap<>();
		HashMap<String, ArrayList<String>> seeds = new HashMap<>();
		HashMap<String, ArrayList<String>> decor = new HashMap<>();
		HashMap<String, ArrayList<String>> fishing = new HashMap<>();
		HashMap<String, ArrayList<String>> rings = new HashMap<>();
		HashMap<String, ArrayList<String>> edibleItems = new HashMap<>();
		HashMap<String, ArrayList<String>> consumables = new HashMap<>();
		HashMap<String, ArrayList<String>> lighting = new HashMap<>();
		HashMap<String, ArrayList<String>> refiningEquipment = new HashMap<>();
		HashMap<String, ArrayList<String>> furniture = new HashMap<>();
		HashMap<String, ArrayList<String>> storageEquipment = new HashMap<>();
		HashMap<String, ArrayList<String>> signs = new HashMap<>();
		HashMap<String, ArrayList<String>> misc = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).contains("Bombs_"))
			{
				String[] array1 = splitter(list, i);
				ArrayList<String> arrayList1 = listEntry(array1);
				
				bombs.put(array1[1], arrayList1);
			}
			else if(list.get(i).contains("Fences_"))
			{
				String[] array2 = splitter(list, i);
				ArrayList<String> arrayList2 = listEntry(array2);
				
				fences.put(array2[1], arrayList2);
			}
			else if(list.get(i).contains("Sprinklers_"))
			{
				String[] array3 = splitter(list, i);
				ArrayList<String> arrayList3 = listEntry(array3);
				
				sprinklers.put(array3[1], arrayList3);
			}
			else if(list.get(i).contains("Artisan Equipment_"))
			{
				String[] array4 = splitter(list, i);
				ArrayList<String> arrayList4 = listEntry(array4);
				
				artisanEquipment.put(array4[1], arrayList4);
			}
			else if(list.get(i).contains("Fertilizer_"))
			{
				String[] array5 = splitter(list, i);
				ArrayList<String> arrayList5 = listEntry(array5);
				
				fertilizer.put(array5[1], arrayList5);
			}
			else if(list.get(i).contains("Seeds_"))
			{
				String[] array6 = splitter(list, i);
				ArrayList<String> arrayList6 = listEntry(array6);
				
				seeds.put(array6[1], arrayList6);
			}
			else if(list.get(i).contains("Decor_"))
			{
				String[] array7 = splitter(list, i);
				ArrayList<String> arrayList7 = listEntry(array7);
				
				decor.put(array7[1], arrayList7);
			}
			else if(list.get(i).contains("Fishing_"))
			{
				String[] array8 = splitter(list, i);
				ArrayList<String> arrayList8 = listEntry(array8);
				
				fishing.put(array8[1], arrayList8);
			}
			else if(list.get(i).contains("Rings_"))
			{
				String[] array9 = splitter(list, i);
				ArrayList<String> arrayList9 = listEntry(array9);
				
				rings.put(array9[1], arrayList9);
			}
			else if(list.get(i).contains("Edible Items_"))
			{
				String[] array10 = splitter(list, i);
				ArrayList<String> arrayList10 = listEntry(array10);
				
				edibleItems.put(array10[1], arrayList10);
			}
			else if(list.get(i).contains("Consumables_"))
			{
				String[] array11 = splitter(list, i);
				ArrayList<String> arrayList11 = listEntry(array11);
				
				consumables.put(array11[1], arrayList11);
			}
			else if(list.get(i).contains("Lighting_"))
			{
				String[] array12 = splitter(list, i);
				ArrayList<String> arrayList12 = listEntry(array12);
				
				lighting.put(array12[1], arrayList12);
			}
			else if(list.get(i).contains("Refining Equipment_"))
			{
				String[] array13 = splitter(list, i);
				ArrayList<String> arrayList13 = listEntry(array13);
				
				refiningEquipment.put(array13[1], arrayList13);
			}
			else if(list.get(i).contains("Furniture_"))
			{
				String[] array14 = splitter(list, i);
				ArrayList<String> arrayList14 = listEntry(array14);
				
				furniture.put(array14[1], arrayList14);
			}
			else if(list.get(i).contains("Storage Equipment_"))
			{
				String[] array15 = splitter(list, i);
				ArrayList<String> arrayList15 = listEntry(array15);
				
				storageEquipment.put(array15[1], arrayList15);
			}
			else if(list.get(i).contains("Signs_"))
			{
				String[] array16 = splitter(list, i);
				ArrayList<String> arrayList16 = listEntry(array16);
				
				signs.put(array16[1], arrayList16);
			}
			else if(list.get(i).contains("Misc_"))
			{
				String[] array17 = splitter(list, i);
				ArrayList<String> arrayList17 = listEntry(array17);
				
				misc.put(array17[1], arrayList17);
			}
		}
		
		if(category.equals("Bombs"))
		{
			return bombs;
		}
		else if(category.equals("Fences"))
		{
			return fences;
		}
		else if(category.equals("Sprinklers"))
		{
			return sprinklers;
		}
		else if(category.equals("Artisan Equipment"))
		{
			return artisanEquipment;
		}
		else if(category.equals("Fertilizer"))
		{
			return fertilizer;
		}
		else if(category.equals("Seeds"))
		{
			return seeds;
		}
		else if (category.equals("Decor"))
		{
			return decor;
		}
		else if(category.equals("Fishing"))
		{
			return fishing;
		}
		else if(category.equals("Rings"))
		{
			return rings;
		}
		else if(category.equals("Edible Items"))
		{
			return edibleItems;
		}
		else if(category.equals("Consumables"))
		{
			return consumables;
		}
		else if(category.equals("Lighting"))
		{
			return lighting;
		}
		else if(category.equals("Refining Equipment"))
		{
			return refiningEquipment;
		}
		else if(category.equals("Furniture"))
		{
			return furniture;
		}
		else if(category.equals("Storage Equipment"))
		{
			return storageEquipment;
		}
		else if(category.equals("Signs"))
		{
			return signs;
		}
		else if(category.equals("Misc"))
		{
			return misc;
		}
		else
		{
			return null;
		}
		
	}
	
	public static String[] splitter(ArrayList<String> list, int i)
	{
		String string = list.get(i);
		String[] array = string.split(",");
		
		return array;
	}
	
	public static ArrayList<String> listEntry(String[] array)
	{
		ArrayList<String> arrayList = new ArrayList<>();
		
		for(int j = 0; j < array.length-2; j++)
		{
			arrayList.add(array[2+j].toString());
		}
		
		return arrayList;
	}
	
	public static ArrayList<String> readWithBR(String csvFile) throws UnsupportedOperationException
	{
		ArrayList<String> list = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(csvFile)))
		{
			String line;
			while((line = reader.readLine()) != null)
			{
				list.add(line);
			}
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
		return list;
	}
}

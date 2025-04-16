import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
				String list1 = list.get(i);
				String[] array1 = list1.split(",");
				
				ArrayList<String> arrayList1 = new ArrayList<>();
				
				for(int j = 0; j < array1.length-2; j++)
					arrayList1.add(array1[2+j].toString());
				
				basic.put(array1[1], arrayList1);
			}
			else if(list.get(i).contains("Block_"))
			{
				String list2 = list.get(i);
				String[] array2 = list2.split(",");
				
				ArrayList<String> arrayList2 = new ArrayList<>();
				
				for(int j = 0; j < array2.length-2; j++)
					arrayList2.add(array2[2+j].toString());
				
				block.put(array2[1], arrayList2);
			}
			else if(list.get(i).contains("Tool_"))
			{
				String list3 = list.get(i);
				String[] array3 = list3.split(",");
				
				ArrayList<String> arrayList3 = new ArrayList<>();
				
				for(int j = 0; j < array3.length-2; j++)
					arrayList3.add(array3[2+j].toString());
				
				tool.put(array3[1], arrayList3);
			}
			else if(list.get(i).contains("Defense_"))
			{
				String list4 = list.get(i);
				String[] array4 = list4.split(",");
				
				ArrayList<String> arrayList4 = new ArrayList<>();
				
				for(int j = 0; j < array4.length-2; j++)
					arrayList4.add(array4[2+j].toString());
				
				defense.put(array4[1], arrayList4);
			}
			else if(list.get(i).contains("Mechanism_"))
			{
				String list5 = list.get(i);
				String[] array5 = list5.split(",");
				
				ArrayList<String> arrayList5 = new ArrayList<>();
				
				for(int j = 0; j < array5.length-2; j++)
					arrayList5.add(array5[2+j].toString());
				
				mechanism.put(array5[1], arrayList5);
			}
			else if(list.get(i).contains("Food_"))
			{
				String list6 = list.get(i);
				String[] array6 = list6.split(",");
				
				ArrayList<String> arrayList6 = new ArrayList<>();
				
				for(int j = 0; j < array6.length-2; j++)
					arrayList6.add(array6[2+j].toString());
				
				food.put(array6[1], arrayList6);
			}
			else if(list.get(i).contains("Other_"))
			{
				String list7 = list.get(i);
				String[] array7 = list7.split(",");
				
				ArrayList<String> arrayList7 = new ArrayList<>();
				
				for(int j = 0; j < array7.length-2; j++)
					arrayList7.add(array7[2+j].toString());
				
				other.put(array7[1], arrayList7);
			}
			else if(list.get(i).contains("Dye_"))
			{
				String list8 = list.get(i);
				String[] array8 = list8.split(",");
				
				ArrayList<String> arrayList8 = new ArrayList<>();
				
				for(int j = 0; j < array8.length-2; j++)
					arrayList8.add(array8[2+j].toString());
				
				dye.put(array8[1], arrayList8);
			}
			else if(list.get(i).contains("Wool_"))
			{
				String list9 = list.get(i);
				String[] array9 = list9.split(",");
				
				ArrayList<String> arrayList9 = new ArrayList<>();
				
				for(int j = 0; j < array9.length-2; j++)
					arrayList9.add(array9[2+j].toString());
				
				wool.put(array9[1], arrayList9);
			}
			else if(list.get(i).contains("Brewing_"))
			{
				String list10 = list.get(i);
				String[] array10 = list10.split(",");
				
				ArrayList<String> arrayList10 = new ArrayList<>();
				
				for(int j = 0; j < array10.length-2; j++)
					arrayList10.add(array10[2+j].toString());
				
				brewing.put(array10[1], arrayList10);
			}
		}
		
		if(category == "Basic")
		{
			return basic;
		}
		else if(category == "Block")
		{
			return block;
		}
		else if(category == "Tool")
		{
			return tool;
		}
		else if(category == "Defense")
		{
			return defense;
		}
		else if(category == "Mechanism")
		{
			return mechanism;
		}
		else if(category == "Food")
		{
			return food;
		}
		else if(category == "Other")
		{
			return other;
		}
		else if(category == "Dye")
		{
			return dye;
		}
		else if(category == "Wool")
		{
			return wool;
		}
		else if(category == "Brewing")
		{
			return brewing;
		}
		else
			return null;
	}
	
	public void StardewValley()
	{
		String csvFile = "src/allcrafting-sdv.csv";
		
		ArrayList<String> list = new ArrayList<>();
		list = readWithBR(csvFile);
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

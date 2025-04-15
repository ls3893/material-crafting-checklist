import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Game
{
	public HashMap<String, HashMap<String, Integer>> Minecraft()
	{
		String csvFile = "src/allcrafting-mc.csv";
		
		ArrayList<String> list = new ArrayList<>();
		list = readWithBR(csvFile);
			
		HashMap<String, HashMap<String, Integer>> basic = new HashMap<>();
		HashMap<String, Integer> tempHM = new HashMap<>();
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).contains("Basic"))
			{
				String tempList1 = list.get(i);
				String[] tempList2 = tempList1.split(",");
				//System.out.println(Arrays.toString(tempList2));
					
					
				tempHM.put("Quantity", Integer.parseInt(tempList2[1]));
				basic.put(tempList2[2], tempHM);
					
				int k = 3, v = 4;
				for(int j = 0; j < tempList2.length-4; j+=2)
				{	
					tempHM.put(tempList2[k], Integer.parseInt(tempList2[v]));
					basic.put(tempList2[2], tempHM);
					k += 2;
					v += 2;
				}
				for(String z : basic.keySet())
				{
						System.out.println("key: " + z + "\nvalue" + basic.get(z));
				}
			}
		}
		
		return basic;
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

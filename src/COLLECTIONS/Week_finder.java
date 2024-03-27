package COLLECTIONS;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Week_finder 
{
 public static void main(String[] args) {
	Map <String,Integer> map = new HashMap<String,Integer>();
	map.put("Sun", 1);
	map.put("Mon", 2);
	map.put("Tue", 3);
	map.put("Wed", 4);
	map.put("Thu", 5);
	map.put("Fri", 6);
	map.put("Sat", 7);
	
	System.out.println();
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the day of week: ");
	String day = sc.nextLine();	

	int k = map.get(day);
	System.out.println(k);
	
	System.out.println("Enter the next day number :");
	int num = sc.nextInt();
	
	num = num-1; //5-1=4
	num=k+num;   //4+4
	
	if(num<8)
	{
		System.out.println("Next day should be :"+num);

		for(Map.Entry<String, Integer> ent : map.entrySet())
		{
			if(ent.getValue()==num)
			{
				System.out.println(ent.getValue());
				System.out.println(ent.getKey());
			}
		}}
	else
		if(num>=8)
		num= num-7;
	System.out.println("Next day should be :"+num);

	for(Map.Entry<String, Integer> ent:map.entrySet())
	{
		if(ent.getValue()==num)
		{
			System.out.println(ent.getKey());
		}
	}}
}

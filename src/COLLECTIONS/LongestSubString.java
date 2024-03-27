package COLLECTIONS;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class LongestSubString 
{
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string : ");
	String s = sc.nextLine();
	substring(s);
}
 static void substring(String s) 
{
	String sub = s.toLowerCase(); 
	char ch[]= sub.toCharArray();
	String longSub = null;
	int LenlonSub = 0;
	
	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	for (int i=0; i<ch.length; i++)
	{
		if(!map.containsKey(ch[i]))
		{
			map.put(ch[i],i);
			System.out.println(map);
		}
		
		//System.out.println("Input from Supriya:"+map);
		
		else {
			i =map.get(ch[i]);
		   map.clear();
		} 
		
		
		
		 if(map.size() > LenlonSub )
		 {
			 LenlonSub = map.size();
			 longSub = map.keySet().toString();
		 }    
	}
	
	System.out.println("Input from Supriya:"+map);
	System.out.println("Input string :"+sub);
	System.out.println("Length of longest Sub string :"+LenlonSub);
	System.out.println("Longest Sub string :"+longSub);
	
}	
	
}


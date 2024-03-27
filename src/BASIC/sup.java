package BASIC;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class sup 
{
public static void main(String[] args) 
{   String s = "Ssssuupriyaaa";
	String sub = s.toLowerCase(); 
	char ch[]= sub.toCharArray();
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	for (int i=0; i<ch.length; i++)
	{
		if(!map.containsKey(ch[i]))
		{
			map.put(ch[i],i);
	
		}
	}	
		System.out.println(map.keySet());
		
		
		for(Map.Entry<Character, Integer> ent : map.entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}

}
}

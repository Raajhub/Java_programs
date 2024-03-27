
package COLLECTIONS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccuranceOf_eachChar 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String str = sc.nextLine();
	
	charCount(str);			
}
 static void charCount(String s) {
  Map <Character,Integer> hm = new HashMap<Character, Integer>();
  
  System.out.println(hm);
  char [] ch = s.toCharArray();
  for(char c : ch)
  {
	  if(hm.containsKey(c))
	  {
	    hm.put(c, hm.get(c)+1);	  
	  }
	  else
	  {
		  hm.put(c, 1);
	  }
  }  
	  for (Map.Entry ent : hm.entrySet())
	  {
		  System.out.println(ent.getKey()+" "+ent.getValue());
	  }
	  
	  System.out.println(hm);
  }	
}

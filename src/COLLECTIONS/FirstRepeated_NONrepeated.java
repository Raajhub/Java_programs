package COLLECTIONS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeated_NONrepeated 
{
 public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String s = sc.nextLine();
	// = s.toCharArray();
	repeatNon(s);
 }

 private static void repeatNon(String s) 
 {
  Map <Character, Integer> map = new HashMap<Character, Integer>();
  
  char ch[] = s.toCharArray();
  
  for (char c : ch)
  { 
	  if(map.containsKey(c))
	  {
	    map.put(c,map.get(c)+1); 
	  }
  
	  else
	  {
		  map.put(c, 1);
	  }	  
  }
  
  System.out.println(map);  
  for(char c: ch)
  {
	  if(map.get(c) > 1)
	  {
		  System.out.println("First repeated character is :"+c);
	      break;
	  }
  }	  
	 for(char cc: ch)
	 {
		  if(map.get(cc) == 1)
		  {
			  System.out.println("First non repeated character is :"+cc);
		  }	  
	  break;
	 }
 }	 
}	 
	 
	 
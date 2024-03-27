package EXTRAA;

import java.util.HashMap;
import java.util.Map;

public class Jpmc 
{
 public static void main(String[] args) {
	
	 // 2045
	 
	// int i = 2045;  //11
	 
	// Integer a =i;
	 
	 
	 
	 String s = "My name is rajesh rajesh";
	 String str[] = s.split(" ");
	 
	 Map<String,Integer> map = new HashMap<String, Integer>();
	 
	 for(int i=0; i<=str.length-1; i++)
	 {
		 if(!map.containsKey(str[i]))
		 {
			 map.put(str[i], 1);   // my name is rajesh
		 }
	 }
	 
	// for (Map.Entry<S, V>)
		 
		 System.out.println(map.keySet().toString());
}
}

package EXTRAA;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Rsa 
{
 public static void main(String[] args) {
	//abcda /// sorting map values //
	 HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
	 
	 hm.put(1,'a');
	 hm.put(2, 'b');
	 hm.put(3, 'c');
	 hm.put(4, 'd');
	 hm.put(5, 'a');
	 
	 for(Entry<Integer, Character> ent : hm.entrySet())
	 {
		 System.out.println(ent.getKey()+"--"+ent.getValue());
	 }
	 

	 TreeMap<Integer, Character> tm = new TreeMap<Integer, Character>();

	 tm.putAll(hm);
	 System.out.println(tm);
}
}

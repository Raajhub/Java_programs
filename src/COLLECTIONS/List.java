package COLLECTIONS;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class List
{
 public static void main(String[] args) {
	
	Set<String> s = new HashSet<String>();
	s.add(null);
	s.add(null);
	System.out.println(s);
	
	ArrayList li = new ArrayList();
	li.add(5);
	li.add("abc");
	li.add(5);
	li.add("abc");
	
	System.out.println(li);
	System.out.println(li.remove(0));
	System.out.println(li.removeAll(li));
	System.out.println(li.addAll(0, s));
	System.out.println(li);

	
	//s.addAll(li);
	System.out.println(s);
	
	li.addAll(s);
	
	Set<Integer> set = new HashSet<Integer>();
	set.add(1);
	set.add(5);
	set.add(9);
	set.add(5);
	set.add(3);
	set.add(1);
	
	System.out.println(set);
	System.out.println(set.size());
	
	
	Iterator<Integer> it = set.iterator();
	while(it.hasNext()) {
	System.out.println("Iterator:"+it.next());}
	
	for(Integer i : set)
	{
		System.out.println("For-each :"+i);
		
	}
	
	
	
}
}

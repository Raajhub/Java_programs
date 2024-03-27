package Java_ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class Dup_elm_set 
{
 public static void main(String[] args) {
	
	 int [] a = { 5,0,3,0,9,5,3,1};
	 removeDupes(a);
	 
}

private static void removeDupes(int[] a) 
{
 Set<Integer> rem = new HashSet<Integer>();
 
 for(int i=0; i<=a.length-1; i++)
 {
	 rem.add(a[i]);
 }
	System.out.println(rem);
}
}

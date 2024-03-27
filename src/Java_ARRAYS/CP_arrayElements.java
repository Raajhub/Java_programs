package Java_ARRAYS;

import java.util.Arrays;

public class CP_arrayElements {
public static void main(String[] args) {
	
	int[] a = { 1,3,5,1,9,0};
	int []b = new int[a.length];
	
	System.out.print("Array elements are :");
	for(int i=0; i<=a.length-1; i++)
	{
		System.out.print(" "+a[i]);
	}
	
	System.out.println("\n"+"Printing array values :"+Arrays.toString(a));
	
	System.out.println("\n"+"Printing array values :"+Arrays.toString(b));

	for(int i=0; i<=a.length-1; i++)
	{
		b[i] = a[i];
	}
	
	System.out.println("\n"+"Printing array values :"+Arrays.toString(b));

	 for (Integer cp_b : b)
	 {
		 System.out.println(cp_b);
	 }
}
}

package Java_ARRAYS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_duplicateElm
{
 public static void main(String[] args) {
	
	 int a[] = {0, 9, 5, 0, 9, 3, 2, 5};
	 int b[] = new int [a.length];
	 System.out.println(Arrays.toString(b));
	 
	 int c=0;
	 for (int i=0; i<=a.length-1; i++)
	 {
		
		 for (int j=i+1; j<=a.length-1; j++)
		 {
			 if(a[i] == a[j])
			 {
				b[i] = a[j];
				 c++;
				 
				 
			 }
			 
			 
		 }
	
		
	 }
	 
	
	 System.out.println(c);
	 System.out.println(Arrays.toString(b));
}
}

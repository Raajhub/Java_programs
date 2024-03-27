package Java_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_zerOne 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of elements: ");
	int num = sc.nextInt();
	int[] n = new int[num];
	int temp;
	
	System.out.println("Enter the elements :");
	for (int i=0; i<=num-1; i++)
	{
		 n [i]= sc.nextInt();
	}
	
	for (int i=0; i<=num-1; i++)
	{
		for (int j=i+1; j<=num-1; j++)
		{
			if(n[i]>n[j])
			{
				temp = n[i];
				n[i] = n[j];
				n[j] =temp ;
			}
		}		
	}
	
	System.out.println(Arrays.toString(n));
	
	for (Integer i : n)
	{
		System.out.println(i);
	}

}
}

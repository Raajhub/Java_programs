package Java_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Zeros_Ones 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the array size :");
	int num = sc.nextInt();
	int a[] = new int[num];
	System.out.println("Enter Array elemetns :");
	
	for(int i=0; i<=a.length-1; i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Elemnets in the array : "+Arrays.toString(a));

	int one=0,zero=0;
	for(int i=0; i<=a.length-1;i++)
	{
		if(a[i]==1)
			one++;
			
		else
			if(a[i]==0)
			zero++;
		
		zero=a.length-one;
	}
	
	System.out.println("Ones :"+one+"\n"+"Zeroes :"+zero);
}
}

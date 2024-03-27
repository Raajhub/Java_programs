package BASIC;

import java.util.Scanner;

public class PrimeNo {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Number of user inputs :");
	int times=sc.nextInt();
	for (int i=1; i<=times; i++)
	{
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int count =0;
		for (int j=1; j<=num; j++)
	      {
			if(num % j == 0)
			{
			   count++;
				
		    }
	      }
		if(count ==2)
			System.out.println("The number "+num+" is Prime!");
		else
			System.out.println("The number "+num+" is NOT Prime!");

}
}
}
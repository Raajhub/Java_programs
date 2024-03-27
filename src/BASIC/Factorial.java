package BASIC;

import java.util.Scanner;

public class Factorial 
{
 public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.print("How many time you want to check: ");
	int times =sc.nextInt();
	for(int i=1; i<=times ; i++)
	{
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int fact=1;
	
		for(int j=1; j<=num; j++) 
		{
			fact=fact*j;
		}
		System.out.println("factorial of "+num+" is :"+fact);
}
	
	System.out.println(2 & 3);
}
}
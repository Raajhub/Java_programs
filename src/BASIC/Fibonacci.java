package BASIC;

import java.util.Scanner;

public class Fibonacci 
{
 @SuppressWarnings("unused")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the fib number :");
	int fib = sc.nextInt();
	System.out.println("no is :"+fib);
	int fib1=0, fib2=1;
	System.out.print(fib1+"-"+fib2);
	for(int i=3; i<=10; i++)
	{
		int fib3= fib1+fib2;
		fib1=fib2;
		fib2=fib3;
	System.out.print("-"+fib3);	

	}
	}
} 

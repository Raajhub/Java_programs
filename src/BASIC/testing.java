package BASIC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class testing
{ 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);	   
	    	System.out.print("Enter the number: ");
			int num = sc.nextInt();
			  
			  //armstrong(num);
			  //prime(num);
			  //palindrome(num);
				strong(num);
	}		  
	private static void strong(int num) 
	{
		int temp=num,fact=1,save=0;
		while(num!=0)
		{
			int rem = num % 10;
			for(int i=1; i<=rem; i++)
			{
				fact = fact *i;
			}
			 save =save+fact;
			num = num / 10;
			
		}
			if(temp==save)
				{
					System.out.println("Strong");
				}
		
	}
	private static void palindrome(int num)
	{
	  int rev=0, temp=num;
		while(num!=0)
		{
			int rem = num % 10;
			num = num / 10;
			rev = rem +(rev*10);
		}

		if(temp == rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("NOT");
	}
	private static void prime(int num) 
	{ int count =0;
		for(int i=1; i<=num; i++)
		{
			if(num % i == 0)
			{
				count ++;
			}
		}
		if(count ==2)
		{
			System.out.println("PRIME");
		}
		else
		{
			System.err.println("NOT");
		}
		
	}
	private static void armstrong(int num)
	{   int temp=num; int a=0;
		while(num!=0)
    	{  
    		int rem = num % 10;
    		a = a+ (rem*rem*rem);
    		num = num / 10;
    	}
    	if(a==temp)
    	{
    		System.out.println("Armastrong");
    		}
    			else
    				{
    					System.out.println("NOT");
    				}
		
	}
}


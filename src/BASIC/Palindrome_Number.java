package BASIC;

import java.util.Scanner;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of user inputs :");
		int times = sc.nextInt();
		for (int i = 1; i <= times; i++)
		 {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
            int temp = num; int rev=0, rem;
            while(num!=0)
            {
            	rem =num % 10;
            	num = num / 10;
            	rev =rem + (rev*10);
            }
            System.out.println("Reversal of "+temp+" is: "+rev);
            if(rev == temp)
            	System.out.println("The number "+temp+" is Palindrome");
            else
            	System.out.println("The number "+temp+" is NOT Palindrome");
		 }
}
}

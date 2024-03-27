package STRINGS;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the inputs: ");
	int times = sc.nextInt();
	String s2="";
	for (int i=1; i<=times; i++)
	{   
		System.out.println("Enter the string :");
		String s1 = sc.nextLine();
		String s = s1.toLowerCase();
		
		for(int j=s.length()-1; j>=0; j--)
		{
			s2 = s2 + s.charAt(j);
		}
	
		if(s2.equals(s))
			System.out.println(s+" is PALINDROME!");
		else
			System.out.println(s+" is NOT PALINDROME!");

	}
	
}
}

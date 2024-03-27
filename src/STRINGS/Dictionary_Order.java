
package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Dictionary_Order 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of inputs: ");
	int num = sc.nextInt();
	
	String s[] = new String[num];
	System.out.println(Arrays.toString(s));
	
	System.out.println(num);
	System.out.println(s.length);
	
	
	System.out.println("Enter the words :");
	for (int i=0; i<=s.length-1; i++)
	{
		s[i] = sc.nextLine();
		
	}
	
	for(int i=0; i<=s.length-1; i++)
	{
		for(int j=i+1; j<=s.length-1; j++)
		{
			if(s[i].compareToIgnoreCase(s[j])>0)
			  {
				String words = s[i];
				s[i] = s[j];
				s[j] = words;
			  }
			
		}
	}
	System.out.println(Arrays.toString(s));
}}
		 

	
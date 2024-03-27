package STRINGS;

import java.util.Scanner;

public class OccuranceOf_Each_Char 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string value: ");
	String str = sc.nextLine();
    
	char ch[] = str.toCharArray();
	
	for (int i=0; i<=ch.length-1; i++)
	{ 
		int count=1;
		for (int j=i+1; j<=ch.length-1; j++)
		{
			if(ch[i] == ch[j] && ch[j]!=' ')
			{
				count++;
				ch[j]=' ';
			}
		}
		if(ch[i]!=' ')
		System.out.println(ch[i]+" repeated --> "+count+" times");
	}
	 
}
}

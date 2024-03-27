package STRINGS;

import java.util.Arrays;

public class Lexico 
{
public static void main(String[] args) {
	String str[] = {"java" , "raj", "apple", "book","mac"};
	

	for(int i=0; i<=str.length-1; i++)
	{
		for(int j=i+1; j<=str.length-1; j++)
		{
			if(str[i].compareToIgnoreCase(str[j])>0)
			  {
				String words = str[i];
				str[i] = str[j];
				str[j] = words;
			  }
			
		}
	}
	System.out.println(Arrays.toString(str));
	
	System.out.println("\n"+"For each :");
	for (String s : str)
	{
		System.out.println(s);
	}
	
	System.out.println("\n"+" For loop :");
	for (int i=0; i<=str.length-1; i++)
	{
		System.out.println(str[i]);
	}
}

}

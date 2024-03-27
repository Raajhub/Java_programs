package STRINGS;

import java.util.Scanner;

public class test
{
 public static void main(String[] args) {
	String str = "How are you";
	
	String s[] = str.split(" ");
	
	System.out.println(s.length);
	//System.out.println(s.length);
	
	
	for (int i=0;i<s.length; i++)
	{
		for(int j=s[i].length()-1; j>=0; j--)
		{
			System.out.print(s[i].charAt(j));
		}
		System.out.print(" ");
	}
	System.out.print(" =========");
	
	char []ch= str.toCharArray();
	System.out.println(ch);
	for(int k=ch.length-1; k>=0; k--)
		
	{
		System.out.print(ch[k]);
	}
	
	Scanner sc = new Scanner(System.in);
	System.out.print("\n"+"Enter the string: ");
	String ss = sc.nextLine();
	char[] chh = ss.toCharArray();
	
	System.out.println(ss.length());
	System.out.println(chh.length);
	
	for(int i=0; i<=chh.length-1; i++)
	{    
		int count=1;
		for(int j=i+1; j<=chh.length-1; j++)
		{
			if(chh[i]==chh[j] && chh[j]!=' ')
				count++;
			  chh[j]=' ';
			
		}
		if(chh[i]!=' ')
			System.out.println(chh[i]+" --> "+count);
		
	}
	
	
}
}

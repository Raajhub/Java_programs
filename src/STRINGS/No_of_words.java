package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class No_of_words 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the sentence: ");
	String sen = sc.nextLine();
   
	int count=1;
	String s[] = sen.split(" ");
	System.out.println(Arrays.toString(s));
	System.out.println("word count :"+s.length);
	
	char ch[] =sen.toCharArray();
	System.out.println(ch.length);
	
	for (int i=0; i<=ch.length-1; i++)
	{
		if((sen.charAt(i) ==' ') && (sen.charAt(i+1) !=' '))
			count ++;
	}
	System.out.println("words:"+count);
	
	
	
	
	String s1 = "how are";
	int c=1;
	for (int j=0; j<=s1.length()-1;j++)
	{
	 if(s1.charAt(j)==' ' && (s1.charAt(j+1) != ' '))
	 {
		
		c++;
		
	 }
	}
	System.out.println(c);
}
}

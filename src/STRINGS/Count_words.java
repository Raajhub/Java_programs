package STRINGS;

import java.util.Scanner;

public class Count_words
{   public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String str = sc.nextLine();
	
	String s[] = str.split(" ");
	System.out.println(s.length);
	
	int count=1;
	for (int i=1; i<=str.length()-1; i++) 
	 {
	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
		count++;
	}
	System.out.print(count);
}
}

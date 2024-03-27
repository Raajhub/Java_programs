package STRINGS;

import java.util.Scanner;

public class Rem_spl_chars 
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: ");
	String str = sc.nextLine();
	
	String s= str.replaceAll("[^a-zA-Z0-9]","");
	
System.out.println("After removing spl chars :"+s);
}
}

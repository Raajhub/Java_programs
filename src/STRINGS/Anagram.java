package STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram 
{
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the strings: "); // Race- Care-> race-care
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	
	
	s1 = s1.toLowerCase();
	s2 = s2.toLowerCase();
	
	char ch1[] = s1.toCharArray();
	char ch2[] = s2.toCharArray();
	System.out.println(ch1);
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	boolean result = Arrays.equals(ch1, ch2);

	if (result)
		System.out.println(s1+" and "+ s2+" are ANAGRAM.");
	else
		System.out.println(s1+" and "+ s2+" are NOT ANAGRAM.");

}
}

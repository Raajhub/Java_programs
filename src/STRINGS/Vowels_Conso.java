package STRINGS;

import java.util.Scanner;

public class Vowels_Conso 
{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the sentence: ");
String s = sc.nextLine();
String str=s.toLowerCase();

int a= str.length();
int vow=0, con=0, space=0, spl;

for(int i=0; i<=str.length()-1; i++)
{
	if((str.charAt(i)=='a') || (str.charAt(i)=='e')|| (str.charAt(i)=='i') ||
			(str.charAt(i)=='o') || (str.charAt(i)=='u'))

		vow++;
	else
		if(str.charAt(i)==' ')
			space++;
				
}

con = str.length()-vow-space;

System.out.println("Total vowels are :"+vow);
System.out.println("Total consonanats are :"+ con);
System.out.println("Spaces are : "+ space);


}
}
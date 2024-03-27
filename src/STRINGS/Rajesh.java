package STRINGS;

import java.util.Scanner;

public class Rajesh 
{
 public static void main(String[] args)
 {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string: "); //r a J e s H
	String s = sc.nextLine();

	 char ch[] = s.toCharArray();
	 StringBuilder sb = new StringBuilder();
	 int low=0,up=0;
	 for(int i=0;i<=ch.length-1;i++)
	 {
		 if(Character.isLowerCase(ch[i]))
		 {
			 low++;
		 }
		 else
		 {
			 if(Character.isUpperCase(ch[i]))
			 {
				 up++;
			   System.out.println("UP : "+up);
			   System.out.println("LOW : "+low);
		 
			   String sub = s.substring(i-low, i+1);
			   System.out.println("SUB : "+sub);
		 
			 	for(int j=sub.length()-1;j>=0;j--)
			 	{
			 		sb.append(sub.charAt(j));
			 	}
			 	low=0;up=0;
	         }
		 }
	 }
	 
	 System.out.print(sb);
  }
}

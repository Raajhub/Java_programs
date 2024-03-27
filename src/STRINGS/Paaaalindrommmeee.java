package STRINGS;

public class Paaaalindrommmeee 
{
public static void main(String[] args) {
	String s = "gadag";
	String s1 = s.toLowerCase();
	String s2 = "";
	String s3="";
	
	char[] ch = s1.toCharArray();
	
	for (int i=s1.length()-1; i>=0; i--)
	{
	   s2= s2+ s1.charAt(i);
	}
	
      if(s2.equals(s1))
    		  System.out.println("\n"+"Palindrome");
      else
    	  System.out.println("NOT PALINDROME!!");
	
	for (int i=ch.length-1; i>=0; i--)
	{
		s3 = s3+ch[i];
	}
	
	if(s3.equals(s1))
		  System.out.println("\n"+"Palindrome");
else
	  System.out.println("NOT PALINDROME!!");

	
	System.out.println(s +"\t"+ s1+"\t"+ s2);
}

}

package STRINGS;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Palindromic_Substring 
{
public static void main(String[] args)
{	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string : ");
	String sub = sc.nextLine();
	plain(sub); 	
}
	 private static void plain(String input)
	 {
	    Set<String> palindromes = new HashSet<String>();
	    
	    for (int i = 0; i < input.length(); i++) 
	    {
	        palindromes.addAll(findPalindromes(input, i, i + 1));
	        palindromes.addAll(findPalindromes(input, i, i));
	    }
	    System.out.print(palindromes);
	}


	static Set<String> findPalindromes(String input, int low, int high) 
	{
	    Set<String> result = new HashSet<>();
	    while (low >= 0 && high < input.length() && input.charAt(low) == input.charAt(high))
	    {
	        result.add(input.substring(low, high + 1));
	        low--;
	        high++;
	    }
	   // System.out.println(result);
	    return result;
	}
}

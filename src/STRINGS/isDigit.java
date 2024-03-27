package STRINGS;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class isDigit 
{
public static void main(String[] args) {
	
	String s= " 12b";
	
	String rem = s.replaceAll("![^a-zA-Z0-9]", "");
	System.out.println("rem:"+rem);
	System.out.println(s.length());
	
	char []ch =s.toCharArray();
	
	for (int i=0; i<=ch.length-1; i++)
		{
		  
			if(Character.isAlphabetic(ch[i]) || Character.isDigit(ch[i]))
			{
				System.out.print("\n"+s.charAt(i));
			}
			
			else
				System.out.print("\n"+"special chars :"+ch[i]);
			
		}
	
	for (int i=0; i<=s.length()-1;i++)
	{
		Set<String> set = new HashSet<String>();
		set.add(s);
		System.out.println(set);
    }   
	
	
	
}
}
package EXTRAA;

import java.util.HashMap;

public class PrintOnlyDup_element {

	public static void main(String[] args)  throws ArrayIndexOutOfBoundsException
	{
		
		String str = "green apples are green apples";
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String s[] = str.split(" ");
		
		for (int i=0; i<=s.length-1; i++)
		{	
			if(!hm.containsKey(s[i]))
			{
				hm.put(s[i],i);
			}
			
			else
			{
				System.out.print(s[i]+"-");
			}

			
		}
		
			
	
	for (int i=0; i<=s.length-1; i++)
	{ 
		int c=0;
		for (int j=i+1; j<=s.length-1;j++)
		{
			if(s[i].equals(s[j]))
			{
				
				System.out.print("\t"+s[i]+"-");
			}
		
		}
		

	}

  }

}
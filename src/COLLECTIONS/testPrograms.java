package COLLECTIONS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class testPrograms
{
 public static void main(String[] args) 
 {
	 String str = "aa20bb30cc40dd50";
     // extrctANDadd(str);
      
   // Scanner sc = new Scanner(System.in);
  	//System.out.print("Enter the name: ");//Sushree
  //	String n = sc.nextLine();
  //	String name = n.toLowerCase();
  	//delRepChars(name);
  	int a[] = { 2, 5, 1, 2, 9, 5,0, 1, 2 };
  	deleteRepNumbers(a);
 } 

private static void delRepChars(String name) 
	{		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
			char ch[] = name.toCharArray();
			
			for (int i=0; i<= name.length()-1; i++)
			{
				if(!map.containsKey(ch[i]))
				{
					map.put(ch[i], i);
				}	
			}
			System.out.println(map.keySet());
			
			Set set = new HashSet();
			for (int i=0; i<=name.length()-1; i++)
			{
				set.add(name.charAt(i));
			}
			
			System.out.println(set);
			int c=0;
			for (int i=0; i<=name.length()-1; i++)
			{
				for (int j=i+1; j<=name.length()-1; j++)
				{
					if(name.charAt(i) == name.charAt(j) && ch[j]!='\0')
					{
						c++;
						ch[j]='\0';
						
					}
				}
				if(ch[i] != '\0')
				System.out.print(name.charAt(i));
			}
	
}

private static void extrctANDadd(String str) 
{	
		Matcher matcher = Pattern.compile("\\d+").matcher(str);

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		while (matcher.find()) 
		{
		    numbers.add(Integer.valueOf(matcher.group()));
		}
		
		System.out.println(numbers);
		Integer aa[] = new Integer [numbers.size()];
		numbers.toArray(aa);
		int ad=0;
		for (Integer sum : aa)
		{
			ad = ad +sum;
		}
		System.out.println("ADD :"+ad);
		
}			
	 
private static void deleteRepNumbers(int[] a) {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	for (int i =0 ; i< a.length-1 ; i=i+2)
	{  
		if(a[i] != a[i+1])
		{
			if(!al.contains(a[i]) && !al.contains(a[i+1]))
			{
				al.add(a[i]);
				al.add(a[i+1]);
			}
			else 
				if(!al.contains(a[i+1]))
				{
					al.add(a[i+1]);
				}
				else 
					if(!al.contains(a[i]))
					{
						al.add(a[i]);
					}
			
		}
	
		System.out.println(al);
	}
		
}

	
}

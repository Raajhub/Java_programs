package Java_ARRAYS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class MissingElmnt 
{
public static void main(String[] args) 
{  
	ArrayList<Integer> al = new ArrayList<Integer>();
	Set<Integer> set = new HashSet<Integer>();
	int a[] = { 1,2,4,5,7,9};

	Arrays.sort(a);
	
	 int mis=0;
	 int count=0; int temp=0;
	for(int i=0; i<a.length-1;i++)
	{
		 mis = 0;
			if(a[i+1]-a[i] != 1)
			{				
				//int temp = a[i+1];				
				mis = a[i]+1;
				count++;
				temp =mis;
				//a[i+2] =a[i+i];
			}
	 System.out.println(mis);
				if(mis!=0)
				{
					//System.out.print(temp+" ");
					
					set.add(temp);
					for(int k=0; k<a.length;k++)
					{
						set.add(a[k]);
					}
				
					//Collections.sort(set);
					System.out.println("Final: "+set);
			   }	
		}
	set.addAll(set);
	System.out.println("SET->"+set);
	}		
}

	
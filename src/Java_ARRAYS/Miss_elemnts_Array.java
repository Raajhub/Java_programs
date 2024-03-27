package Java_ARRAYS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Miss_elemnts_Array
{
public static void main(String[] args) 
{
	Set<Integer> set = new HashSet<Integer>();
	int[] arr={4,3,1};
    Arrays.sort(arr);
    
    for(int i=0;i<arr.length-1;i++)
    {   
        if(arr[i]+1!=arr[i+1])
        {
            System.out.println(arr[i]+1);
            set.add(arr[i]+1);        
        }
    }
  
  
    for (int i=0;i<arr.length;i++)
    {
    	set.add(arr[i]);
    }
    System.out.println(set);
}
}

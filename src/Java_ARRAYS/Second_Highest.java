package Java_ARRAYS;

import java.util.Arrays;

public class Second_Highest 
{
public static void main(String[] args) {
	int []a= { 5 ,7 ,4, 9, 0, 1, 8 };
	
	//System.out.println(Arrays.sort(a));
	
	for (int j=0; j<=a.length-1; j++)
	{   
		for (int k=j+1; k<=a.length-1; k++)
		{
			
			
			
			
			if(a[j] > a[k])
			{
				int temp = a[j];
				a[j] = a[k];
				a[k] = temp;
			}
	    }
	}
	
	System.out.println("Sorted array: "+Arrays.toString(a));
	//Arrays.sort(a);
	//System.out.println(Arrays.toString(a));
	
	int h=a.length-1;
	
	for (int i=0; i<=h; i++)
	{
		
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
//		if(a[i] == a[h])
//		{
//			System.out.println(a[h]);
//			
//		}
		
		break;
		
		
	}
}
}

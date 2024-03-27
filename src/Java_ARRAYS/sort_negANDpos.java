package Java_ARRAYS;

import java.util.Arrays;

public class sort_negANDpos 
{
	public static void main(String[] args) {
		
		int[] arr = { 5, -2, 7, 3, -8, -1 };
		
		sort(arr);
	}

	private static void sort(int[] a)
	{
		for (int i=0; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] =temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}

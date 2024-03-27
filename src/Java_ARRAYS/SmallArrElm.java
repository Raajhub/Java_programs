package Java_ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class SmallArrElm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.print("elements are :"+" ");
		for(int k=0;k<=size-1; k++)
		{
			
			 a[k] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
			smallest(a);
			SmallArrElm obj = new SmallArrElm();
			System.out.println("MIN :"+obj.smallest(a));
   }

	private static long smallest(int a[]) throws ArrayIndexOutOfBoundsException
{
			int min = 0;
			try {
				for (int i=1; i<= a.length-1;i++)
				{
					 min = a[0];
					 if (min > a[i])
					 {
						 min = a[i];
						
				     }

				 }
				//return a[0];
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getLocalizedMessage());
			}
				// System.out.print(min);
				return a[0];
			}
	 
		
	}

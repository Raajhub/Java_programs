package Java_ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestTryCatch {	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.print("elements are :"+" ");
		for (int i=1; i<=2; i++)
		{
			
		
		for(int k=0;k<=size-1; k++)
		{
			
			 a[k] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		//System.out.println(a ); // [hashcode
			smallest(a);
			SmallestTryCatch obj = new SmallestTryCatch();
			System.out.println(obj.smallest(a));	
	}	
	}

	private static long smallest(int[] a)
		{	
		int size =a.length;
		try
		{
			for (int i=0; i<= a.length-1;i++)
			{
			 for (int j=i+1; j<=a.length-1 ;j++)
			   {
				 if (a[i] > a[j])
				 {
					int temp = a[i];
					 a[i] = a[j];
					 a[j] = temp;
				 }
				 	
			   }
			 //System.out.print(a[0]);
			}
			// System.out.println("Small :"+a[0]);
			 //return 2; // try can have return st
		}
		

		catch (Exception e)		
		{
			System.out.println(e.getMessage());
			//return 2; // try can have return st
		}
		
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e.getMessage());
//			//System.out.println(e.hashCode());
//			//System.out.println(e.getLocalizedMessage());
//		}
		
		
		
		finally
		{
			
			System.out.println("finally for sure exec");
			
		}
		return a[0];
		
	}
		
	}


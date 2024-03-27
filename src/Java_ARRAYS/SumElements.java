package Java_ARRAYS;
import java.util.Arrays;
import java.util.Scanner;
public class SumElements
{
public static void main(String[] args) 
  { 
	Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number: ");
	int n = sc.nextInt();
	int a[] = new int[n];
	
   for(int j=0; j<n; j++)
   {
	  a[j] = sc.nextInt() ;//9
   }
   System.out.println(Arrays.toString(a));
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum=sum+a[i];
		
	}
	System.out.println(sum);
	
	System.out.println("REV: ");
	for (int i=a.length-1; i>=0;i--)
	{
		System.out.print(" "+a[i]);
	}
	// missing elements
	
	
	for(int i=0; i<a.length-1;i++)
	{
	
			if(a[i+1]-a[i] != 1)
			{
				a[i+1] = a[i]+1;
			}
			
		}
	
	System.out.println(Arrays.toString(a));
	}
	{
	}
	
}


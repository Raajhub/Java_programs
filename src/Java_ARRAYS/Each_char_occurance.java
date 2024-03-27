package Java_ARRAYS;

public class Each_char_occurance 
{
public static void main(String[] args) {
	int []a = {3, 5, 1, 9 ,5, 1, 0, 9, 5 };
	
	//int count =1;
	for(int i=0; i<=a.length-1; i++)
	{
		int count =1;
		for (int j=i+1; j<=a.length-1; j++)
		{
			
			if (a[i]== a[j] && a[j]!=0)
			{
				count ++ ;
			    a[j]=0;
			}
		}
		
		if(a[i]!=0)
		System.out.println(a[i]+ "-->" +count);
		
	 }
	}
	
}
//Sushree
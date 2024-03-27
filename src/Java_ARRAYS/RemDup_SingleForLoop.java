package Java_ARRAYS;

import java.util.ArrayList;

public class RemDup_SingleForLoop 
{
public static void main(String[] args) {
	int []a = {3, 3, 1, 9 ,5, 1, 0, 9, 5 };
		
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
			else
			System.out.print(al.add(a[i]));
		
		}
		System.out.println(al);

	}

}


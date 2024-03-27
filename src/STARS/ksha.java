package STARS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ksha 
{
 public static void main(String[] args)
 {

int []a = { 1,1,0,1,0,0,1,1};
int z=0,p=0;
	for (int i=0;i<a.length;i++)
	{   
		if(a[i] == 0)
		{
			z++;
		}
		else
			p++;
	  
	}
	System.out.println(z+"--"+p);
	
	for(int j=0; j<=a.length-1; j++)
	{
	
		for(int k=j+1; k<=a.length-1; k++)
		{
			if(a[j] > a[k])
			{
				int temp = a[j];
				a[j] = a[k];
				a[k] = a[temp];
			}
		}
	}
	
	System.out.println(Arrays.toString(a));
 }}

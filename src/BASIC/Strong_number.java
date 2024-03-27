package BASIC;

public class Strong_number 
{
 public static void main(String[] args) {
	int num = 145, temp=num; int save=0;
	int rem; //int fact=1;
	while(num!=0)
	{
		 int fact=1;
	    rem = num % 10;
		  for (int i=1; i<=rem; i++)
		  {
			 fact = fact*i;
		  }
		  
		  save =save+fact;
		  num = num / 10;
	}
	  System.out.println(save);
	  if(temp == save)
		  System.out.println("Given number "+temp+" is STRONG number!");

}
}

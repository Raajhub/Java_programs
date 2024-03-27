package EXTRAA;

public class Jpmc_intAdd {
public static void main(String[] args) 
{
		 int n = 45, add=0;  //11
		 int rem=0;
		// Integer a =i;	
	while (n!=0)
	{
		rem = n % 10;
		n = n / 10;
		add = add+rem; // 5 / 5+4 /9+0/9+2 =11
		
	}
	
	System.out.println(add);
	
	String s = "Gadag";
	s =s.toLowerCase();
	String str ="";
	for(int i=s.length()-1; i>=0; i--)
	{
		str = str+s.charAt(i);
	}
	
	if (s.equals(str))
		System.out.println("palindrome");
		
	
}
}

package STRINGS;

public class Rev_preserve
{
 public static void main(String[] args) {
	String m = "Mac";
	String b = "Book";
	String m1= m+b;
	//System.out.println(m1);
	
	String mb = "Mac Book";
	
	String s[] = mb.split(" ");
	
	for(int i=0; i<=s.length-1; i++)
	{
		//System.out.println(s[i]);
		
		for (int j=s[i].length()-1; j>=0; j--)
		{
			System.out.print(s[i].charAt(j));
		}
		System.out.print(" ");
	}	
}
}

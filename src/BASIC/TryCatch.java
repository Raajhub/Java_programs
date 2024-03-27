package BASIC;

public class TryCatch 
{
public static void main(String[] args) throws NumberFormatException, NullPointerException {
	
	String s = null;
	
	try
	{
		if(s.length()==1)
		{
			System.out.println("mac");
		}
	}
	catch (Exception e) {
		System.out.println(e.toString());
	}
	
	
	
	finally
	{
		System.out.println("finally for sure exec");
	}
	
	
	
}
}

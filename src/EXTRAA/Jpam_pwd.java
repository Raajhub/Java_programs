package EXTRAA;

public class Jpam_pwd
{
 public static void main(String[] args) 
 {
	//len 8 - 1 digit - 1 spl
	 String s = "Rajesh@1";
	 pwdVal(s);
 }
 
	private static void pwdVal(String s2) 
	 {
		try {
			
		
	 char ch[] = s2.toCharArray();
	 int alp=0; int dig=0; int spl=0;
	 for(int i=0; i<=ch.length-1; i++)
	 {
		 if(Character.isAlphabetic(ch[i]))
		 {
			 alp++; //111111
		 }
		 else if (Character.isDigit(ch[i]))
		 {
			 dig++; //1
		 }
		 else
		 {
			 spl++; //1
		 }
	 }
	 
	 System.out.println(alp+dig+spl);
	 System.out.println(alp);
	 System.out.println(dig); 
	 System.out.println(spl);
		}
	 catch(Exception e)
	 {
		 System.out.println("exception found!");
	 }
}
}

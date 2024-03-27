package EXTRAA;
import java.util.Scanner;
public class OnlySpecificChars_Codility
{

public static void main(String[] args) 
 {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Word: ");
	 String s = sc.nextLine();
	 Codility(s);	
	 System.out.println(Codility(s));
}

 public static boolean Codility(String s) 
 {
	for (int i=0; i<s.length()-1; i++)
	 {
		 
		 if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a')
		 {
			 return false;	
		 }
		 
	 }
	return true;
}

}

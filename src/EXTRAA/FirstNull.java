package EXTRAA;

public class FirstNull 
{
 static void stMethod()
 {
	 System.out.println("static method");
 }
 
 public static void main(String[] args) {
	
	 FirstNull fn =null;
	 fn.stMethod();
	 FirstNull.stMethod();
}
}

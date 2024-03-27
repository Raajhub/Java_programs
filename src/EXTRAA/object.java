package EXTRAA;

public class object
{
public static void main(String args)
{
	System.out.println("string args");
}

public static void main(int a) 
{
	System.out.println("int value");
}

public static void main(String[] args) {
	
	object o1 = new object();
	o1.getClass();
	o1.main(0);
	o1.main("aa");
	System.out.println(o1.hashCode());
	System.out.println(o1.toString());
	System.out.println(o1.getClass());
	
	
}

}

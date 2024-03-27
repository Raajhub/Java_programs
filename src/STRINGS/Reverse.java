package STRINGS;
public class Reverse {
public static void main(String[] args) {
	String m = "Mac";
	String b = "Book";
	
//	String s[] = m.split(" ");
//	char ch[] = m.toCharArray();
//	System.out.println(s.length);
//	System.out.println(ch.length);
//	
//	for(int i=ch.length-1; i>=0; i--)
//	{
//		System.out.print(ch[i]);
//	}
//	System.out.println("----");
	for(int i=m.length()-1; i>=0; i--)
	{
		System.out.print(m.charAt(i)+" ");
	}
	
	System.out.println("---Reverse a sentence----");
	String mb = "Mac book";
	System.out.println(mb.length());
	String mba[] = mb.split(" ");
	System.out.println(mba.length);
	char ch[] = mb.toCharArray();
	System.out.println(ch.length);
	
	for(int i=mb.length()-1; i>=0; i--)
	{
		System.out.print(mb.charAt(i));
	}
	System.out.println();
	for(int i=mba.length-1; i>=0; i--)
	{
		System.out.print(mba[i]+" ");
	}
	System.out.println();
	for(int i=ch.length-1; i>=0; i--)
	{
		System.out.print(ch[i]);
	}
}
}

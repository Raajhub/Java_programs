package STRINGS;

public class Split {
public static void main(String[] args) {
	String m = "Mac";
	String b = "Book";
	String s = "How are you?";
	String s1[] = s.split(" ");
	char ch[] = s.toCharArray();
	
	System.out.println(ch);
	System.out.println(ch.length);


	
	System.out.println(m.length());
	System.out.println(s.length());
	//System.out.println(s.split(" "));
	System.out.println(s1.toString());
	System.out.println(s1.length);
	for (int i=0; i<s1.length; i++)
	{
		System.out.println(s1[i]);
	}
	
	for (int j=0; j<ch.length; j++)
	{
		System.out.println(ch[j]);
	}




}
}

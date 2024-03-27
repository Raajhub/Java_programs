package STRINGS;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Pattern 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
System.out.print("Enter the string: ");
String s1 = sc.nextLine();

String c= "hjdg$h&jk8^i0ssh6";
Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
Matcher match= pt.matcher(c);
while(match.find())
{
    String s= match.group();
c=c.replaceAll("\\"+s, "");
}
System.out.println(c);
}

private Matcher matcher(String c) {
	// TODO Auto-generated method stub
	return null;
}

private static Pattern compile(String string) {
	// TODO Auto-generated method stub
	return null;
}
}

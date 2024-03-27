package LinkedIN;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputs {
public static void main(String[] args) throws IOException 
{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader rd = new BufferedReader(isr);
	 
	 String name = rd .readLine();
	 System.out.println(name);
	
}
}

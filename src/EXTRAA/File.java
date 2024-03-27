package EXTRAA;

import java.io.BufferedReader;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class File 
{
public static void main(String[] args) throws IOException {
	
	//java.io.File file = new java.io.File("/Users/rajeshvn/Documents/GIT/error.log");
	
	
		//FileInputStream fis = new FileInputStream(file); boo1234  error copy 2
		
		FileReader fr = new FileReader("/Users/rajeshvn/Documents/GIT/error.log");
		
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		
		String  rr ;
		System.out.println("File content: "+"\n");
		
		try {
			while((rr=br.readLine()) != null)
			{
				
				sb.append(rr+"\n");
				//sb.append("\n");
				
				//fr.close();
				
				//System.out.println(sb);
			}
			System.out.println(sb);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}




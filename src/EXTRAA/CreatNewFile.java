package EXTRAA;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatNewFile 
{
public static void main(String[] args) throws IOException
{	
	String foo1 = "/Users/rajeshvn/Documents/GIT/boo1234.log";
	creatNewFile(foo1);
	System.out.println(creatNewFile(foo1));

}	

private static boolean creatNewFile(String foo1) throws IOException 
{
	
	Path textFilePath = Paths.get(foo1);
	try {
	Files.createFile(textFilePath);
	return true;
	}
	catch (FileAlreadyExistsException e)
	{
		System.out.println(e.getMessage());
		//e.printStackTrace();
		System.out.println(e.toString());

	} 
	
	return false;
	
}
}

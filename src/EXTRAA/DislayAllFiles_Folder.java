package EXTRAA;

public class DislayAllFiles_Folder 
{
 public static void main(String[] args) {
	
	 System.out.println(" - - - - - - - -- - - -- - - -- - - -- - - -- - - -");
		java.io.File folder = new java.io.File("/Users/rajeshvn/Documents/GIT");
		
		String[] files = folder.list();

		for (String dir : files)
		{
			System.out.println(dir);
		}
		System.out.println(" - - - - - - - -- - - -- - - -- - - -- - - -- - - -");

		for (java.io.File obj : folder.listFiles())
		{
			System.out.println(obj);
		}
}
}

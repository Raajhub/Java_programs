package STRINGS;

public class Permutations 
{
	    // Function to print all the permutations of str
	    static void printPermutn(String str, String ans) 
	    {
	    	System.out.println(str +"--"+ans);
	        // If string is empty
	        if (str.length() == 0) 
	        {
	            System.out.print(ans + " "+"\n\n");
	            //return;
	        }
	        for (int i = 0; i < str.length(); i++)
	        {
	   
	            // ith character of str
	            char ch = str.charAt(i);
	            System.out.println(i+" pos ch value-->"+ch);

	            // Rest of the string after excluding the ith character
	            String s1=str.substring(0,i);
	            System.out.println("s1-->"+s1);
	            String s2=str.substring(i+1);
	            System.out.println("s1-->"+s2);
	           
	            String r = str.substring(0, i) + str.substring(i + 1);
	           // String r = s1+s2;
	            System.out.println("value of r -->"+r);

	            // Recurvise call
	            printPermutn(r, ans + ch);
	        }
	    }

	    // Driver code
	    public
	    static void main(String[] args) {
	        String s = "ab";
	        
	        printPermutn(s, "");
	    }
	}



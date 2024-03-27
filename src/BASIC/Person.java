package BASIC;

public class Person {
	// Driver Class
		    // main function
		    public static void main(String[] args)
		    {
		      
		    	Encapsulation en = new Encapsulation();
		    	en.setName("John");
		        en.setAge(30);
		 
		        // Using methods to get the values from the
		        // variables
		        System.out.println("Name: " + en.getName());
		        System.out.println("Age: " + en.getAge());
		    }
		}

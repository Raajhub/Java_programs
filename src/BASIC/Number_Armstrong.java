package BASIC;

public class Number_Armstrong {
public static void main(String[] args) {
	
	int num = 153; int arm=0;
	int temp = num;
	 while (num!=0)
	 {
		 int rem = num % 10;
		 arm = arm+ (rem*rem*rem);
		 num = num / 10;
		 
	 }
	 System.out.println(arm);
	 if(arm == temp)
		 System.out.println("Given number "+temp+" is Armstrong!");
}
}

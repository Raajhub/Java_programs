package EXTRAA;
import java.util.Scanner;

import java.util.Scanner;

public class SmallBigLetterFromPrevLetter {

public static boolean checkWord(String word){
   //you are getting length of "word" here
   int index=word.length()-1;
   for(int i=0;i<index;i++){
       if (word.charAt(i)<=word.charAt(i+1)){
           //If condition are correct return true.
           return true;
       }else{
           //If condition are incorrect return false
           return false;
       }
   }
   return true;
}
public static void main(String[] args) {
   String entry;
   //Printing a text
   System.out.println("input a word: ");
   //getting values from user
   Scanner s1=new Scanner(System.in);
   entry=s1.next();
   //calling a class
   checkWord(entry);
   //You have get the value. But, you are actually trying to say that 
   //why it's not printing in output. When you return something you have
   //to put them in another function to print-out
   System.out.println(checkWord(entry));
   //If you don't wanna do it than you have to write SOUT instead of return.
   //Than you can output the way you wrote
}
}

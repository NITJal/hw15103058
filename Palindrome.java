import java.util.*;
 
class Palindrome
{
   public static void main(String args[])
   {
      String str1, str2 = "";

      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to check if it is a palindrome");
      str1 = in.nextLine();
      int length = str1.length();
      for ( int i = length - 1; i >= 0; i-- )
       str2 = str2 + str1.charAt(i);
 
      if (str1.equals(str2))
         System.out.println("Palindrome");
      else
         System.out.println("Not a palindrome");
 
   }
}	

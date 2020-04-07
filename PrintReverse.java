import java.util.Scanner;
public class PrintReverse
{
   public static void main (String [] args)
   {
      Scanner scan = new Scanner (System.in);
      
      System.out.print("Enter the word u want to reverse : ");
      String word = scan.nextLine();
      
      int i = 0 ;
      for ( i = word.length()-1 ; i>=0 ; i--)
      {
         System.out.print (word.charAt(i));
      }
    }
}
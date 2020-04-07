import java.util.Scanner;
public class CountA //Question 2
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a String word :");
      String word = scan.nextLine();
      
      int sum =0;
      for (int i=0; i<word.length(); i++)
      {
         if (word.charAt(i) == 'A' || word.charAt(i) == 'a')
            sum ++;
      }
      
      System.out.println("The number of 'A' in the word is: " + sum );
   }
}

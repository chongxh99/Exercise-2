import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class RandomInRange
{
   public static void main ( String[] args )
   {
      Scanner scan = new Scanner (System.in);
      
      int random = 0 ;
      
      System.out.print ("Enter the first integer : ");
      int num1 = scan.nextInt();
      System.out.print ("Enter the second integer : ");
      int num2 = scan.nextInt();
      
      if ( num1 < num2 )
         random = ThreadLocalRandom.current().nextInt( num1-1 , num2+1);
      
      else 
         random = 0;
      
      System.out.println ("The random number in range " + num1 +" and "+ num2 +" is " + random );
    }
}
public class SquareCubed
{
   public static void main (String[] args)
   {
      final int LOWER = 0;
      final int UPPER = 10;
      
      System.out.println ("Number\tSquare\t\tCube");
      
      for (int i = LOWER; i < UPPER; i++)
      {
         System.out.println(i + "\t\t\t" + (int)Math.pow(i,3) +"\t\t\t" + (int)Math.pow(i,2));
      }
    }
}   
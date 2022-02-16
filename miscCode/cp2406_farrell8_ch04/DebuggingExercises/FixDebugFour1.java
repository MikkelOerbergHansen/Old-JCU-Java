// This program assigns values to two variables
// and performs mathematical operations with them
package miscCode.cp2406_farrell8_ch04.DebuggingExercises;

public class FixDebugFour1
{
   public static void main(String args[])
   {
      int x = 5;
      int y = 8;
      System.out.println("adding " + (x + y));

      int z = 19;
      System.out.println("subtracting "  + (z - y));

      System.out.println("dividing " + (double) z / x);
      System.out.println("multiplying " + (x * z));
   }
}
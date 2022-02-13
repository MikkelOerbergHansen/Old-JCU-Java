// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them

package DebuggingExercises;
import java.util.*;

public class FixDebugSeven2
{
   public static void main(String[] args)
   {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = 0;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine() + " ";
      length = str.length();
      for(x = start; x < length;)
      {
         int z = 0;
         if(str.charAt(x) != ' ')
         {
            int y = x + 1;
            while (str.charAt(y) != ' '){
               lastSpace +=1;
               z += 1;
               y += 1;
            }
             partStr = str.substring(x, lastSpace + 1);
             num = Integer.parseInt(partStr);
             System.out.println("                " + num);
             sum += num;
             //lastSpace += 1;
          }
         lastSpace +=1 ;

         x += z + 1;
      }

      System.out.println("         -------------------" +
         "\nThe sum of the integers is " + sum);
   }
}
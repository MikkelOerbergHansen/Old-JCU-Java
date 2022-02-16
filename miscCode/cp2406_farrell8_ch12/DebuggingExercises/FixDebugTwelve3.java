// Catch exceptions for array index out of bounds
// or dividing by 0 
package miscCode.cp2406_farrell8_ch12.DebuggingExercises;

import javax.swing.*;
public class FixDebugTwelve3
{
   public static void main(String[] args) throws ArithmeticException
   {
      String inStr;
      double result;
      int num;
      double[] array = {12, 4, 6, 8};
      inStr = JOptionPane.showInputDialog(null, "Enter a number ");
      num = Integer.parseInt(inStr);
      try
      {
         for(int x = 0; x < array.length; ++x)
         {
            if (num == 0)
               throw new ArithmeticException();
            result =  array[x] / num;
            JOptionPane.showMessageDialog(null, "Result of division is " + result);
            result = array[num];
            JOptionPane.showMessageDialog(null, "Result accessing array is " + result);
         }
      }
      catch(ArithmeticException error)
      {
          JOptionPane.showMessageDialog(null, "Arithmetic error - division by 0");   
      }
      catch(IndexOutOfBoundsException error)
      {
         JOptionPane.showMessageDialog(null, "Index error - subscript out of range");
      }
   }
}
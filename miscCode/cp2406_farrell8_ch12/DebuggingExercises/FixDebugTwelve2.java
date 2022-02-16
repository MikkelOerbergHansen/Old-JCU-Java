// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
package miscCode.cp2406_farrell8_ch12.DebuggingExercises;

public class FixDebugTwelve2
{
   public static void main(String[] args) throws ArithmeticException
   {
      byte num1 = 120, num2 = 120, result;
      byte num3 = 6, num4 = 120;
      final byte HIGHBYTE = 127;
      try
      {
         byte allowed = (byte) (HIGHBYTE - num1);
         if(num2 > allowed)
            throw(new ArithmeticException());
         result = (byte)(num1 + num2);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }

      try
      {
         byte allowed = (byte) (HIGHBYTE - num3);
         if(num4 > allowed)
            throw(new ArithmeticException());
         result = (byte)(num3 + num4);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }



   }
}
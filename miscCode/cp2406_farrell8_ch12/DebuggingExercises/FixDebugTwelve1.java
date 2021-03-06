// This class determines the logarithm of a number
package miscCode.cp2406_farrell8_ch12.DebuggingExercises;

public class FixDebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = -8.8, result;
     double num2 = 8.8;
     try
     {
        if(num <= 0)
           throw(new ArithmeticException());
        result = Math.log(num);
        System.out.println("Result is " + result);

     }
     catch(ArithmeticException e)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }

     try
      {
          if(num2 <= 0)
              throw(new ArithmeticException());
          result = Math.log(num2);
          System.out.println("Result is " + result);

      }
      catch(ArithmeticException e)
      {
          System.out.println("Can't take logarithm for value of zero or lower");
      }


  }
}
// This application gets a user's name and displays a greeting

package miscCode.cp2406_farrell8_ch03.DebuggingExercises;

import java.util.Scanner;

public class FixDebugThree3
{
   public static void main(String args[])
   {
      String name;
      name = getName();
      displayGreeting(name);           
   }
   private static String getName()
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name" );
      name = input.next();
      return name;
   }
   private static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}

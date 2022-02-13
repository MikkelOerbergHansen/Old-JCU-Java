// Program displays some facts about a string
package DebuggingExercises;

public class FixDebugSeven3
{
   public static void main(String[] args)
   { 
      String quote =
        "Honesty is the first chapter in the book of wisdom. - Thomas Jefferson";

      System.out.println("index.of('f') is: " + quote.indexOf('f')); //15
      System.out.println("index.of('x') is: " + quote.indexOf('x')); //never = -1
      System.out.println("char.At(5) is: " + quote.charAt(5)); //t
      System.out.println("endsWith(\"daughter\") is: " + quote.endsWith("daughter")); //false
      System.out.println("endsWith(\"son\") is: " + quote.endsWith("son")); //true
      System.out.println("replace('e', 'M') is: " + quote.replace('e', 'M'));
   }
}
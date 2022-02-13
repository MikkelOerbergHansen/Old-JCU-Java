// Allows user to enter a series of words
// and displays them in reverse order
package DebuggingExercises;
import javax.swing.*;
public class FixDebugEight4
{
   public static void main(String[] args)
   {
      int x = 0, y;
      String array[] = new String[100];
      String entry;
      final String STOP = "XXX";
      StringBuffer message = new
          StringBuffer("The words in reverse order are\n");
     
      entry = JOptionPane.showInputDialog(null,
        "Enter any word\n" +
        "Enter " + STOP + " when you want to stop");
      while(!(entry.equals(STOP)))
      {
         array[x] = entry;
         entry = JOptionPane.showInputDialog(null,
            "Enter another word\n" +
            "Enter " + STOP + " when you want to stop");
         x += 1;
      }
      System.out.println(array.length);
      for(y = array.length - 1; y >= 0; --y){
         if (array[y] == null)
            continue;
         message.append(array[y]);
         message.append(" ");}
      JOptionPane.showMessageDialog(null, message);
   }
}


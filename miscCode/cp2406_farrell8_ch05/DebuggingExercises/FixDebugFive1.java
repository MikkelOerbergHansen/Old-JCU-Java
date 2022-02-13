// FixDebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
package DebuggingExercises;
import javax.swing.*;
public class FixDebugFive1
{
   public static void main(String args[]) throws Exception
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
      int usersChoice1 = 0;
      int usersChoice2 = 0;
      double bill = 0.00;

      while (usersChoice1 < 1 || usersChoice1 > 4) {
         try {
            usersChoiceString = JOptionPane.showInputDialog(null,
                    "Order please\n1 - Burger\n2 - Hotdog" +
                               "\n3 - Grilled cheese\n4 - Fish sandwich");
            if (usersChoiceString == null)
               System.exit(0);
            usersChoice1 = Integer.parseInt(usersChoiceString);
            if (usersChoice1 < 1 || usersChoice1 > 4)
               throw new Exception();
         } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Invalid Choice! \n\n" + "Your choice must " +
                       "be an integer between 1 and 4");
         }
      }

      if(usersChoice1 == 1 || usersChoice1 == 2)
         bill = bill + HIGH_PRICE;
      else
         bill = bill + MED_PRICE;

      while (usersChoice2 < 1 || usersChoice2 > 2) {
         try {
            usersChoiceString = JOptionPane.showInputDialog(null,
                    "Fries with that?\n1 - Yes\n2 - No");
            if (usersChoiceString == null)
               System.exit(0);
            usersChoice2 = Integer.parseInt(usersChoiceString);
            if (usersChoice2 < 1 || usersChoice2 > 2)
               throw new Exception();
         }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Choice! \n\n" + "Your choice must " +
                    "be an integer between 1 and 2");
         }
      }

      if (usersChoice2 == 1)
         bill = bill + LOW_PRICE;
      if (bill == 0.0)
         throw new Exception("THIS IS NOT SUPPOSE TO HAPPEN");
      JOptionPane.showMessageDialog(null,"Bill is " + bill);
   }
}

package ProgrammingExercises;

import javax.swing.*;
import java.util.Arrays;

public class AscendingAndDescending {
    public static void main(String args[])
    {
        int userNumber1 = -1;
        int userNumber2 = -1;
        int userNumber3 = -1;
        String userNumberString;

        while (userNumber1 < 0 ) {
            try {
                userNumberString = JOptionPane.showInputDialog(null,
                        "Input the first integer: ");
                if (userNumberString == null)
                    System.exit(0);
                userNumber1 = Integer.parseInt(userNumberString);
                if (userNumber1 < 0)
                    throw new Exception();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input! \n\n" + "Must be an integer" +
                        " > 0");
            }
        }

        while (userNumber2 < 0 ) {
            try {
                userNumberString = JOptionPane.showInputDialog(null,
                        "Input the second integer: ");
                if (userNumberString == null)
                    System.exit(0);
                userNumber2 = Integer.parseInt(userNumberString);
                if (userNumber2 < 0)
                    throw new Exception();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input! \n\n" + "Must be an integer" +
                        " > 0");
            }
        }


        while (userNumber3 < 0 ) {
            try {
                userNumberString = JOptionPane.showInputDialog(null,
                        "Input the third integer: ");
                if (userNumberString == null)
                    System.exit(0);
                userNumber3 = Integer.parseInt(userNumberString);
                if (userNumber3 < 0)
                    throw new Exception();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input! \n\n" + "Must be an integer" +
                        " > 0");
            }
        }

        int[] ints = {userNumber1, userNumber2, userNumber3};
        Arrays.sort(ints);
        JOptionPane.showMessageDialog(null,"Numbers in Ascending order: \n" +
                Arrays.toString(ints));

        if (userNumber1 <= userNumber2 && userNumber1 <= userNumber3)
            if (userNumber2 <= userNumber3)
                JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                    "[" + userNumber3 + ", " + userNumber2 + ", " + userNumber1 + "]");
            else JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                    "[" + userNumber2 + ", " + userNumber3 + ", " + userNumber1 + "]");

        if (userNumber2 < userNumber1 && userNumber2 <= userNumber3)
            if (userNumber1 <= userNumber3)
                JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                     "[" + userNumber3 + ", " + userNumber1 + ", " + userNumber2 + "]");
            else JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                    "[" + userNumber1 + ", " + userNumber3 + ", " + userNumber2 + "]");

        if (userNumber3 < userNumber1 && userNumber3 < userNumber2)
            if (userNumber1 <= userNumber2)
                JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                        "[" + userNumber2 + ", " + userNumber1 + ", " + userNumber3 + "]");
            else JOptionPane.showMessageDialog(null,"Numbers in Descending order: \n" +
                    "[" + userNumber1 + ", " + userNumber2 + ", " + userNumber3 + "]");
    }
}

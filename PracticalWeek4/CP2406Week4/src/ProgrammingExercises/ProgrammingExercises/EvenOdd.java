package ProgrammingExercises;

import javax.swing.*;

public class EvenOdd {
    public static void main(String args[])
    {
        int userNumber = 0;
        String userNumberString;

        while (userNumber < 1 ) {
            try {
                userNumberString = JOptionPane.showInputDialog(null,
                        "Input an integer: ");
                if (userNumberString == null)
                    System.exit(0);
                userNumber = Integer.parseInt(userNumberString);
                if (userNumber < 1)
                    throw new Exception();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid input! \n\n" + "Must be an integer" +
                        " > 1");
            }
        }

        if(userNumber % 2 == 0)
            JOptionPane.showMessageDialog(null,"Number is Even ");
        else
            JOptionPane.showMessageDialog(null,"Number is Odd ");
    }
}

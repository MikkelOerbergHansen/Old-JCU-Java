package ProgrammingExercises;

import javax.swing.JOptionPane;

public class Initials {
    public static void main(String[] args)
    {
        char InitialFirstName;
        char InitialMiddleName;
        char InitialLastName;
        String FirstName;
        String MiddleName;
        String LastName;
        FirstName = JOptionPane.showInputDialog(null, "Enter your first name",
                JOptionPane.INFORMATION_MESSAGE);
        MiddleName = JOptionPane.showInputDialog(null, "Enter your Middle name",
                JOptionPane.INFORMATION_MESSAGE);
        LastName = JOptionPane.showInputDialog(null, "Enter your Last name",
                JOptionPane.INFORMATION_MESSAGE);

        InitialFirstName = FirstName.substring(0, 1).toUpperCase().charAt(0);
        InitialMiddleName = MiddleName.substring(0, 1).toUpperCase().charAt(0);
        InitialLastName = LastName.substring(0, 1).toUpperCase().charAt(0);

        JOptionPane.showMessageDialog(null, "Your Initials are " +
                InitialFirstName + "." + InitialMiddleName + "." + InitialLastName + ".");
    }
}

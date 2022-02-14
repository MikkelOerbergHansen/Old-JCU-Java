package ProgrammingExercises;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Alphabetize {
    public static void main(String[] args) {
        String String1;
        String String2;
        String String3;
        boolean Alphabetized;

        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();

        Object[] message = {
                "Please enter 3 Strings", "\n",
                "String 1: ", field1,
                "String 2: ", field2,
                "String 3: ", field3,
        };

        int option = JOptionPane.showConfirmDialog(null, message,
                "Alphabetize", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String1 = field1.getText();
            String2 = field2.getText();
            String3 = field3.getText();

            List<String> myStrings = Arrays.asList(String1, String2, String3);
            Alphabetized = isSorted(myStrings);
            if (Alphabetized)
                JOptionPane.showMessageDialog(null, "The String  is in alphabetical order");
            else
                JOptionPane.showMessageDialog(null, "The String  is NOT in alphabetical order");

        }
        if (option == JOptionPane.CANCEL_OPTION) {
            System.exit(0);
        }
    }
    private static boolean isSorted(List<String> list) {

        // Copies all of the elements from one list into another.
        List<String> listSorted = new ArrayList<>(list);

        // Sorts the new list.
        listSorted.sort(String.CASE_INSENSITIVE_ORDER);

        // Check if both of list are equals.
        return listSorted.equals(list);
    }




}

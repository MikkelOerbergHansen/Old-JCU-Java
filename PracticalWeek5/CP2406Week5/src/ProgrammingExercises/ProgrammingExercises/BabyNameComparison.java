package ProgrammingExercises;

import javax.swing.*;

public class BabyNameComparison {
    public static void main(String[] args)
    {
        String Name1;
        String Name2;
        String Name3;

        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();

        Object[] message = {
                "Please enter 3 first names", "\n",
                "Name 1: ", field1,
                "Name 2: ", field2,
                "Name 3: ", field3,
        };

        int option = JOptionPane.showConfirmDialog(null, message,
                "Baby Name Comparison", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION){
            Name1 = field1.getText();
            Name2 = field2.getText();
            Name3 = field3.getText();

            String Option1 = "Option 1: " + Name1 + " " + Name2;
            String Option2 = "Option 2: " + Name1 + " " + Name3;
            String Option3 = "Option 3: " + Name2 + " " + Name1;
            String Option4 = "Option 4: " + Name2 + " " + Name3;
            String Option5 = "Option 5: " + Name3 + " " + Name1;
            String Option6 = "Option 6: " + Name3 + " " + Name2;

            JOptionPane.showMessageDialog(null,"The possible two-name combinations are: \n" +
                    Option1 + "\n" + Option2 + "\n" + Option3 + "\n" + Option4 + "\n" + Option5 + "\n" + Option6);

        }
        if (option == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }

    }
}

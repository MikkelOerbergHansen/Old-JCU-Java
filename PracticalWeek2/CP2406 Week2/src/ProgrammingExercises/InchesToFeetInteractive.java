package ProgrammingExercises;

import javax.swing.JOptionPane;

public class InchesToFeetInteractive {
    public static void main(String[] args)
    {
        int InchToFeet = 12;
        String inches ;
        int Inch;
        inches = JOptionPane.showInputDialog(null, "Enter number of Inches",
                JOptionPane.INFORMATION_MESSAGE);
        Inch = Integer.parseInt(inches);
        JOptionPane.showMessageDialog(null,Inch + " Inches corresponds to " +
                (Inch / InchToFeet) + " feet and " + (Inch % InchToFeet) + " inches");
    }
}

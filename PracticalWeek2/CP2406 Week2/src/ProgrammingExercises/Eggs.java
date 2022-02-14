package ProgrammingExercises;

import javax.swing.JOptionPane;

public class Eggs {
    public static void main(String[] args)
    {
        int dozen = 12;
        double priceDozen = 3.25;
        int eggs;
        double priceEggs = 0.45;
        String NumberOfEggs ;
        NumberOfEggs = JOptionPane.showInputDialog(null, "Enter the number of Eggs",
                JOptionPane.INFORMATION_MESSAGE);
        eggs = Integer.parseInt(NumberOfEggs);
        JOptionPane.showMessageDialog(null,"You ordered " + eggs + " eggs, that's " +
                (eggs / dozen) + " dozen at $" + priceDozen + " per dozen, and " + (eggs % dozen) + " loose eggs at " +
                (int)(priceEggs * 100) + " cents each, for a total of $" + ((eggs / dozen * priceDozen) +
                (eggs % dozen) * priceEggs));
    }
}

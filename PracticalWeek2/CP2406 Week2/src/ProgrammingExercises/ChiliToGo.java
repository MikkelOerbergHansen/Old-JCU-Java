package ProgrammingExercises;

import javax.swing.JOptionPane;

public class ChiliToGo {
    public static void main(String[] args)
    {
        int AdultPrice = 7;
        int ChildPrice = 4;
        int AdultNumber;
        int ChildNumber;
        String NumberOfAdults ;
        String NumberOfChildren ;
        NumberOfAdults = JOptionPane.showInputDialog(null, "Enter the number of adult meals",
                JOptionPane.INFORMATION_MESSAGE);
        AdultNumber = Integer.parseInt(NumberOfAdults);
        NumberOfChildren = JOptionPane.showInputDialog(null, "Enter the number of child meals",
                JOptionPane.INFORMATION_MESSAGE);
        ChildNumber = Integer.parseInt(NumberOfChildren);
        JOptionPane.showMessageDialog(null,"You ordered " + AdultNumber + " Adult meals at a" +
                " total of $" + (AdultNumber * AdultPrice) + "\n And you ordered " + ChildNumber + " Child meals at a" +
                " total of $" + (ChildNumber * ChildPrice) + "\n Your Total Price is $" + ((AdultNumber * AdultPrice) +
                (ChildNumber * ChildPrice)));
    }
}

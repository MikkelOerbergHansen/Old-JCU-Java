package ProgrammingExercises;

import javax.swing.JOptionPane;

public class ChiliToGoProfit {
    public static void main(String[] args)
    {
        int AdultPrice = 7;
        int ChildPrice = 4;
        double AdultProductionCost = 4.35;
        double ChildProductionCost = 3.10;
        int AdultNumber;
        int ChildNumber;
        int AdultTotal;
        int ChildTotal;
        double AdultProfit;
        double ChildProfit;
        String NumberOfAdults ;
        String NumberOfChildren ;
        NumberOfAdults = JOptionPane.showInputDialog(null, "Enter the number of adult meals",
                JOptionPane.INFORMATION_MESSAGE);
        AdultNumber = Integer.parseInt(NumberOfAdults);
        AdultTotal = AdultNumber * AdultPrice;
        AdultProfit = (AdultTotal) - (AdultNumber * AdultProductionCost);
        NumberOfChildren = JOptionPane.showInputDialog(null, "Enter the number of child meals",
                JOptionPane.INFORMATION_MESSAGE);
        ChildNumber = Integer.parseInt(NumberOfChildren);
        ChildTotal = ChildNumber * ChildPrice;
        ChildProfit = ChildTotal - (ChildNumber * ChildProductionCost);
        JOptionPane.showMessageDialog(null,"The Order was " + AdultNumber + " Adult meals at a" +
                " total of $" + (AdultTotal) + " which gives a profit of $" + String.format("%.2f", AdultProfit)
                + "\n And " + ChildNumber + " Children meals at a" +
                " total of $" + (ChildTotal) + " which gives a profit of $" + String.format("%.2f", ChildProfit)
                + "\n The Total Price was $" + (AdultTotal + ChildTotal) +
                " And the total profit is $" + String.format("%.2f", (AdultProfit + ChildProfit)));
    }
}

package ProgrammingExercises;

import javax.swing.*;

public class CarCareChoice {
    public static void main (String[] args)
    {
        boolean isMatch = false;
        String[] items =  { "oil change", "tire rotation",
                "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int x;
        int matchIndex = 0;
        StringBuilder menu = new StringBuilder("Enter selection:");
        for(x = 0; x < items.length; ++x)
            menu.append("\n  - ").append(items[x]);
        String selection = JOptionPane.showInputDialog(null, menu.toString());
        if (selection == null){
            System.exit(0);
        }
        for (x = 0; x < items.length; x++)
            if(selection.toLowerCase().equals(items[x]))
            {
                isMatch = true;
                matchIndex = x;
            }
        if(isMatch)
            JOptionPane.showMessageDialog(null,
                    selection.toLowerCase() + " price is $" + prices[matchIndex]);
        else
            JOptionPane.showMessageDialog(null, "Invalid Entry");
    }

}

package ProgrammingExercises;

import javax.swing.*;

public class CarCareChoice2 {
    public static void main (String[] args)
    {
        boolean isMatch = false;
        String[] items =  { "oil change", "tire rotation",
                "battery check", "brake inspection"};
        int[] prices = {25, 22, 15, 5};
        int x;
        int matchIndex = 0;
        StringBuilder menu = new StringBuilder("Enter your choice:");
        for(x = 0; x < items.length; ++x)
            menu.append("\n  - ").append(items[x]);
        String selection = JOptionPane.showInputDialog(null, menu.toString());
        for (x = 0; x < items.length; x++)
            if(selection.substring(0, 3).toLowerCase().equals(items[x].substring(0, 3)))
            {
                isMatch = true;
                matchIndex = x;
            }
        if(isMatch)
            JOptionPane.showMessageDialog(null,
                    items[matchIndex] + " The Price is $" + prices[matchIndex]);
        else
            JOptionPane.showMessageDialog(null, "Sorry! Invalid Entry");
    }
}

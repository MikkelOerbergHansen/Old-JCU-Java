package ProgrammingExercises;

import javax.swing.JOptionPane;

public class CraftPricing {
    public static void main(String[] args) {
        String ProductName;
        String InpMaterialCost;
        int MaterialCost;
        String InpHours;
        int Hours;
        int retailPrice;
        ProductName = JOptionPane.showInputDialog(null, "Enter the name of the product: ",
                JOptionPane.INFORMATION_MESSAGE);
        InpMaterialCost = JOptionPane.showInputDialog(null, "Enter the cost of materials: ",
                JOptionPane.INFORMATION_MESSAGE);
        MaterialCost = Integer.parseInt(InpMaterialCost);
        InpHours = JOptionPane.showInputDialog(null, "Enter the number of work hours required",
                JOptionPane.INFORMATION_MESSAGE);
        Hours = Integer.parseInt(InpHours);
        retailPrice = GetPrice(MaterialCost, Hours);
        JOptionPane.showMessageDialog(null,"The price for a " + ProductName +
                " is $" + retailPrice);
    }
    private static int GetPrice(int MaterialCost, int Hours)
    {
        int Shipping = 7;
        int Price;
        Price = (MaterialCost + 12) * Hours + Shipping;
        return Price;
    }
}

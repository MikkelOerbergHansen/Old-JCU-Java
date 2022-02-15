package ProgrammingExercises;

import javax.swing.*;

public class Package {
    public int Weight;
    public char Shipping;
    public double Cost;

    public Package(int packageWeight, String shippingChoice) {
        Weight = packageWeight;
        Shipping = shippingChoice.charAt(0);
        Cost = CalculateCost();
    }

    public void display()
    {
        String ShippingMethod = "";
        if (Shipping == "A".charAt(0)){
            ShippingMethod = "Air";}
        else if (Shipping == "M".charAt(0)) {
            ShippingMethod = "Mail";
        }
        else if (Shipping == "T".charAt(0)){
            ShippingMethod = "Truck";
        }

        JOptionPane.showMessageDialog(null,"The package weigh:  " + Weight +
                " \n The Shipping Method is: " + ShippingMethod + " \n The cost is: $" +
                Cost);
    }





    public double CalculateCost() {
        double ShippingCost = 0;
        if (Weight >= 1 && Weight < 9) {
            if (Shipping == "A".charAt(0)) {
                ShippingCost = 2;
            } else if (Shipping == "T".charAt(0)) {
                ShippingCost = 1.5;
            } else if (Shipping == "M".charAt(0)) {
                ShippingCost = 0.5;
            }
        } else if (Weight >= 9 && Weight < 17) {
            if (Shipping == "A".charAt(0)) {
                ShippingCost = 3;
            } else if (Shipping == "T".charAt(0)) {
                ShippingCost = 2.35;
            } else if (Shipping == "M".charAt(0)) {
                ShippingCost = 1.5;
            }
        } else if (Weight >= 17) {
            if (Shipping == "A".charAt(0)) {
                ShippingCost = 4.5;
            } else if (Shipping == "T".charAt(0)) {
                ShippingCost = 3.25;
            } else if (Shipping == "M".charAt(0)) {
                ShippingCost = 2.15;
            }
        }
        return ShippingCost;
    }




}




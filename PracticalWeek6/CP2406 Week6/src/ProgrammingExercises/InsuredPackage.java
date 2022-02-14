package ProgrammingExercises;

import javax.swing.*;

public class InsuredPackage extends Package {
    public double InsuredCost;


    public InsuredPackage(int packageWeight, String shippingChoice) {
        super(packageWeight, shippingChoice);
        InsuredCost = CalculateInsuredCost();
    }

    private double CalculateInsuredCost() {
        double extraCost = 0;
        if (Cost > 0 && Cost <= 1.00){
            extraCost = 2.45;
        }
        else if (Cost > 1.00 && Cost <= 3.00){
            extraCost = 3.95;
        }
        else {
            extraCost = 5.5;
        }
        return (Cost + extraCost);
    }

    @Override
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
                " \n The Shipping Method is: " + ShippingMethod + " \n With insurance The cost is: $" +
                InsuredCost);
    }


}

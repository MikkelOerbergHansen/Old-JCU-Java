package ProgrammingExercises;

import javax.swing.JOptionPane;

public class MetricConversion {
    public static void main(String[] args) {
        int Number;
        String Input;
        Input = JOptionPane.showInputDialog(null, "Enter the number for conversion: ",
                JOptionPane.INFORMATION_MESSAGE);
        Number = Integer.parseInt(Input);
        ConvertInches(Number);
        ConvertGallons(Number);
    }
    private static void ConvertInches(int Inches)
    {
        double CentimeterInInch = 2.54;
        double Centimeter;
        Centimeter = Inches * CentimeterInInch;
        JOptionPane.showMessageDialog(null,Inches + " Inches corresponds to " + Centimeter +
                " centimeter");
    }
    private static void ConvertGallons(int Gallons)
    {
        double LitersInGallon = 3.7854;
        double Liters;
        Liters = Gallons * LitersInGallon;
        JOptionPane.showMessageDialog(null,Gallons + " Gallons corresponds to " + Liters +
                " Liters");
    }
}

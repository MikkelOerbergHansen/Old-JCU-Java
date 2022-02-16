package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

import javax.swing.JOptionPane;

public class PaintCalculator {
    public static void main(String[] args) {
        double length;
        double width;
        double height;
        double price;
        String inpLength;
        String inpHeight;
        String inpWidth;
        inpLength = JOptionPane.showInputDialog(null, "Enter the Length of the room: ",
                JOptionPane.INFORMATION_MESSAGE);
        length = Integer.parseInt(inpLength);
        inpHeight = JOptionPane.showInputDialog(null, "Enter the Height of the room: ",
                JOptionPane.INFORMATION_MESSAGE);
        height = Integer.parseInt(inpHeight);
        inpWidth = JOptionPane.showInputDialog(null, "Enter the Width of the room: ",
                JOptionPane.INFORMATION_MESSAGE);
        width = Integer.parseInt(inpWidth);
        price = GetPrice(length, height, width);
        JOptionPane.showMessageDialog(null,"The cost to paint a " + length + "-by-" + width +
                "-foot room with " + height + "-foot ceilings is $" + price);
    }
    private static Double GetPrice(double length, double height, double width)
    {
        double WallArea;
        WallArea = CalcWallArea(length, height, width);
        double Gallons;
        Gallons = GetGallons(WallArea);
        JOptionPane.showMessageDialog(null,"You will need " + Gallons + " gallons, " +
                        "to paint the room");
        double price;
        double PricePerGallon = 32;
        price = Gallons * PricePerGallon;
        return price;
    }
    private static double CalcWallArea(double length, double height, double width)
    {
       double TotalArea;
       TotalArea = height * length * 2 + width * height * 2;
       return TotalArea;
    }
    private static double GetGallons(double WallArea)
    {
        double Gallons;
        double AreaPerGallon = 350;
        Gallons = WallArea / AreaPerGallon;
        return Gallons;
    }

}

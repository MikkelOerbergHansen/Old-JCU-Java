package ProgrammingExercises;

import javax.swing.*;

public class CondoSales {
    public static void main(String args[])
    {
        int ParkView = 150000;
        int GolfView = 170000;
        int Lakeview = 210000;
        int userChoice;
        String userChoiceString;

        userChoiceString = JOptionPane.showInputDialog(null,
                "Input an integer: \n" + "1 - Park View for $150.000 \n" + "2 - Golf View for $170.000 \n" +
                            "3 - Lake View for $210.000 ");
        userChoice = Integer.parseInt(userChoiceString);
        if ( userChoice == 1){
            JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Park View  -  $" +
                    ParkView);}
        else if ( userChoice == 2){
            JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Golf View  -  $" +
                    GolfView);}
        else if ( userChoice == 3){
            JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Lake View  -  $" +
                    Lakeview);}
        else JOptionPane.showMessageDialog(null,"You have chosen: \n" + "????  -  $" +
                    0.0);

    }
}

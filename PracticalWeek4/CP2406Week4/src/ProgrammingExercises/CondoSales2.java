package PracticalWeek4.CP2406Week4.src.ProgrammingExercises;

import javax.swing.*;

public class CondoSales2 {
    public static void main(String args[])
    {
        int ParkView = 150000;
        int GolfView = 170000;
        int LakeView = 210000;
        int garage = 5000;
        int ParkingSpace = 0;
        int userChoice;
        int newuserChoice;
        String userChoiceString;
        String newuserChoiceString;

        userChoiceString = JOptionPane.showInputDialog(null,
                "Input an integer: \n" + "1 - Park View for $150.000 \n" + "2 - Golf View for $170.000 \n" +
                        "3 - Lake View for $210.000 ");
        userChoice = Integer.parseInt(userChoiceString);

        if (userChoice == 1){
            newuserChoiceString = JOptionPane.showInputDialog(null,
                    "Input an integer: \n" + "1 - Garage for $5.000 \n" + "2 - Parking Space for $0.00");
            newuserChoice = Integer.parseInt(newuserChoiceString);
            if (newuserChoice == 1){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Park View  -  $" +
                    ParkView + "\n" + "With garage  -  $" + garage + "\n" + "your total is: $" + (ParkView + garage));}
            else if (newuserChoice == 2){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Park View  -  $" +
                        ParkView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (ParkView + ParkingSpace));}
            else JOptionPane.showMessageDialog(null,"You have made an invalid parking choice!" +
                        " \n" + "Your Choice is therefore Park View  -  $" +
                        ParkView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (ParkView + ParkingSpace));
        }

        else if (userChoice == 2){
            newuserChoiceString = JOptionPane.showInputDialog(null,
                    "Input an integer: \n" + "1 - Garage for $5.000 \n" + "2 - Parking Space for $0.00");
            newuserChoice = Integer.parseInt(newuserChoiceString);
            if (newuserChoice == 1){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Golf View  -  $" +
                        GolfView + "\n" + "With garage  -  $" + garage + "\n" + "your total is: $" + (GolfView + garage));}
            else if (newuserChoice == 2){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Golf View  -  $" +
                        GolfView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (GolfView + ParkingSpace));}
            else JOptionPane.showMessageDialog(null,"You have made an invalid parking choice!" +
                        " \n" + "Your Choice is therefore Golf View  -  $" +
                        GolfView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (GolfView + ParkingSpace));
        }

        else if (userChoice == 3){
            newuserChoiceString = JOptionPane.showInputDialog(null,
                    "Input an integer: \n" + "1 - Garage for $5.000 \n" + "2 - Parking Space for $0.00");
            newuserChoice = Integer.parseInt(newuserChoiceString);
            if (newuserChoice == 1){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Lake View  -  $" +
                        LakeView + "\n" + "With garage  -  $" + garage + "\n" + "your total is: $" + (LakeView + garage));}
            else if (newuserChoice == 2){
                JOptionPane.showMessageDialog(null,"You have chosen: \n" + "Lake View  -  $" +
                        LakeView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (LakeView + ParkingSpace));}
            else JOptionPane.showMessageDialog(null,"You have made an invalid parking choice!" +
                        " \n" + "Your Choice is therefore Lake View  -  $" +
                        LakeView + "\n" + "With parking space  -  $" + ParkingSpace + "\n" +
                        "your total is: $" + (LakeView + ParkingSpace));
        }
        else JOptionPane.showMessageDialog(null,"You have chosen: \n" + "????  -  $" +
                    0.0);


    }
}

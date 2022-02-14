package ProgrammingExercises;

import javax.swing.*;

public class DistanceFromAverage {
    public static void main(String[] args)
    {
        double NewNumber = 0;
        String UserInput;
        double [] numberArray = new double [20];
        int count = 1 ;
        int ActualNumbers = 0;
        boolean status = false;
        double sum = 0;
        double average;
        //String message;
        StringBuilder message = new StringBuilder();

        while (count <= 20){
            while (!status){
                UserInput = JOptionPane.showInputDialog(null,"Count: " + count +
                        "\n Input a number: ");
                if (UserInput == null){
                    System.exit(0);
                }
                try{
                    NewNumber = Double.parseDouble(UserInput);
                    status = true;
                }
                catch (Exception e){
                    status = false;
                }
            }
            if (NewNumber == 999){
                break;
            }
            numberArray[count - 1] = NewNumber;
            ActualNumbers += 1;
            count += 1;
            status = false;
        }
        if (NewNumber == 999 && ActualNumbers == 0){
            JOptionPane.showMessageDialog(null, "You didn't enter any numbers");
        }
        else {
            for (double i : numberArray)
                sum += i;
            average = sum / ActualNumbers;
            message.append("Sum = ").append(sum).append("\n" + "Average = ").append(average).append("\n").append(
                    "Number is: ").append("          ").append("Distance from Average is: ").append("\n");


            for (int i = 0; i < ActualNumbers; ++i){
                message = message.append(String.format("%"+(14-String.format("%.2f",numberArray[i]).length())+".2f" +
                        " " + "%" + (44 - String.format("%.2f", Math.abs(numberArray[i] - average)).length()) +
                        ".2f%n" , numberArray[i], Math.abs(numberArray[i] - average)));


            }

            JOptionPane.showMessageDialog(null, message);

        }
    }
}


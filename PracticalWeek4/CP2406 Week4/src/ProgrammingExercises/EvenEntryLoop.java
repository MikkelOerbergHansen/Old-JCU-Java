package ProgrammingExercises;


import javax.swing.*;

public class EvenEntryLoop {
    public static void main(String[] args)
    {
        int number;
        String numberInput;

        while(true){
            try{
                numberInput = JOptionPane.showInputDialog(null, "Enter a number");
                if (numberInput == null){
                    System.exit(0);
                }
                if (numberInput.isEmpty())
                    throw new Exception();
                number = Integer.parseInt(numberInput);
                if (number == 999){
                    System.exit(0);
                }

                if (number % 2 == 0){
                    JOptionPane.showMessageDialog(null, "Good Job");
                }
                else
                    JOptionPane.showMessageDialog(null, "ERROR !!");

            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Wrong input");
                }
        }

    }

}

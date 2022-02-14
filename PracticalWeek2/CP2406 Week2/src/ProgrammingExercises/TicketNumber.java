package ProgrammingExercises;

import javax.swing.JOptionPane;

public class TicketNumber {
    public static void main(String[] args)
    {
        String TicketNumber ;
        String Number;
        int remainder;
        String VerificationNumber;
        boolean result;
        TicketNumber = JOptionPane.showInputDialog(null, "Enter the 6 digit ticket number",
                JOptionPane.INFORMATION_MESSAGE);
        Number = TicketNumber.substring(0, 5) ;
        VerificationNumber = TicketNumber.substring(5, 6);
        remainder = Integer.parseInt(Number) % 7;
        result = Integer.toString(remainder).equals (VerificationNumber);
        JOptionPane.showMessageDialog(null,"the result of evaluating your ticket number is \n" +
                "result = " + result);
    }
}

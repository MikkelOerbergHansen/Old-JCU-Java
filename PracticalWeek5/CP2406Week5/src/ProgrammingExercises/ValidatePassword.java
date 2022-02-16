package PracticalWeek5.CP2406Week5.src.ProgrammingExercises;

import javax.swing.*;

public class ValidatePassword {
    public static void main(String[] args)
    {
        String MyPassword;
        MyPassword = JOptionPane.showInputDialog(null, "Enter your password: ");
        boolean status = false;

        while(!status) {

            while (!CheckDigit(MyPassword)) {
                MyPassword = JOptionPane.showInputDialog(null, "Your password does not " +
                        "contain 2 digits \n" + "Please enter password again:");
            }
            while (!CheckUpperCase(MyPassword)) {
                MyPassword = JOptionPane.showInputDialog(null, "Your password does not " +
                        "contain 2 upper case letters\n" + "Please enter password again:");
            }
            while (!CheckLowerCase(MyPassword)) {
                MyPassword = JOptionPane.showInputDialog(null, "Your password does not " +
                        "contain 2 lower case letters\n" + "Please enter password again:");
            }

            if (CheckDigit(MyPassword) && CheckLowerCase(MyPassword) && CheckUpperCase(MyPassword)){
                status = true;
            }

            }

        JOptionPane.showMessageDialog(null, "Your password is accepted");


    }

    private static boolean CheckDigit(String password)
    {
        int length = password.length();
        int sum = 0;
        for (int x = 0; x < length; ++x) {
            if (Character.isDigit(password.charAt(x))) {
                sum += 1;
            }
        }
        if (sum >= 2)
            return true;
        else
            return false;
    }

    private static boolean CheckLowerCase(String password)
    {
        int length = password.length();
        int sum = 0;
        for (int x = 0; x < length; ++x) {
            if (Character.isLowerCase(password.charAt(x))) {
                sum += 1;
            }
        }
        if (sum >= 2)
            return true;
        else
            return false;
    }


    private static boolean CheckUpperCase(String password)
    {
        int length = password.length();
        int sum = 0;
        for (int x = 0; x < length; ++x) {
            if (Character.isUpperCase(password.charAt(x))) {
                sum += 1;
            }
        }
        if (sum >= 2)
            return true;
        else
            return false;
    }





}

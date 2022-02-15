package ProgrammingExercises;

import javax.swing.JOptionPane;

public class Insurance {
    public static void main(String[] args) {
        String inpCurrentYear;
        String inpBirthYear;
        inpCurrentYear = JOptionPane.showInputDialog(null, "Enter the current year: ",
                JOptionPane.INFORMATION_MESSAGE);
        inpBirthYear = JOptionPane.showInputDialog(null, "Enter the year of your birth: ",
                JOptionPane.INFORMATION_MESSAGE);

        int premium;
        premium = GetPremium(inpCurrentYear, inpBirthYear);
        JOptionPane.showMessageDialog(null,"Your premium amount this year is $" + premium);

    }
    private static int GetPremium(String inpCurrentYear, String inpBirthYear)
    {
        int Age;
        int currentYear;
        int BirthYear;
        String Decade;
        int premium;
        currentYear = Integer.parseInt(inpCurrentYear);
        BirthYear = Integer.parseInt(inpBirthYear);
        Age = GetAge(currentYear, BirthYear);
        Decade = Integer.toString(Age).substring(0, 1);
        premium = (Integer.parseInt(Decade) + 15) * 20;
        return premium;
    }
    private static int GetAge(int CurrentYear, int BirthYear)
    {
        int Age;
        Age = CurrentYear - BirthYear;
        return Age;
    }
}

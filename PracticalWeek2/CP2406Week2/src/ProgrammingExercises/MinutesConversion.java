package PracticalWeek2.CP2406Week2.src.ProgrammingExercises;

import javax.swing.JOptionPane;

public class MinutesConversion {
    public static void main(String[] args)
    {
        int minutes;
        int extraMinutes;
        int extraHours;
        int hours;
        int days;
        String NumberOfMinutes ;
        NumberOfMinutes = JOptionPane.showInputDialog(null, "Enter the number of minutes",
                JOptionPane.INFORMATION_MESSAGE);
        minutes = Integer.parseInt(NumberOfMinutes);
        hours = minutes / 60 ;
        extraMinutes = minutes % 60;
        days = hours / 24 ;
        extraHours = hours % 24;
        JOptionPane.showMessageDialog(null,minutes + " minutes equals \n" + hours +
                " hours and " + extraMinutes + " minutes = " + String.format("%.2f",(minutes / 60.0)) + " hours or \n " +
                days + " days and " + extraHours + " hours and " + extraMinutes + " minutes = " +
                String.format("%.3f", (minutes / 60.0 / 24.0)) + " days");
    }
}

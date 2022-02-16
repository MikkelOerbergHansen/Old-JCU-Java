package PracticalWeek2.CP2406Week2.src.ProgrammingExercises;

import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
    public static void main(String[] args)
    {
        int QuartsInGallon = 4;
        String QuartsForPaint ;
        int Quarts;
        QuartsForPaint = JOptionPane.showInputDialog(null, "Enter number of quarts needed " +
                        "for your painting job",
                JOptionPane.INFORMATION_MESSAGE);
        Quarts = Integer.parseInt(QuartsForPaint);
        JOptionPane.showMessageDialog(null,"A painting job that needs " + Quarts +
                " quarts requires " + (Quarts / QuartsInGallon) + " gallons plus " + (Quarts % QuartsInGallon) +
                " quarts.");
    }
}

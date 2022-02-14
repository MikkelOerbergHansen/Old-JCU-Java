package ProgrammingExercises;
import javax.swing.JOptionPane;


public class FormLetterWriter {
    public static void main(String args[])
    {
        String FirstName = JOptionPane.showInputDialog(null, "Enter your first name: ",
                JOptionPane.INFORMATION_MESSAGE);
        String LastName = JOptionPane.showInputDialog(null, "Enter your last name: ",
                JOptionPane.INFORMATION_MESSAGE);
        DisplaySalutation(LastName);
        DisplaySalutation(FirstName, LastName);
    }
    private static void DisplaySalutation(String LastName ){
        JOptionPane.showMessageDialog(null,"Dear Mr. or Ms. " + LastName + "\n" +
                "Thank you for your recent order");
    }
    private static void DisplaySalutation(String FirstName, String LastName){
        JOptionPane.showMessageDialog(null,"Dear " + FirstName + " " + LastName + "\n" +
                "Thank you for your recent order");

    }

}

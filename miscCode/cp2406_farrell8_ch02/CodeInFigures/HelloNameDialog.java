package miscCode.cp2406_farrell8_ch02.CodeInFigures;

import javax.swing.JOptionPane;
public class HelloNameDialog
{
   public static void main(String[] args)
   {
      String result;
      result = JOptionPane.showInputDialog("What is your name?");
      JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
   }
}

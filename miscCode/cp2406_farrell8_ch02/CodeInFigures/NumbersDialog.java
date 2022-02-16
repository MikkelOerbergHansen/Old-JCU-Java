package miscCode.cp2406_farrell8_ch02.CodeInFigures;

import javax.swing.JOptionPane;
public class NumbersDialog
{
   public static void main(String[] args)
   {
      int creditDays = 30;
      JOptionPane.showMessageDialog(null, "" + creditDays);
      JOptionPane.showMessageDialog
          (null, "Every bill is due in " + creditDays + " days");
   }
}
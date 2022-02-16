package miscCode.cp2406_farrell8_ch16.CodeInFigures;

import javax.swing.*;
import java.awt.*;
public class JDemoPanelWithButton extends JFrame
{
   JPanelWIthButton p1 = new JPanelWIthButton();
   public JDemoPanelWithButton()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(p1, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      JDemoPanelWithButton frame = new JDemoPanelWithButton();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}

package miscCode.cp2406_farrell8_ch16.CodeInFigures;

import javax.swing.*;
import java.awt.*;
public class JDemoPanelWithButton2 extends JFrame
{
   JPanelWIthButton2 p1 = new JPanelWIthButton2();
   public JDemoPanelWithButton2()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(p1, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      JDemoPanelWithButton2 frame = new JDemoPanelWithButton2();
      frame.setSize(200, 200);
      frame.setVisible(true);
   }
}

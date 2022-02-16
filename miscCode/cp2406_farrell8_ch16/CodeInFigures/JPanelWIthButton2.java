package miscCode.cp2406_farrell8_ch16.CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JPanelWIthButton2 extends JPanel implements ActionListener
{
   JButton button = new JButton("Press me");
   int count = 0;
   public JPanelWIthButton2()
   {
      add(button);
      button.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {  
      ++count;
      repaint();
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.drawString("The count is " + count, 20, 80);
   }
}
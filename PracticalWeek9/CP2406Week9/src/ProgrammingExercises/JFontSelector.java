package PracticalWeek9.CP2406Week9.src.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFontSelector extends JFrame implements ActionListener
{
    final int SMALL = 12;
    final int LARGE = 24;
    int size = SMALL;
    boolean isSmaller = true;
    JButton hButton = new JButton("Rockwell Extra Bold");
    JButton tButton = new JButton("Times Roman");
    JButton cButton = new JButton("Gloucester MT Extra Condensed");
    JButton sButton = new JButton("Algerian");
    JButton aButton = new JButton("Arial");
    JButton sizeButton = new JButton("Larger/Smaller");
    Font gFont = new Font("Gloucester MT Extra Condensed", Font.PLAIN, size);
    Font rFont = new Font("Rockwell Extra Bold", Font.PLAIN, size);
    Font tFont = new Font("TimesRoman", Font.PLAIN, size);
    Font sFont = new Font("Algerian", Font.PLAIN, size);
    Font aFont = new Font("Arial", Font.PLAIN, size);
    Font myFont = gFont;
    JLabel label = new JLabel("Font demonstration message");
    public JFontSelector()
    {
        setTitle("JFontFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(hButton);
        add(tButton);
        add(cButton);
        add(sButton);
        add(aButton);
        add(sizeButton);
        add(label);
        label.setFont(sFont);
        hButton.addActionListener(this);
        tButton.addActionListener(this);
        cButton.addActionListener(this);
        sButton.addActionListener(this);
        aButton.addActionListener(this);
        sizeButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == hButton)
        {
            myFont = rFont;
        }
        else if(e.getSource() == tButton)
        {
            myFont = tFont;
        }
        else if(e.getSource() == sButton)
        {
            myFont = sFont;
        }
        else if(e.getSource() == cButton)
        {
            myFont = gFont;
        }
        else if(e.getSource() == aButton)
        {
            myFont = aFont;
        }
        else if(e.getSource() == sizeButton)
        {
            if(isSmaller)
            {
                myFont = myFont.deriveFont(Font.PLAIN, LARGE);
                isSmaller = false;
            }
            else
            {
                myFont = myFont.deriveFont(Font.PLAIN, SMALL);
                isSmaller = true;
            }
        }
        label.setFont(myFont);
    }
    public static void main(String [ ] args)
    {
        JFontSelector ff = new JFontSelector();
        ff.setSize(500, 180);
        ff.setVisible(true);
    }
}

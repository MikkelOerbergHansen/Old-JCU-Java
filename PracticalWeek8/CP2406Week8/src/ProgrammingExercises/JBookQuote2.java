package ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("Fear is the path to the dark side. ");
    JLabel msg2 = new JLabel("Fear leads to anger;");
    JLabel msg3 = new JLabel("anger leads to hate; ");
    JLabel msg4 = new JLabel("hate leads to suffering.");
    JButton button = new JButton("Click for source");
    JLabel msg5 = new JLabel("**    Star Wars - The Phantom Menace    **");
    public JBookQuote2()
    {
        super("Book Quote 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
        add(msg3);
        add(msg4);
        add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        add(msg5);
        validate();
        repaint();
    }
    public static void main(String[] args)
    {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(250, 200);
        aFrame.setVisible(true);
    }
}

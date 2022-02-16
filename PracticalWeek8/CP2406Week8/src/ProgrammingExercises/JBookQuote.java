package PracticalWeek8.CP2406Week8.src.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("Fear is the path to the dark side. ");
    JLabel msg2 = new JLabel("Fear leads to anger;");
    JLabel msg3 = new JLabel("anger leads to hate; ");
    JLabel msg4 = new JLabel("hate leads to suffering.");
    public JBookQuote()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
        add(msg3);
        add(msg4);
    }
    public static void main(String[] args)
    {
        JBookQuote aFrame = new JBookQuote();
        aFrame.setSize(300, 150);
        aFrame.setVisible(true);
    }
}
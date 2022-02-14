package ProgrammingExercises;

import javafx.css.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMovieFrame extends JFrame implements ActionListener {
    JPanel ButtonPanel = new JPanel();
    JButton WestMovie = new JButton("Once Upon A Time In The West ");
    JButton SouthMovie = new JButton("South Park: Bigger, Longer & Uncut  ");
    JButton EastMovie = new JButton("Witches Of East End ");
    JButton CenterMovie = new JButton("Journey To the Center Of The Earth ");
    JButton NorthMovie = new JButton("North Country ");
    JLabel InfoLabel = new JLabel(" Press a button ");
    Container con = null;

    public JMovieFrame()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        con = this.getContentPane();
        con.setLayout(new BorderLayout());
        ButtonPanel.setLayout(new BorderLayout());
        con.add(ButtonPanel, BorderLayout.CENTER);
        ButtonPanel.add(WestMovie, BorderLayout.WEST);
        ButtonPanel.add(SouthMovie, BorderLayout.SOUTH);
        ButtonPanel.add(EastMovie, BorderLayout.EAST);
        ButtonPanel.add(CenterMovie, BorderLayout.CENTER);
        ButtonPanel.add(NorthMovie, BorderLayout.NORTH);
        con.add(InfoLabel, BorderLayout.SOUTH);

        NorthMovie.addActionListener(this);
        SouthMovie.addActionListener(this);
        CenterMovie.addActionListener(this);
        WestMovie.addActionListener(this);
        EastMovie.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        String text = "  ";
        if(source == NorthMovie)
            text = "released 2005, starring Charlize Theron";
        else if(source == SouthMovie)
            text = "released 1999, starring Trey Parker & Matt Stone";
        else if(source == CenterMovie)
            text = "released 2008, starring Brendan Fraser";
        else if(source == WestMovie)
            text = "released 1968, starring Henry Fonda";
        else if(source == EastMovie)
            text = "released 2013, starring Julia Ormond";
        else
            text = " ";
        InfoLabel.setText(text);
        repaint();
    }





    public static void main(String[] args)
    {
        JMovieFrame f = new JMovieFrame();
        f.setSize(700, 300);
        f.setVisible(true);
    }

}

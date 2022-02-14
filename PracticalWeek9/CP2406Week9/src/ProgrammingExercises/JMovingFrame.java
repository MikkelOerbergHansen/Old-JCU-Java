package ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMovingFrame extends JFrame implements ActionListener
{
    Container con = getContentPane();
    final int MAX = 8;
    JPanel[] panel = new JPanel[MAX];
    JButton button = new JButton("Press");
    JLabel[] blankLabel = new JLabel[MAX];
    int x = 0, y, z = 0;
    public JMovingFrame()
    {
        con.setLayout(new GridLayout(3,3));
        setTitle("Moving Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //con.add(button);
        button.addActionListener(this);
        for(y = 0; y <4; ++y)
        {
            blankLabel[y] =  new JLabel("        ");
            panel[y] = new JPanel();
            con.add(panel[y]);
            panel[y].add(blankLabel[y]);
        }
        con.add(button);
        for(y = 4; y <MAX; ++y)
        {
            blankLabel[y] =  new JLabel("        ");
            panel[y] = new JPanel();
            con.add(panel[y]);
            panel[y].add(blankLabel[y]);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        blankLabel[x].setText("        ");
        while(z == x){
            z = (int) (Math.random() * MAX);
        }
        x = z;
        blankLabel[x].setText("I'm here");
    }

    public static void main(String[] args)
    {
        JMovingFrame mFrame = new JMovingFrame();
        mFrame.setSize(250, 300);
        mFrame.setVisible(true);
    }
}

package PracticalWeek9.CP2406Week9.src.ProgrammingExercises;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JColorFrame extends JFrame implements ActionListener
{
    Button colorButton = new Button("Change Border Color");
    JPanel CenterPanel = new JPanel();
    JPanel NorthPanel = new JPanel();
    JPanel SouthPanel = new JPanel();
    JPanel EastPanel = new JPanel();
    JPanel WestPanel = new JPanel();
    int count = 0;
    public JColorFrame()
    {
        super("JColorFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        CenterPanel.add(colorButton);
        con.add(NorthPanel, BorderLayout.NORTH);
        con.add(SouthPanel, BorderLayout.SOUTH);
        con.add(EastPanel, BorderLayout.EAST);
        con.add(WestPanel, BorderLayout.WEST);
        con.add(CenterPanel, BorderLayout.CENTER);
        colorButton.addActionListener(this);
    }
    public static void main(String[] args)
    {
        JColorFrame cFrame = new JColorFrame();
        cFrame.setSize(350,250);
        cFrame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(count == 0){
            NorthPanel.setBackground(Color.GREEN);
            count += 1;}
        else if(count==1){
            EastPanel.setBackground(Color.YELLOW);
            count += 1;}
        else if(count==2){
            WestPanel.setBackground(Color.BLUE);
            count += 1;}
        else if(count==3){
            SouthPanel.setBackground(Color.RED);
            count += 1;}
        else
        {
            EastPanel.setBackground(null);
            SouthPanel.setBackground(null);
            NorthPanel.setBackground(null);
            WestPanel.setBackground(null);
            count = 0;
        }
    }
}

package PracticalWeek9.CP2406Week9.src.ProgrammingExercises;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CreateRandomEmployeeFile extends JFrame
        implements ActionListener
{
    private JLabel title =
            new JLabel("Employee data");
    Font bigFont = new Font("Helvetica", Font.ITALIC, 24);
    private JLabel prompt =
            new JLabel("    Enter employee data    ");
    private JTextField idField = new JTextField(4);
    private JTextField firstField = new JTextField(14);
    private JTextField lastField = new JTextField(14);
    private JTextField payField = new JTextField(8);
    private JLabel idLabel = new JLabel("ID");
    private JLabel fnLabel = new JLabel("First name");
    private JLabel lnLabel = new JLabel("Last name");
    private JLabel payLabel = new JLabel("Pay rate");
    private JButton enterDataButton =
            new JButton("Enter data");
    private Container con = getContentPane();
    PrintWriter writer;

    public CreateRandomEmployeeFile()
    {
        super("Create File");
        try
        {
            writer = new PrintWriter(new FileWriter("PracticalWeek9/CP2406Week9/src/ProgrammingExercises/Employees.txt", false));

        }
        catch(IOException e)
        {
            System.err.println("File not opened");
            System.exit(1);
        }
        setSize(289, 200);
        con.setLayout(new FlowLayout());
        title.setFont(bigFont);
        con.add(title);
        con.add(prompt);
        con.add(idLabel);
        con.add(idField);
        con.add(fnLabel);
        con.add(firstField);
        con.add(lnLabel);
        con.add(lastField);
        con.add(payLabel);
        con.add(payField);
        con.add(enterDataButton);
        enterDataButton.addActionListener(this);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e1)
    {
        final int MAXNUM = 99;
        int num;
        double pay;
        try
        {
            num = Integer.parseInt(idField.getText());
            pay = Double.parseDouble(payField.getText());
            if(num > MAXNUM)
                num = MAXNUM;
            try
            {
                writer = new PrintWriter(new FileWriter("PracticalWeek9/CP2406Week9/src/ProgrammingExercises/Employees.txt", true));

            }
            catch(IOException e)
            {
                System.err.println("File not opened");
                System.exit(1);
            }
            writer.println(num);
            writer.println(firstField.getText());
            writer.println(lastField.getText());
            writer.println(pay);
            writer.close();

            idField.setText("");
            lastField.setText("");
            firstField.setText("");
            payField.setText("");
        }
        catch(NumberFormatException e2)
        {
            System.err.println("Invalid employee ID number or Pay rate");
        }

    }
    public static void main(String[] args)
    {
        CreateRandomEmployeeFile file = new CreateRandomEmployeeFile();
    }
}

package PracticalWeek9.CP2406Week9.src.ProgrammingExercises;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ReadRandomEmployeeFile extends JFrame
        implements ActionListener
{
    private JLabel title =
            new JLabel("Employee data");
    Font bigFont = new Font("Helvetica", Font.ITALIC, 24);
    private JTextField idField = new JTextField(4);
    private JLabel idLabel = new JLabel("ID");
    private JButton RetrieveDataButton =
            new JButton("retrieve data");
    JPanel InfoPanel = new JPanel();

    private JLabel EmployeeLabelID1 = new JLabel("ID Number:");
    private JLabel EmployeeLabelFirst1 = new JLabel("First Name:");
    private JLabel EmployeeLabelLast1 = new JLabel("Last Name:");
    private JLabel EmployeeLabelPR1 = new JLabel("Pay Rate: ");

    private JLabel EmployeeLabelID = new JLabel("");
    private JLabel EmployeeLabelFirst = new JLabel("");
    private JLabel EmployeeLabelLast = new JLabel("");
    private JLabel EmployeeLabelPR = new JLabel("");

    private Container con = getContentPane();
    BufferedReader br;

    public ReadRandomEmployeeFile()
    {
        setSize(280, 200);
        con.setLayout(new FlowLayout());
        title.setFont(bigFont);
        con.add(title);
        con.add(idLabel);
        con.add(idField);
        con.add(RetrieveDataButton);
        RetrieveDataButton.addActionListener(this);

        InfoPanel.setLayout(new GridLayout(4,2));
        InfoPanel.add(EmployeeLabelID1);
        InfoPanel.add(EmployeeLabelID);
        InfoPanel.add(EmployeeLabelFirst1);
        InfoPanel.add(EmployeeLabelFirst);
        InfoPanel.add(EmployeeLabelLast1);
        InfoPanel.add(EmployeeLabelLast);
        InfoPanel.add(EmployeeLabelPR1);
        InfoPanel.add(EmployeeLabelPR);

        con.add(InfoPanel);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e1)
    {
        try
        {
            br = new BufferedReader(new FileReader("PracticalWeek9/CP2406Week9/src/ProgrammingExercises/Employees.txt"));
        }
        catch(IOException e)
        {
            System.err.println("File not opened");
            System.exit(1);
        }

        String IDnum;
        try
        {
            IDnum = idField.getText();
            String line = br.readLine();

            while (line != null) {
                if(IDnum.equals(line)){
                    EmployeeLabelID.setText("   " + line);
                    line = br.readLine();
                    EmployeeLabelFirst.setText("   " + line);
                    line = br.readLine();
                    EmployeeLabelLast.setText("   " + line);
                    line = br.readLine();
                    EmployeeLabelPR.setText("   " + "$" + line);
                    break;
                }
                line = br.readLine();
            }
            if (line == null){
                EmployeeLabelID.setText("ID does not exist");
                EmployeeLabelFirst.setText("");
                EmployeeLabelLast.setText("");
                EmployeeLabelPR.setText("");
            }
            br.close();


        }
        catch(IOException e)
        {
            System.err.println("File not opened");
            System.exit(1);
        }





    }
    public static void main(String[] args)
    {
        ReadRandomEmployeeFile file = new ReadRandomEmployeeFile();
    }
}

package ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;

public class JVowelConsonant extends JFrame implements ActionListener
{
    Container con = null;
    final int NumberOfButtons = 8;
    JButton[] buttons = new JButton[NumberOfButtons];
    final String[] LETTERS = {"A", "B", "C", "D","E","F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
            "S", "T", "U", "V", "W", "X", "Y", "Z"};
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel infoLabel = new JLabel("");

    String [] LettersInUse =new String[NumberOfButtons];
    boolean alreadyUsed;
    boolean InUse;
    int x;
    int RandomNumber;


    public JVowelConsonant()
    {
        int[] RandomNumbers = new Random().ints(0, LETTERS.length).distinct().limit(8).toArray();
        setLayout(new GridLayout(2, 2));
        panel1.setLayout(new GridLayout(2, 2));
        panel2.setLayout(new GridLayout(2, 2));
        for(x = 0; x < NumberOfButtons; ++x) {
            buttons[x] = new JButton(LETTERS[RandomNumbers[x]]);
            LettersInUse[x] = LETTERS[RandomNumbers[x]];
        }
        for(x = 0; x < 4; ++x)
            panel1.add(buttons[x]);
        for(; x < NumberOfButtons; ++x)
            panel2.add(buttons[x]);
        panel3.add(infoLabel);
        add(panel1);
        add(panel2);
        add(panel3);
        for(x = 0; x < NumberOfButtons; ++x)
            buttons[x].addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(x = 0; x < NumberOfButtons; ++x)
            if (source == buttons[x])
            {
                if(buttons[x].getText() == "A" || buttons[x].getText() == "E" ||
                        buttons[x].getText() == "I" || buttons[x].getText() == "O" ||
                        buttons[x].getText() == "U")
                    infoLabel.setText(buttons[x].getText() + " is a vowel");
                else
                    infoLabel.setText(buttons[x].getText() + " is a consonant");

                alreadyUsed = true;
                while (alreadyUsed) {
                    RandomNumber = (int) (Math.random() * LETTERS.length);
                    InUse = false;
                    for(int i= 0; i<LettersInUse.length; ++i){
                        if (LETTERS[RandomNumber].equals(LettersInUse[i])){
                            InUse = true;
                        }
                    }
                    if (!InUse){
                        int LetterIndex = Arrays.asList(LettersInUse).indexOf(buttons[x].getText());
                        LettersInUse[LetterIndex] = LETTERS[RandomNumber];
                        buttons[x].setText(LETTERS[RandomNumber]);
                        x = NumberOfButtons;
                        alreadyUsed = false;
                    }

                }
            }
    }
    public static void main(String[] ags)
    {
        JVowelConsonant f = new JVowelConsonant();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
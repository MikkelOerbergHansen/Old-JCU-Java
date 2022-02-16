package PracticalWeek5.CP2406Week5.src.ProgrammingExercises;

import javax.swing.*;

public class ThreeLetterAcronym {
    public static void main(String[] args) {
        String MyString;
        char FirstLetter;
        char SecondLetter;
        char ThirdLetter;
        String Acronym;

        MyString = JOptionPane.showInputDialog(null, "Enter at least 3 words: ");
        if (MyString == null) {
            System.exit(0);
        }
        String[] myArray = MyString.split(" ");

        while(myArray.length < 3){
            MyString = JOptionPane.showInputDialog(null, "Enter at least 3 words: ");
            if (MyString == null) {
                System.exit(0);
            }
            myArray = MyString.split(" ");
        }
        FirstLetter = myArray[0].charAt(0);
        SecondLetter = myArray[1].charAt(0);
        ThirdLetter = myArray[2].charAt(0);

        Acronym = Character.toString(FirstLetter).toUpperCase() + Character.toString(SecondLetter).toUpperCase() +
                Character.toString(ThirdLetter).toUpperCase();

        JOptionPane.showMessageDialog(null, "The Three Letter Acronym is: " + Acronym + "\n" +
                Character.toString(FirstLetter).toUpperCase() + " - " + myArray[0] + "\n" +
                Character.toString(SecondLetter).toUpperCase() + " - " + myArray[1] + "\n" +
                Character.toString(ThirdLetter).toUpperCase() + " - " + myArray[2]);


        System.out.println(myArray[0]);

    }

}

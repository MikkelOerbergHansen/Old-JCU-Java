package PracticalWeek5.CP2406Week5.src.ProgrammingExercises;

import javax.swing.*;

public class CountWords {
    public static void main(String[] args) {
        String MyString;
        int WordCount = 0;
        int NumberCount = 0;
        MyString = JOptionPane.showInputDialog(null, "Enter a sentence: ");
        int length = MyString.length();

        boolean isWord = false;
        boolean isNumber = false;
        int endOfLine = MyString.length() - 1;

        for (int x = 0; x < length; x++) {
            // if the char is a letter, isWord = true.
            if (Character.isLetter(MyString.charAt(x)) && x != endOfLine) {
                isWord = true;
                // if char isn't a letter or an apostrophe and there have been letters before,
                // counter goes up.
            } else if (!Character.isLetter(MyString.charAt(x)) && isWord && MyString.charAt(x) != "'".charAt(0) ) {
                WordCount = WordCount +1;
                isWord = false;
                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if (Character.isLetter(MyString.charAt(x)) && x == endOfLine) {
                WordCount = WordCount +1;
            }
        }

        for (int x = 0; x < length; x++) {
            // if the char is a Number, isNumber = true.
            if (Character.isDigit(MyString.charAt(x)) && x != endOfLine) {
                isNumber = true;
                // if char isn't a Number or a comma/dot and there have been numbers before,
                // counter goes up.
            } else if (!Character.isDigit(MyString.charAt(x)) && isNumber &&
                    MyString.charAt(x) != ",".charAt(0) && MyString.charAt(x) != ".".charAt(0)  ) {
                NumberCount = NumberCount +1;
                isNumber = false;
                // last Number of String; if it doesn't end with a non digit, it
                // wouldn't count without this.
            } else if (Character.isDigit(MyString.charAt(x)) && x == endOfLine) {
                NumberCount = NumberCount +1;
            }
        }

        JOptionPane.showMessageDialog(null, "There are " + WordCount + " words in the string" +
                "\nAnd there are " + NumberCount + " Numbers in the string");
    }
}

package ProgrammingExercises;

import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args)
    {
        String quote;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite movie quote >> ");
        quote = input.nextLine();

        int spaces = 0;
        int length = quote.length();
        for(int x = 0; x < length; ++x)
        {
            if (quote.charAt(x) == ' ' ){
                spaces += 1;
            }
        }
        System.out.println("'" + quote + "'" + "\n" + "contains " + spaces + " spaces");

    }
}

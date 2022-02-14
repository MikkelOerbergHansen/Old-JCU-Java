package ProgrammingExercises;

public class CountMovieSpaces {
    public static void main(String[] args)
    {
        String quote =
                "Hasta la vista, baby";
        int spaces = 0;
        int length = quote.length();
        for(int x = 0; x < length; ++x)
        {
            if (quote.charAt(x) == ' ' ){
                spaces += 1;
            }
        }
        System.out.println("'" + quote + "'" + "\n - Terminator in 'Terminator 2\n" + "contains " + spaces + " spaces");

    }
}

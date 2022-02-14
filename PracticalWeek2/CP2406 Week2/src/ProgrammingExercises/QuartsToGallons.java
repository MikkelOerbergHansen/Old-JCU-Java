package ProgrammingExercises;

public class QuartsToGallons {
    public static void main(String[] args)
    {
        int QuartsInGallon = 4;
        int QuartsForPaint = 18;
        System.out.println("A job that needs " + QuartsForPaint + " quarts requires " + (QuartsForPaint / QuartsInGallon)
                + " gallons plus " + QuartsForPaint % QuartsInGallon + " quarts");

    }
}

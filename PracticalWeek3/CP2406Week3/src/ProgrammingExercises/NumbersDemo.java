package ProgrammingExercises;

public class NumbersDemo {

    public static void main(String args[])
    {
        int a = 6;
        int b = 7;
        DisplayTwiceTheNumber(a);
        DisplayTwiceTheNumber(b);
        DisplayNumberPlusFive(a);
        DisplayNumberPlusFive(b);
        DisplayNumberSquared(a);
        DisplayNumberSquared(b);

    }
    private static void DisplayTwiceTheNumber(int x)
    {
        int result;
        result = 2 * x;
        System.out.println("Twice of " + x + " is " + result);
    }
    private static void DisplayNumberPlusFive(int x)
    {
        int result;
        result = x +5;
        System.out.println( x + " plus five, is " + result);
    }
    private static void DisplayNumberSquared(int x)
    {
        int result;
        result = x * x;
        System.out.println("The square of " + x + " is " + result);
    }
}

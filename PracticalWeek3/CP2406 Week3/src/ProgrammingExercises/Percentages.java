package ProgrammingExercises;

public class Percentages {
    public static void main(String args[])
    {
        double a = 2.00;
        double b = 5.00;
        DisplayPercentage(a, b);
        DisplayPercentage(b, a);
    }
    private static void DisplayPercentage(double x, double y)
    {
        double result;
        result = (x / y) * 100;
        System.out.println(x + " is " + result + "% of " + y);
    }
}

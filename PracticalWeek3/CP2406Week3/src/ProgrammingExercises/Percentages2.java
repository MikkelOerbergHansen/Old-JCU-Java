package ProgrammingExercises;

import java.util.Scanner;

public class Percentages2 {
    public static void main(String args[])
    {
        double a;
        double b;
        a = getNumber();
        b = getNumber();
        DisplayPercentage(a, b);
        DisplayPercentage(b, a);
    }
    private static double getNumber() {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        number = input.nextDouble();
        return number;
    }
    private static void DisplayPercentage(double x, double y)
    {
        double result;
        result = (x / y) * 100;
        System.out.println(x + " is " + result + "% of " + y);
    }
}

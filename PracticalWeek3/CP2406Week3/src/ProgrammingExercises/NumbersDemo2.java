package ProgrammingExercises;

import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String args[])
    {
        int a ;
        int b ;
        a = getNumber();
        b = getNumber();
        DisplayTwiceTheNumber(a);
        DisplayTwiceTheNumber(b);
        DisplayNumberPlusFive(a);
        DisplayNumberPlusFive(b);
        DisplayNumberSquared(a);
        DisplayNumberSquared(b);

    }
    private static int getNumber()
    {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number " );
        number = input.nextInt();
        return number;
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

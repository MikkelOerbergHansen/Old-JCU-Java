package ProgrammingExercises;

import java.util.Scanner;

public class BookStoreCredit {
    public static void main(String args[])
    {
        String name;
        double GPA;
        name = getName();
        GPA = getGPA();
        DisplayMessage(name, GPA);
    }
    private static String getName() {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.next();
        return name;
    }
    private static double getGPA() {
        double GPA;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your GPA: ");
        GPA = input.nextDouble();
        return GPA;
    }
    private static void DisplayMessage(String name, double GPA)
    {
        double credit;
        credit = 10 * GPA;
        System.out.println("Hello " + name + ", your GPA is " + GPA + "\n" +
                "This gives you a bookstore credit of $" + credit);
    }
}

package ProgrammingExercises;

public class ArrayMethodDemo {
    public static void main (String args[])
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int limit = 5;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    private static void display(int[] numbers)
    {
        System.out.print("The numbers are  ");
        for (int number : numbers) System.out.print(number + "  ");
    }
    private static void displayReverse(int[] numbers)
    {
        System.out.print("\nThe numbers in reverse order are  ");
        for(int i = numbers.length - 1; i >= 0; -- i)
            System.out.print(numbers[i] + "  ");
    }
    private static void displaySum(int[] numbers)
    {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nThe sum of all numbers is " + sum);
    }
    private static void displayLessThan(int[] numbers, int limit)
    {
        for (int number : numbers)
            if (number < limit) System.out.print(number + " ");
        System.out.println("are less than the limit " + limit);

    }
    private static void displayHigherThanAverage(int[] numbers)
    {
        int sum = 0;
        double average;
        for (int number1 : numbers) sum += number1;
        average = (double) sum / numbers.length;
        System.out.println("The average is " + average);
        for (int number : numbers)
            if (number > average) System.out.print(number + "  ");
        System.out.println("are greater than the average");
    }
}

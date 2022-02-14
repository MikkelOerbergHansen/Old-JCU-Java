package ProgrammingExercises;

import java.util.Scanner;

public class InBetween {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        String output;
        int largestNumber;
        int smallestNumber;
        if (number1 > number2){
            largestNumber = number1;
            smallestNumber = number2;}
        else{
            largestNumber = number2;
            smallestNumber = number1;}
        output = "the list of number between your numbers is: " + "\n" + smallestNumber + " >>> ";

        if (number1 == number2 || number1 == number2 + 1 || number2 == number1 + 1){
            System.out.println("There are no integers in between your chosen numbers");
        }
        else if (number1 > number2 + 1){
            for (int x = number2 + 1; x < number1;){
                output = output + x + " ";
                x = x + 1;
            }
        }
        else if (number2 > number1 + 1){
            for (int x = number1 + 1; x < number2;){
                output = output + x + " ";
                x = x + 1;
            }
        }
        output = output + "<<< " + largestNumber;
        System.out.println(output);
    }
}

package PracticalWeek4.CP2406Week4.src.ProgrammingExercises;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {
        int start = 0;
        Scanner input = new Scanner(System.in);
        int increment;
        System.out.print("Enter number to count by: ");
        increment = input.nextInt();
        int end = increment * 100;
        String out = "This is the counting by anything \n";
        for (int x = start; x < end;){
            x = x + increment;
            if (x % (10*increment) == 0){
                out = out + " " + x + "\n";
            }
            else
                out = out + " " + x;
        }
        System.out.println(out);

    }
}

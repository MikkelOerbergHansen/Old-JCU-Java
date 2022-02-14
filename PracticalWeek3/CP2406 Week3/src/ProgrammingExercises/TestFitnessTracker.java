package ProgrammingExercises;

import java.time.LocalDate;

public class TestFitnessTracker {
    public static void main(String args[]) {
        FitnessTracker Tracker1 = new FitnessTracker();
        System.out.println("The activity is " + Tracker1.getActivity());
        System.out.println("The number of minutes is " + Tracker1.getMinutes());
        System.out.println("The date is " + Tracker1.getDate());

        System.out.println(" ");

        FitnessTracker Tracker2 = new FitnessTracker("cycling", 30,
                LocalDate.of(2018, 7, 24));
        System.out.println("The activity is " + Tracker2.getActivity());
        System.out.println("The number of minutes is " + Tracker2.getMinutes());
        System.out.println("The date is " + Tracker2.getDate());

    }
}

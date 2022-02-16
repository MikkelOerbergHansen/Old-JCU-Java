package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

import java.time.LocalDate;

public class TestFitnessTracker2 {
    public static void main(String args[]) {
        FitnessTracker2 Tracker1 = new FitnessTracker2();
        System.out.println("The activity is " + Tracker1.getActivity());
        System.out.println("The number of minutes is " + Tracker1.getMinutes());
        System.out.println("The date is " + Tracker1.getDate());

        System.out.println(" ");

        FitnessTracker2 Tracker2 = new FitnessTracker2("cycling", 30,
                LocalDate.of(2018, 7, 24));
        System.out.println("The activity is " + Tracker2.getActivity());
        System.out.println("The number of minutes is " + Tracker2.getMinutes());
        System.out.println("The date is " + Tracker2.getDate());

    }
}

package ProgrammingExercises;

import java.time.*;

class FitnessTracker {
    private String Activity;
    private int Minutes;
    private LocalDate Date;
    FitnessTracker()
    {
        Activity = "running";
        Minutes = 0;
        Date = LocalDate.of(2018, 1, 1);
    }
    FitnessTracker(String MyActivity, int MyMinutes, LocalDate MyDate) {
        Activity = MyActivity;
        Minutes = MyMinutes;
        Date = MyDate;
    }
    String getActivity()
    {
        return Activity;
    }
    int getMinutes()
    {
        return Minutes;
    }
    LocalDate getDate()
    {
        return Date;
    }
}

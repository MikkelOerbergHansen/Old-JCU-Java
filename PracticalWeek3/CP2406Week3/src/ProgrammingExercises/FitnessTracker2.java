package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

import java.time.*;

class FitnessTracker2 {
    private String Activity;
    private int Minutes;
    private LocalDate Date;
    FitnessTracker2()
    {
       this("running", 0, LocalDate.of(2018, 1, 1));
    }
    FitnessTracker2(String MyActivity, int MyMinutes, LocalDate MyDate) {
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

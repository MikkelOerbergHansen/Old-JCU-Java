package PracticalWeek4.CP2406Week4.src.ProgrammingExercises;

import java.time.LocalDateTime;

public class CompareLoopTimes3 {
    public static void main(String[] args)
    {
        int startTime, endTime;
        int totalTime;
        final int REPEAT = 100_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = 0; x <= REPEAT; ++x)
            for(int y = 0; y <= REPEAT; ++y);
        now = LocalDateTime.now();
        endTime = now.getNano();

        if(startTime > endTime){
            totalTime = 1000000000 - startTime + endTime;
            System.out.println("\nTime for loops starting from 0: " +
                    ((totalTime) / FACTOR) + " milliseconds");
        }
        else
            System.out.println("\nTime for loops starting from 0: " +
                        ((endTime - startTime) / FACTOR) + " milliseconds");

        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = REPEAT; x >= 0; --x)
            for(int y = REPEAT; y >= 0; --y);
        now = LocalDateTime.now();
        endTime = now.getNano();
        if(startTime > endTime){
            totalTime = 1000000000 - startTime + endTime;
            System.out.println("\nTime for loops starting from 0: " +
                    ((totalTime) / FACTOR) + " milliseconds");
        }
        else
            System.out.println("\nTime for loops starting from 0: " +
                    ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}

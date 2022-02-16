package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

class SandwichFilling {
    private String filling;
    private int Calories;
    SandwichFilling()
    {
        filling = "egg-salad";
        Calories = 100;
    }
    SandwichFilling(String MyFilling, int MyCalories) {
        filling = MyFilling;
        Calories = MyCalories;
    }
    String getFilling()
    {
        return filling;
    }
    int getCalories()
    {
        return Calories;
    }
}

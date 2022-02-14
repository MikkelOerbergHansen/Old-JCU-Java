package ProgrammingExercises;

class Bread {
    private String BreadType;
    private int Calories;
    Bread()
    {
        BreadType = "rye";
        Calories = 100;
    }
    Bread(String MyBreadType, int MyCalories) {
        BreadType = MyBreadType;
        Calories = MyCalories;
    }
    String getBreadType()
    {
        return BreadType;
    }
    int getCalories()
    {
        return Calories;
    }
    final static String MOTTO = "The staff of life" ;
}

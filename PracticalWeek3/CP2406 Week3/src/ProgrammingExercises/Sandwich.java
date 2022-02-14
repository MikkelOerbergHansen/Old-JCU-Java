package ProgrammingExercises;

class Sandwich {
    private Bread Breadtype;
    private SandwichFilling Filling;
    Sandwich()
    {
        Breadtype = new Bread();
        Filling = new SandwichFilling();
    }
    Sandwich(String MyBread, int MyBreadCalories, String MyFilling, int MyFillingCalories ) {
        Breadtype = new Bread(MyBread, MyBreadCalories);
        Filling = new SandwichFilling(MyFilling, MyFillingCalories);
    }
    String contents(){return "Contents in your sandwich are: \n" + "Bread type: " + Breadtype.getBreadType() + "\n" +
            "Filling: " + Filling.getFilling() + "\n" + "Total calories: " +
            (2 * Breadtype.getCalories() + Filling.getCalories());}
}

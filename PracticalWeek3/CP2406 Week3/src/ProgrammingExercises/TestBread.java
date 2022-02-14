package ProgrammingExercises;

public class TestBread {
    public static void main(String args[]) {
        Bread Bread1 = new Bread();
        System.out.println("The Bread type is " + Bread1.getBreadType());
        System.out.println("The number of calories are " + Bread1.getCalories());
        System.out.println(Bread.MOTTO);
        System.out.println(" ");
        Bread Bread2 = new Bread("white", 150);
        System.out.println("The Bread type is " + Bread2.getBreadType());
        System.out.println("The number of calories are " + Bread2.getCalories());
        System.out.println(Bread.MOTTO);
        System.out.println(" ");
        Bread Bread3 = new Bread("Baguette", 120);
        System.out.println("The Bread type is " + Bread3.getBreadType());
        System.out.println("The number of calories are " + Bread3.getCalories());
        System.out.println(Bread.MOTTO);
    }
}

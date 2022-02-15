package ProgrammingExercises;

public class TestSandwichFilling {
    public static void main(String args[]) {
        SandwichFilling Filling1 = new SandwichFilling();
        System.out.println("The filling is " + Filling1.getFilling());
        System.out.println("The number of calories are " + Filling1.getCalories());
        System.out.println(" ");
        SandwichFilling Filling2 = new SandwichFilling("Tuna-salad", 150);
        System.out.println("The filling is " + Filling2.getFilling());
        System.out.println("The number of calories are " + Filling2.getCalories());
        System.out.println(" ");
        SandwichFilling Filling3 = new SandwichFilling("ham and cheese", 170);
        System.out.println("The filling is " + Filling3.getFilling());
        System.out.println("The number of calories are " + Filling3.getCalories());
    }
}

package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

public class TestSandwich {
    public static void main(String args[]) {
        Sandwich Sandwich1 = new Sandwich();
        System.out.println(Sandwich1.contents());
        System.out.println(" ");
        Sandwich Sandwich2 = new Sandwich("white", 150,
                "Tuna-salad", 150);
        System.out.println(Sandwich2.contents());
        System.out.println(" ");
        Sandwich Sandwich3 = new Sandwich("baguette", 120,
                "Ham and Cheese", 170);
        System.out.println(Sandwich3.contents());
    }
}

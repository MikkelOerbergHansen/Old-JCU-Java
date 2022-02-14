package ProgrammingExercises;

public class DemoRocks {
    public static void main(String args[])
    {
        Rock MyRock = new Rock(12, 100);
        System.out.println(MyRock.getDescription());

        IgneousRock MyIgneousRock = new IgneousRock(12, 100);
        System.out.println(MyIgneousRock.getDescription());

        SedimentaryRock MySedimentaryRock = new SedimentaryRock(12, 100);
        System.out.println(MySedimentaryRock.getDescription());

        MetamorphicRock MyMetamorphicRock = new MetamorphicRock(12, 100);
        System.out.println(MyMetamorphicRock.getDescription());
    }
}

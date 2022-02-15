package ProgrammingExercises;

public class DemoPoems {
    public static void main(String args[])
    {
        Poem Poem1 = new Poem("title1", 6);
        Couplet Poem2 = new Couplet("Couplet Title");
        Limerick Poem3 = new Limerick ("Limerick Title");
        Haiku Poem4 = new Haiku ("So Much Programming");

        System.out.println("first poem is '" + Poem1.getName() + "', and it have " +
                Poem1.getLines() + " lines");

        System.out.println("second poem is '" + Poem2.getName() + "', and it have " +
                Poem2.getLines() + " lines");

        System.out.println("third poem is '" + Poem3.getName() + "', and it have " +
                Poem3.getLines() + " lines");

        System.out.println("fourth poem is '" + Poem4.getName() + "', and it have " +
                Poem4.getLines() + " lines");

    }
}

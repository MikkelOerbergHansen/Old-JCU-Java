package ProgrammingExercises;

public class DemoHorses {
    public static void main(String args[])
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Jolly Jumper");
        horse1.setColor("brown");
        horse1.setBirthYear(2010);
        horse2.setName("sally");
        horse2.setColor("white");
        horse2.setBirthYear(2011);
        horse2.setRaces(4);
        RaceHorse horse3 = new RaceHorse("John", "Black", 2001, 18);
        System.out.println(horse1.getName() + " is " +
                horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");

        System.out.println(horse2.getName() + " is " + horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");

        System.out.println(horse3.getName() + " is " + horse3.getColor() + " and was born in " + horse3.getBirthYear() + ".");
        System.out.println(horse3.getName() + " has been in " + horse3.getRaces() + " races.");

    }

}

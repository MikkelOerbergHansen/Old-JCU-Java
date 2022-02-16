package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class Poem {
    public String name;
    public int lines;

    public Poem(String PoemName, int NumberOfLines) {
        name = PoemName;
        lines = NumberOfLines;
    }

    public String getName() {
        return name;
    }

    public int getLines() {
        return lines;
    }
}

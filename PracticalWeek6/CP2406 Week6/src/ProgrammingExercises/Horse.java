package ProgrammingExercises;

public class Horse {

    public String name = "";
    public String color = "";
    public int birthYear = 0;


    public Horse(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.birthYear = year;
    }

    public Horse() {
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setBirthYear(int year) {
        birthYear = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

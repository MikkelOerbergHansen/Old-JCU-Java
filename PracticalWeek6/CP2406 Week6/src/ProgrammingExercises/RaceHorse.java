package ProgrammingExercises;



public class RaceHorse extends Horse {

    public int races = 0;

    public RaceHorse(String Name, String color, int year, int TheRaces) {

        super(Name, color, year);
        this.races = TheRaces;
    }

    public RaceHorse() {
    }

        public int getRaces ()
        {
            return races;
        }
        public void setRaces ( int r)
        {
            races = r;
        }

}

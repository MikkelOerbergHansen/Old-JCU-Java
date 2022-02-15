package ProgrammingExercises;

public class DemoLLBaseballGame {
    public static void main(String args[])
    {
        LittleLeagueBaseballGame TheGame = new LittleLeagueBaseballGame("reds", "blues");
        // change team names
        TheGame.setTeam1("Reds");
        TheGame.setTeam2("Blues");

        System.out.println("The game is between " + TheGame.getTeam1() +
                " and " + TheGame.getTeam2());

        // set score for wrong team  -- fail
        TheGame.setTeamScores("Greens", 1, 50);

        // set score for wrong inning  -- fail
        TheGame.setTeamScores(TheGame.getTeam1(), 8, 50);
        TheGame.setTeamScores(TheGame.getTeam1(), 5, 50);

        //set score  -- success
        TheGame.setTeamScores(TheGame.getTeam1(), 1, 50);
        TheGame.setTeamScores(TheGame.getTeam2(), 1, 49);


        // get score wrong team  -- fail
        System.out.println(TheGame.getTeamScores("greens", 1));

        // get score wrong inning  -- fail
        System.out.println(TheGame.getTeamScores(TheGame.getTeam1(), 8));
        System.out.println(TheGame.getTeamScores(TheGame.getTeam1(), 2));

        //get score -- success
        System.out.println(TheGame.getTeamScores(TheGame.getTeam1(), 1));
        System.out.println(TheGame.getTeamScores(TheGame.getTeam2(), 1));


        for (int i = 2; i < 7; i++){
            TheGame.setTeamScores(TheGame.getTeam1(), i, 50);
            TheGame.setTeamScores(TheGame.getTeam2(), i, 50);
        }

        TheGame.GameResult();


    }
}

package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class LittleLeagueBaseballGame extends BaseballGame {
    private int[] team1Scores = new int[]{-1, -1, -1, -1, -1, -1};
    private int[] team2Scores = new int[]{-1, -1, -1, -1, -1, -1};

    public LittleLeagueBaseballGame(String newTeam1, String newTeam2) {

        super(newTeam1, newTeam2);
    }


    @Override
    public void setTeamScores(String team, int inning, int score){

        boolean arrayStatus;
        if (inning -1 < 0 || inning -1 > 5){
            System.out.println("ERROR!!  inning is out of bounds - must be between 1 and 6");
            arrayStatus = false;
        }
        else{arrayStatus = true; }

        boolean InningStatus;
        if (inning > 1 && arrayStatus){
            if (team.equals(Team1)) {
                if (team1Scores[inning - 2] >= 0) {
                    InningStatus = true;
                } else {
                    InningStatus = false;
                    System.out.println("ERROR!!  you must first complete the previous inning " + (inning - 1));
                }
            }
            else if(team.equals(Team2)){
                if (team2Scores[inning - 2] >= 0) {
                    InningStatus = true;
                } else {
                    InningStatus = false;
                    System.out.println("ERROR!!  you must first complete the previous inning " + (inning - 1));
                }
            }
            else {
                InningStatus = false;
                System.out.println("ERROR!!  Not a valid team");}

        }
        else {
            InningStatus = true;
        }

        if (arrayStatus && InningStatus){
            if (team.equals(Team1)){
                team1Scores[inning -1] = score;
            }
            else if (team.equals(Team2)){
                team2Scores[inning -1] = score;
            }
            else {
                System.out.println("ERROR!! not a valid team");
            }
        }


    }


    @Override
    public String getTeamScores(String team, int inning){
        if (inning -1 < 0 || inning -1 > 5){
            return "ERROR!!  Inning is out of bounds - must be between 1 and 6";
        }

        else if (team.equals(Team1) ){
            if(team1Scores[inning - 1] < 0){
                return "Score for this inning have not yet been set";
            }
            else {
                return "Team " + Team1 + " has a score of " + team1Scores[inning - 1] + " in Inning number " + inning;
            }
        }
        else if (team.equals(Team2) ){
            if(team2Scores[inning - 1] < 0){
                return "Score for this inning have not yet been set";
            }
            else {
                return "Team " + Team2 + " has a score of " + team2Scores[inning - 1] + " in Inning number " + inning;
            }
        }
        else {
            return "Error!! Wrong team for this game";
        }

    }


    @Override
    public void GameResult(){
        int totalTeam1Score = 0;
        int totalTeam2Score = 0;
        if (team1Scores[5] > 0 && team2Scores[5] > 0){
            for (int i: team1Scores){ totalTeam1Score += i;}
            for (int i: team2Scores){ totalTeam2Score += i;}

            if (totalTeam1Score > totalTeam2Score ){
                System.out.println("Team " + Team1 + " is the Winner, with " + totalTeam1Score + " points");
            }
            else if (totalTeam2Score > totalTeam1Score ){
                System.out.println("Team " + Team2 + " is the Winner, with " + totalTeam2Score + " points");
            }
            else {System.out.println("The game has ended in a tie");}
        }
        else{System.out.println("Game has not yet finished");}


    }
}

package ProgrammingExercises;

public class BaseballGame {
    public String Team1;
    public String Team2;
    private int[] team1Scores = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1};
    private int[] team2Scores = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1};

    public BaseballGame(String newTeam1, String newTeam2) {

        Team1 = newTeam1;
        Team2 = newTeam2;
    }

    public void setTeam1(String newTeam1) {
        Team1 = newTeam1;
    }
    public void setTeam2(String newTeam2) {
        Team2 = newTeam2;
    }


    public String getTeam1(){
        return Team1;
    }

    public String getTeam2(){
        return Team2;
    }


    public void setTeamScores(String team, int inning, int score){

        boolean arrayStatus;
        if (inning -1 < 0 || inning -1 > 8){
            System.out.println("ERROR!!  inning is out of bounds - must be between 1 and 9");
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



    public String getTeamScores(String team, int inning){
        if (inning -1 < 0 || inning -1 > 8){
            return "ERROR!!  Inning is out of bounds - must be between 1 and 9";
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
            return "Wrong team for this game";
        }

    }




    public void GameResult(){
        int totalTeam1Score = 0;
        int totalTeam2Score = 0;
        if (team1Scores[8] > 0 && team2Scores[8] > 0){
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

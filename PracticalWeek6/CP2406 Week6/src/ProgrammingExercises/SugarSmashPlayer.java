package ProgrammingExercises;


public class SugarSmashPlayer {

    public int playerID;
    public String ScreenName;
    private int[] HighScores = new int[10];

    public SugarSmashPlayer(int ID, String name) {

        playerID = ID;
        ScreenName = name;
    }

    public void setID(int ID) {
        playerID = ID;
    }
    public void setName(String name) {
        ScreenName = name;
    }

    public int getID(){
        return playerID;
    }

    public String getName(){
        return ScreenName;
    }

    public void setHighScore(int level, int score){

        boolean arrayStatus;
        if (level -1 < 0 || level -1 > 9){
            System.out.println("ERROR!!  Level is out of bounds - must be between 1 and 10");
            arrayStatus = false;
        }
        else{arrayStatus = true; }

        boolean LevelStatus;
        if (level > 1 && arrayStatus){
            if (HighScores[level -2] >= 100){
                LevelStatus = true;
            }
            else{
                LevelStatus = false;
                System.out.println("ERROR!!  you must first achieve a minimum score of 100 in level " + (level -1));
            }

        }
        else {
            LevelStatus = true;
        }

        if (arrayStatus && LevelStatus){
            HighScores[level -1] = score;
        }


    }

    public String getHighScore(int level){
        if (level -1 < 0 || level -1 > 9){
            return "ERROR!!  Level is out of bounds - must be between 1 and 10";
        }

        else if (HighScores[level -1] != 0 ){
            return "High Score for level " + (level) + " is " + HighScores[level -1];
        }
        else {
            return "no high score available";
        }
    }




}


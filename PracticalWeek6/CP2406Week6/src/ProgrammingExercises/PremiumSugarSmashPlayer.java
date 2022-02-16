package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer{

    private int[] HighScores = new int[50];

    public PremiumSugarSmashPlayer(int ID, String name) {

        super(ID, name);
    }

    @Override
    public void setHighScore(int level, int score){

        boolean arrayStatus;
        if (level -1 < 0 || level -1 > 49){
            System.out.println("ERROR!!  Level is out of bounds - must be between 1 and 50");
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

    @Override
    public String getHighScore(int level){
        if (level -1 < 0 || level -1 > 49){
            return "ERROR!!  Level is out of bounds - must be between 1 and 50";
        }

        else if (HighScores[level -1] != 0){
            return "High Score for level " + (level) + " is " + HighScores[level -1];
        }
        else {
            return "no high score available";
        }
    }
}

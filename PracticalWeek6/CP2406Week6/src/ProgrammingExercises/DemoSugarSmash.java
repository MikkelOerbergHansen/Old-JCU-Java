package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class DemoSugarSmash {
    public static void main(String args[])
    {
        SugarSmashPlayer player1 = new SugarSmashPlayer(99, "jolly jumper");
        // change id and name
        player1.setID(999);
        player1.setName("JollyJumper");

        System.out.println("Players ID is: " + player1.getID() + "\n" +
                "Players screen name is: " + player1.getName());

        // set highscore  -- fail
        player1.setHighScore(11, 60);
        // get highscore  -- fail
        System.out.println(player1.getHighScore(11));

        // set highscore -- succes
        player1.setHighScore(1,100);
        player1.setHighScore(2,60);
        // get highscore -- succes
        System.out.println(player1.getHighScore(1));
        System.out.println(player1.getHighScore(2));

        // set highscore -- fail
        player1.setHighScore(3, 101);
        // get highscore -- fail
        System.out.println(player1.getHighScore(3));
        // set highscore -- succes
        player1.setHighScore(2, 101);
        player1.setHighScore(3,102);
        // get highscore -- succes
        System.out.println(player1.getHighScore(2));
        System.out.println(player1.getHighScore(3));

        System.out.println("");
        System.out.println("");


        PremiumSugarSmashPlayer player2 = new PremiumSugarSmashPlayer(11, "short round");
        // change id and name
        player2.setID(111);
        player2.setName("ShortRound");

        System.out.println("Players ID is: " + player2.getID() + "\n" +
                "Players screen name is: " + player2.getName());

        // set highscore  -- fail
        player2.setHighScore(56, 60);
        // get highscore  -- fail
        System.out.println(player2.getHighScore(56));

        // set highscore -- succes
        player2.setHighScore(1,100);
        player2.setHighScore(2,60);
        // get highscore -- succes
        System.out.println(player2.getHighScore(1));
        System.out.println(player2.getHighScore(2));

        // set highscore -- fail
        player2.setHighScore(3, 101);
        // get highscore -- fail
        System.out.println(player2.getHighScore(3));
        // set highscore -- succes
        player2.setHighScore(2, 101);
        player2.setHighScore(3,102);
        // get highscore -- succes
        System.out.println(player2.getHighScore(2));
        System.out.println(player2.getHighScore(3));



    }
}

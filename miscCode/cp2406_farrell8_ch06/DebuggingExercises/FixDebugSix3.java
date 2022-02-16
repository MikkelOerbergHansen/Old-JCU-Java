// FixDebugSix3.java
// Prompt user for value to start
// Value must be between 1 and 20 inclusive
// At command line, count down to blastoff
// With a brief pause between each displayed value

package miscCode.cp2406_farrell8_ch06.DebuggingExercises;
import javax.swing.*;
public class FixDebugSix3
{
  public static void main(String[] args) throws InterruptedException {
    String userNumString;
    int userNum, val;
    final int MIN = 1;
    final int MAX = 20;
    userNumString = JOptionPane.showInputDialog(null,
        "Enter a number between"  + MIN + " and " + MAX +  "inclusive");
    userNum = Integer.parseInt(userNumString);
    while(userNum < MIN || userNum > MAX)
    {
       userNumString = JOptionPane.showInputDialog(null,
        "Number out of range" +
        "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
       userNum = Integer.parseInt(userNumString);
    }
    for(val = userNum; val > 0; val--)
    {
      System.out.print(val + "  ");
      Thread.sleep(1000);
      //for(int x = 0; x < 100000000; ++x)
       //for(int y = 0; y < 1000000000; ++y);

       // Adjust these numbers for faster or slower performance
    }
    System.out.println("Blastoff!");
  }
}







// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument
package miscCode.cp2406_farrell8_ch14.DebuggingExercises;

import javax.swing.*;
public class FixDebugFourteen1 extends JFrame
{
   public FixDebugFourteen1(int size)
   {
      super("This is my frame");
      setSize(size, size * 2);
      //setDefaultOperation();
   }
   public static void main(String[] args)
   {
      FixDebugFourteen1 frame = new FixDebugFourteen1(200);
      frame.setVisible(true);
   } 
}

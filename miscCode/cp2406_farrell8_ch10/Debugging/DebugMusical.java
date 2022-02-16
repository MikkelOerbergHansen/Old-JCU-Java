package miscCode.cp2406_farrell8_ch10.Debugging;

public class DebugMusical extends DebugPlay
{
   protected String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is "  + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}
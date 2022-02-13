package Debugging;

public class DebugPlay
{
   protected String title;
   protected String author;

   public DebugPlay(String mytitle, String myauthor)
   {
      title = mytitle;
      author = myauthor;
   }
   public void display()
   {
      System.out.println("The performance is " + title +
        " by " + author);
   }
}
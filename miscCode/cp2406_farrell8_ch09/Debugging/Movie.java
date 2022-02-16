package miscCode.cp2406_farrell8_ch09.Debugging;

public class Movie
{
   private String name;
   private int year;
   Movie(String s, int y)
   {
      name = s;
      year = y;
   }
   public String getName()
   { 
      return name;
   }
   public int getYear()
   {
      return year;
   }
}

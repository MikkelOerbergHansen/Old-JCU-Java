package DebuggingExercises;

// Two boats should be equal
// if they hold the same number of passengers
// and also have the same power source
public class FixDebugEleven3
{
   public static void main(String args[])
   {
      DebugRowboat redBoat = new DebugRowboat();
      DebugRowboat blueBoat = new DebugRowboat();
      System.out.print("The two boats are");
      if(redBoat.equals(blueBoat))
         System.out.println(" equal");
      else
	 System.out.println(" not equal");
   }
}

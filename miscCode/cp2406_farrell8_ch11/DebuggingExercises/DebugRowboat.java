package miscCode.cp2406_farrell8_ch11.DebuggingExercises;

public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower()
   {
      super.power = "oars";
   }
}
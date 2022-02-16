package miscCode.cp2406_farrell8_ch11.DebuggingExercises;

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }
   @Override
   public void setPassengers()
   {
      super.passengers = 2400;
   }

   @Override
   public void setPower()
   {
      super.power = "four engines";
   }
}

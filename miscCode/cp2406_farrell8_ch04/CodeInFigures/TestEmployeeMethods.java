package miscCode.cp2406_farrell8_ch04.CodeInFigures;

public class TestEmployeeMethods
{
   public static void main(String[] args)
   {
      Employee aWorker = new Employee();
      aWorker.setValues();
      aWorker.methodThatUsesInstanceAttributes();
      aWorker.methodThatUsesLocalVariables();
   }
}

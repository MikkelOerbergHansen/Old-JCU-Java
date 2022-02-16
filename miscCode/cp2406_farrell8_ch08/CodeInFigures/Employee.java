package miscCode.cp2406_farrell8_ch08.CodeInFigures;

public class Employee
{
   private int empNum;
   private double empSal;
   Employee(int e, double s)
   {
      empNum = e;
      empSal = s;
   }
   public int getEmpNum()
   {
      return empNum;
   }
   public double getSalary()
   {
      return empSal;
   }
}

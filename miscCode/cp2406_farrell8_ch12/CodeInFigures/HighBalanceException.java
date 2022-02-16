package miscCode.cp2406_farrell8_ch12.CodeInFigures;

public class HighBalanceException extends Exception
{
   public HighBalanceException()
   {
      super("Customer balance is high");
   }
}

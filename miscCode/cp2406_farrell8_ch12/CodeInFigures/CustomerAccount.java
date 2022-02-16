package miscCode.cp2406_farrell8_ch12.CodeInFigures;

public class CustomerAccount
{
   private int acctNum;
   private double balance;
   public static double HIGH_CREDIT_LIMIT = 20000.00;
   public CustomerAccount(int num, double bal) throws HighBalanceException
   {
      acctNum = num;
      balance = bal;
      if(balance > HIGH_CREDIT_LIMIT)
         throw(new HighBalanceException());
   }
}

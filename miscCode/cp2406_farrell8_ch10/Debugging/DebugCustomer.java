package Debugging;

public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public DebugCustomer(int id, String myname, double credit)
    {
       idNumber = id;
       name = myname;
       creditLimit = credit;
    }


    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}

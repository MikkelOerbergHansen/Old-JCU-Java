package PracticalWeek7.cp2406week7.src.ProgrammingExercises;

public abstract class Division
{
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        divisionTitle = title;
        acctNum = acct;
    }
    public abstract void display();
}

package PracticalWeek5.CP2406Week5.src.ProgrammingExercises;

public class Salesperson {

    private int id;
    private double sales;
    Salesperson(int idNum, double salesNum)
    {
        id = idNum;
        sales = salesNum;
    }
    public int getId()
    {
        return id;
    }
    public double getSales()
    {
        return sales;
    }
    public void setId(int idNum)
    {
        id = idNum;
    }
    public void setSales(double salesNum)
    {
        sales = salesNum;
    }
}

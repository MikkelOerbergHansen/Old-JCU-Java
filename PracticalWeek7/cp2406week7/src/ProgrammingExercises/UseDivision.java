package ProgrammingExercises;

public abstract class UseDivision
{
    public static void main(String[] args)
    {
        DomesticDivision Division1 = new
                DomesticDivision("Sales", 123, "California");
        DomesticDivision Division2 = new
                DomesticDivision("Technology", 234, "Kansas");
        InternationalDivision Division3 = new
                InternationalDivision("Technology", 345, "Germany", "German");
        InternationalDivision Division4 = new
                InternationalDivision("Marketing", 456, "Japan",
                "Japanese");
        Division1.display();
        Division2.display();
        Division3.display();
        Division4.display();
    }
}


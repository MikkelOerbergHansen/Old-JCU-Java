package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class UsePackage {
    public static void main(String args[])
    {
        Package FirstPackage = new Package(15, "T");
        Package SecondPackage = new Package (8, "M");
        Package ThirdPackage = new Package (20, "A");


        FirstPackage.display();
        SecondPackage.display();
        ThirdPackage.display();

        InsuredPackage FirstInsuredPackage = new InsuredPackage(15, "T");
        InsuredPackage SecondInsuredPackage = new InsuredPackage (8, "M");
        InsuredPackage ThirdInsuredPackage = new InsuredPackage (20, "A");


        FirstInsuredPackage.display();
        SecondInsuredPackage.display();
        ThirdInsuredPackage.display();



    }
}

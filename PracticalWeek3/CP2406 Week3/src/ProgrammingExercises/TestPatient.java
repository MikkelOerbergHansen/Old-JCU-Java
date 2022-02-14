package ProgrammingExercises;

public class TestPatient {
    public static void main(String args[]) {
        Patient patient1 = new Patient();
        System.out.println("The ID is: " + patient1.getID());
        System.out.println("The Age of the patient is: " + patient1.getAge());
        System.out.println("Blood data: \n" + patient1.getData());

        System.out.println(" ");

        Patient patient2 = new Patient(100, 30, "AB", "+");
        System.out.println("The ID is: " + patient2.getID());
        System.out.println("The Age of the patient is: " + patient2.getAge());
        System.out.println("Blood data: \n" + patient2.getData());
    }
}

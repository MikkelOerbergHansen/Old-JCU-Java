package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

public class TestBloodData {
    public static void main(String args[]) {
        BloodData data1 = new BloodData();
        System.out.println("The blood type is " + data1.getBloodType());
        System.out.println("The RH factor is " + data1.getRHfactor());
        System.out.println(" ");
        System.out.println("We will now set new values for blood type and rh factor ");
        data1.setBloodType("A");
        data1.setRHfactor("-");
        System.out.println("The blood type is " + data1.getBloodType());
        System.out.println("The RH factor is " + data1.getRHfactor());

        System.out.println(" ");

        BloodData data2 = new BloodData("AB", "-");
        System.out.println("The blood type is " + data2.getBloodType());
        System.out.println("The RH factor is " + data2.getRHfactor());
        System.out.println(" ");
        System.out.println("We will now set new values for blood type and rh factor ");
        data2.setBloodType("B");
        data2.setRHfactor("+");
        System.out.println("The blood type is " + data2.getBloodType());
        System.out.println("The RH factor is " + data2.getRHfactor());

    }
}

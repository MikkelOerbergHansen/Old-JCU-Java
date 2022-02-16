package PracticalWeek3.CP2406Week3.src.ProgrammingExercises;

class Patient {
    private int ID;
    private int Age;
    private BloodData Data;
    Patient()
    {
        ID = 0;
        Age = 0;
        Data = new BloodData();
    }
    Patient(int MyID, int MyAge, String MyBloodType, String MyRHfactor ) {
        ID = MyID;
        Age = MyAge;
        Data = new BloodData(MyBloodType, MyRHfactor);
    }
    int getID()
    {
        return ID;
    }
    int getAge()
    {
        return Age;
    }
    String getData() {return "Blood type: " + Data.getBloodType() + "\n" + "RH factor: " + Data.getRHfactor();}

}

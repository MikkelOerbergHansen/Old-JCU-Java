package ProgrammingExercises;

class BloodData {
    private String BloodType;
    private String RHfactor;
    BloodData()
    {
        BloodType = "O";
        RHfactor = "+";
    }
    BloodData(String MyBloodType, String MyRHfactor) {
        BloodType = MyBloodType;
        RHfactor = MyRHfactor;
    }
    String getBloodType()
    {
        return BloodType;
    }
    String getRHfactor()
    {
        return RHfactor;
    }
    void setBloodType(String MyBloodType){BloodType = MyBloodType;}
    void setRHfactor(String MyRHfactor){RHfactor = MyRHfactor;}
}

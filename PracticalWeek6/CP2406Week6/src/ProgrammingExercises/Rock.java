package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

public class Rock {
    public int SampleNumber;
    public String Description;
    public int Weight;

    public Rock(int newSampleNumber, int newWeight){
        SampleNumber = newSampleNumber;
        Weight = newWeight;
        Description =  "unclassified";
    }

    public void SetSampleNumber(int newSampleNumber){
        SampleNumber = newSampleNumber;
    }
    public void SetWeight(int newWeight){
        Weight = newWeight;
    }
    public void SetDescription(String newDescription){
        Description = newDescription;
    }

    public String getDescription(){
        return Description;
    }
    public int getWeight(){
        return Weight;
    }
    public int getSampleNumber(){
        return SampleNumber;
    }


}

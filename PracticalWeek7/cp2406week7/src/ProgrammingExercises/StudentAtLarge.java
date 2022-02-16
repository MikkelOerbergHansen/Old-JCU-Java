package PracticalWeek7.cp2406week7.src.ProgrammingExercises;

public class StudentAtLarge extends Student
{
    public static final double SAL_TUITION = 2000;
    public StudentAtLarge (String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = SAL_TUITION;
    }
}

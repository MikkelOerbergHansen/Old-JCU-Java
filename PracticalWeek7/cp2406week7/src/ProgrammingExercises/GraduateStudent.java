package PracticalWeek7.cp2406week7.src.ProgrammingExercises;

public class GraduateStudent extends Student
{
    public static final double GRAD_TUITION = 6000;
    public GraduateStudent(String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = GRAD_TUITION;
    }
}

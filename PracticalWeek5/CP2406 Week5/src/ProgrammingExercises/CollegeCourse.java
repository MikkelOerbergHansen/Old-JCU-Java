package ProgrammingExercises;


class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;
    String getID()
    {
        return courseID;
    }
    int getCredits()
    {
        return credits;
    }
    char getGrade()
    {
        return grade;
    }
    void setID(String idNum)
    {
        courseID = idNum;
    }
    void setCredits(int cr)
    {
        credits = cr;
    }
    void setGrade(char gr)
    {
        grade = gr;
    }
}

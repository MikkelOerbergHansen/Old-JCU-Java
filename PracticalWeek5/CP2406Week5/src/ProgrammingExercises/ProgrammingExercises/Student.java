package ProgrammingExercises;

class Student {

    private int stuID ;
    private CollegeCourse[] course = new CollegeCourse [5];

    int getID()
    {
        return stuID;
    }
    CollegeCourse getCourse(int x)
    {
        return course[x];
    }

    void setID(int idNum)
    {
        stuID = idNum;
    }
    void setCourse(CollegeCourse c, int x)
    {
        course[x] = c;
    }
}

package ProgrammingExercises;

import javax.swing.*;

public class LabCourse extends CollegeCourse {
    private int fee;

    public LabCourse(String newDepartment,int newCourseNumber, int newcredits) {
        super(newDepartment, newCourseNumber, newcredits);
        fee = Calculatefee();
    }

    @Override
    public void display() {

        JOptionPane.showMessageDialog(null, "Information about Course number:  " + CourseNumber +
                " \n It is a Lab course \nThe Department is: " + Department + " \n The credit is: " +
                credits + "\n The course Fee is: $" + fee);
    }




    private int Calculatefee() {
        int calculatedFee;
        int creditHour = 120;
        int labFee = 50;
        calculatedFee = credits * creditHour + labFee;

        return calculatedFee;
    }
}

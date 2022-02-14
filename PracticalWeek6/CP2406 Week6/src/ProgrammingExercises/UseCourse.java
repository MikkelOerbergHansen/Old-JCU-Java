package ProgrammingExercises;

import javax.swing.*;

public class UseCourse {
    public static void main(String args[]) {
        String[] LabCourse = {"BIO", "CHM", "CIS", "PHY"};
        String inputDepartment;
        int inputCredits;
        int inputCourseNumber;



        JTextField Department = new JTextField();
        JTextField CourseNumber = new JTextField();
        JTextField Credits = new JTextField();
        Object[] message = {
                "Department:", Department,
                "Course Number:", CourseNumber,
                "Credits:", Credits
        };

        int choice = JOptionPane.showConfirmDialog(null, message, "College course",
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            inputDepartment = Department.getText().toUpperCase();
            inputCourseNumber = Integer.parseInt(CourseNumber.getText());
            inputCredits = Integer.parseInt(Credits.getText());

            boolean isLab = false;

            for (String dept : LabCourse){
                if (inputDepartment.equals(dept)){
                    LabCourse ItIsLabCourse = new LabCourse(inputDepartment, inputCourseNumber, inputCredits);
                    ItIsLabCourse.display();
                    isLab = true;
                    break;
                }
            }

            if( !isLab){
                CollegeCourse ItIsCollegeCourse = new CollegeCourse(inputDepartment, inputCourseNumber, inputCredits);
                ItIsCollegeCourse.display();
            }



        } else {
            System.exit(0);
        }

    }


}

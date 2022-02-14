package ProgrammingExercises;

import javax.swing.*;

public class CollegeCourse {
        public String Department;
        public int CourseNumber;
        public int credits;
        private int fee;

        public CollegeCourse(String newDepartment,int newCourseNumber, int newcredits) {
            Department = newDepartment;
            CourseNumber = newCourseNumber;
            credits = newcredits;
            fee = Calculatefee();
        }

        public void display() {

            JOptionPane.showMessageDialog(null, "Information about Course number:  " +
                    CourseNumber +
                    " \n The Department is: " + Department + " \n The credit is: " +
                    credits + "\n The course Fee is: $" + fee);
        }


        private int Calculatefee() {
            int calculatedFee;
            int creditHour = 120;
            calculatedFee = credits * creditHour;

            return calculatedFee;
        }
}

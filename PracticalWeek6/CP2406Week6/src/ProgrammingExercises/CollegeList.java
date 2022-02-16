package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

import javax.swing.*;


public class CollegeList {
    public static void main(String args[])
    {
        Student[] StudentList = new Student[7];
        CollegeEmployee[] CollegeEmployeeList = new CollegeEmployee[4];
        Faculty[] FacultyList = new Faculty[3];

        int Studentnum = 0;
        int CollegeEmployeenum = 0;
        int Facultynum = 0;


        String UserChoice = "";
        String message = "Choose which type of Person to register: " + "\n S = Student " + "\n C = College Employee" +
                "\n F = Faculty " + "\n Q = quit";

        while (! UserChoice.equals( "Q")){
            String input = JOptionPane.showInputDialog(null, message, "Register a Person",
                    JOptionPane.QUESTION_MESSAGE);
            if (input == null)
                System.exit(0);
            UserChoice = input.toUpperCase();
            if (UserChoice.equals("S")){
                if (Studentnum < StudentList.length){
                    Student inpStudent = new Student();
                    inpStudent.SetFields();
                    StudentList[Studentnum] = inpStudent;
                    Studentnum += 1;
                }
                else{JOptionPane.showMessageDialog(null, "Error! The list is already full");}

            }
            else if (UserChoice.equals("F")){
                if (Facultynum < FacultyList.length){
                    Faculty inpFaculty = new Faculty();
                    inpFaculty.SetFields();
                    FacultyList[Facultynum] = inpFaculty;
                    Facultynum += 1;
                }
                else{JOptionPane.showMessageDialog(null, "Error! The list is already full");}

            }
            else if (UserChoice.equals("C")){
                if (CollegeEmployeenum < CollegeEmployeeList.length){
                    CollegeEmployee inpCollegeEmployee = new CollegeEmployee();
                    inpCollegeEmployee.SetFields();
                    CollegeEmployeeList[CollegeEmployeenum] = inpCollegeEmployee;
                    CollegeEmployeenum += 1;
                }
                else{JOptionPane.showMessageDialog(null, "Error! The list is already full");}

            }

        }


        System.out.println("Students:");
        if (Studentnum == 0){
            System.out.println("You Have registered 0 Students");
        }
        else{
            for (int x = 0; x < Studentnum; ++x){
                StudentList[x].display();
            }
        }
        System.out.println("College Employees:");
        if (CollegeEmployeenum == 0){
            System.out.println("You Have registered 0 College Employees");
        }
        else{
            for (int x = 0; x < CollegeEmployeenum; ++x){
                CollegeEmployeeList[x].display();
            }
        }
        System.out.println("Faculty:");
        if (Facultynum == 0){
            System.out.println("You Have registered 0 Faculty");
        }
        else{
            for (int x = 0; x < Facultynum; ++x){
                FacultyList[x].display();
            }
        }





    }
}

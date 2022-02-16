package PracticalWeek5.CP2406Week5.src.ProgrammingExercises;

import javax.swing.*;

public class InputGrades {
    public static void main(String[] args) {
        int studentNum = 0;
        String[] choices = {"Enter new Student", "Display Students information"};
        String[] OnlyOneChoice = {"Display Students information"};
        String Choice = "";
        Student[] studentarray = new Student[10];
        Student studentObject;


        while(Choice.isEmpty()) {
            if (studentNum < 10) {
                Choice = (String) JOptionPane.showInputDialog(null, "Choose What to do",
                        "Student information system", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
                if (Choice == null) {
                    System.exit(0);
                }
            }
            else{
                Choice = (String) JOptionPane.showInputDialog(null, "Choose What to do",
                        "Student information system", JOptionPane.QUESTION_MESSAGE, null,
                        OnlyOneChoice, choices[0]);
                if (Choice == null) {
                    System.exit(0);
                }
            }
            if (Choice.equals("Enter new Student") && studentNum < 10) {
                studentObject = EnterStudentInfo(studentNum);
                studentarray[studentNum] = studentObject;
                studentNum += 1;
                Choice = "";
            }
            if (Choice.equals("Display Students information")){
                DisplayStudentInfo(studentarray);
                Choice = "";
            }

        }


    }

        private static Student EnterStudentInfo(int studentNumber)
        {
            int y, z;
            final int NUM_COURSES = 5;
            char gradeEntry = ' ';
            Student stu = new Student();
            char[] grades = {'A', 'B', 'C', 'D', 'F'};
            int idEntry = 0;
            boolean entryStatus = false;
            String CreditsEntry;
            String GradeEntry;
            int credits = -1;
            String courseEntry = "";

            while (!entryStatus) {
                String entry = JOptionPane.showInputDialog(null, "For student #" +
                        (studentNumber + 1) + ", enter the student ID");
                if (entry == null) {
                    System.exit(0);
                }
                try {
                    if (entry.isEmpty())
                        throw new Exception();
                    idEntry = Integer.parseInt(entry);
                    if (idEntry == 0)
                        entryStatus = false;
                    else
                        entryStatus = true;
                }
                catch (Exception e) {
                    entryStatus = false;
                }
            }

            stu.setID(idEntry);
            for(y = 0; y < NUM_COURSES; ++y)
            {
                boolean CourseEntryStatus = false;
                while (!CourseEntryStatus) {
                    courseEntry = JOptionPane.showInputDialog(null,
                            "For student #" + (studentNumber + 1) + ", enter course #" +
                                    (y + 1));
                    if (courseEntry == null) {
                        System.exit(0);
                    }
                    try{
                        if (courseEntry.isEmpty())
                            throw new Exception();
                        else
                            CourseEntryStatus = true;
                    }
                    catch (Exception e){
                        CourseEntryStatus = false;
                    }
                }

                boolean CreditEntryStatus = false;
                while (!CreditEntryStatus) {
                    CreditsEntry = JOptionPane.showInputDialog(null,
                            "For student #" + (studentNumber + 1) +
                                    ", enter credits for course  #" + (y + 1));
                    if (CreditsEntry == null) {
                        System.exit(0);
                    }
                    try{
                        if (CreditsEntry.isEmpty())
                            throw new Exception();
                        credits = Integer.parseInt(CreditsEntry);
                        if (credits < 0)
                            CreditEntryStatus = false;
                        else
                            CreditEntryStatus = true;
                    }
                    catch (Exception e){
                        CreditEntryStatus = false;
                    }
                }

                boolean isGoodGrade = false;
                while(!isGoodGrade)
                {
                    GradeEntry  = JOptionPane.showInputDialog(null,
                            "For student #" + (studentNumber + 1) +
                                    ", enter grade for course  #" + (y + 1));
                    if (GradeEntry == null) {
                        System.exit(0);
                    }
                    gradeEntry = GradeEntry.charAt(0);
                    for(z = 0; z < grades.length; ++z)
                    {
                        if(gradeEntry == grades[z])
                            isGoodGrade = true;
                    }
                }
                CollegeCourse temp = new CollegeCourse();
                temp.setID(courseEntry);
                temp.setCredits(credits);
                temp.setGrade(gradeEntry);
                stu.setCourse(temp, y);
            }

            return stu;

        }

        private static void DisplayStudentInfo(Student[] myStudentArray)
        {
            for(int x = 0; x < myStudentArray.length;  ++x)
            {
                if (myStudentArray[x] == null){
                    break;
                }
                String message  = "Student #" + (x + 1) + "  ID #" +
                        myStudentArray[x].getID();
                for(int y = 0; y < 5; ++y)
                {
                    new CollegeCourse();
                    CollegeCourse temp;
                    temp =  myStudentArray[x].getCourse(y);
                    message = message + "\n" + temp.getID() + " " + temp.getCredits() + "  -- credits. Grade is "
                            + temp.getGrade();
                }
                JOptionPane.showMessageDialog(null, message);
            }
        }
}

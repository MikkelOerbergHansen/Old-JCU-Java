package ProgrammingExercises;

import javax.swing.*;

public class WeekSalary {
    public static void main(String args[]) {
        int SkillLevel = 0;
        int Hours = -1;
        double WeeklySalary = 0.00;
        double MEDICAL = 32.50;
        double DENTAL = 20.00;
        double LONGTERM = 10.00;
        double RATE1 = 17.00;
        double RATE2 = 20.00;
        double RATE3 = 22.00;
        String UserChoice1;
        String UserChoice2;
        String UserChoice3;
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field5 = new JTextField();

        Object[] message = {
                "Select one or more options by entering Yes or No: ",
                "\n",
                "Medical insurance: for $32.50 per week:", field1,
                "Dental insurance: for $20.00 per week:", field2,
                "Long-Term disability insurance: for $10.00 per week:", field3,};

        Object[] message2 = {
                "Please enter your skill level between 1 and 3", field4,
                "Please enter your total work hours", field5,
        };

        int option2 = JOptionPane.showConfirmDialog(null, message2,
                "Exercise 6 - Weekly Salary", JOptionPane.OK_CANCEL_OPTION);
        if (option2 == JOptionPane.OK_OPTION){

            String SkillInput = field4.getText();
            while (SkillLevel < 1 ) {
                try {
                    if (SkillInput.isEmpty())
                        throw new Exception();
                    SkillLevel = Integer.parseInt(SkillInput);
                    if (SkillLevel < 1 || SkillLevel > 3)
                        throw new Exception();
                } catch (Exception e) {
                    SkillInput = JOptionPane.showInputDialog(null, "Invalid input! \n Skill " +
                            "level" + " must be an integer" + " >= 1 and <= 3");
                    if (SkillInput == null){
                        System.exit(0);
                    }
                }
            }

            String HourInput = field5.getText();
            while (Hours < 0 ) {
                try {
                    if (HourInput.isEmpty())
                        throw new Exception();
                    Hours = Integer.parseInt(HourInput);
                    if (Hours < 0)
                        throw new Exception();
                } catch (Exception e) {
                    HourInput = JOptionPane.showInputDialog(null, "Invalid input! \n Number" +
                            " of Hours must be an integer" + " >= 0");
                    if (HourInput == null){
                        System.exit(0);
                    }
                }
            }

            if (SkillLevel > 1){
                int option = JOptionPane.showConfirmDialog(null, message,
                        "Exercise 6 - Weekly Salary", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION){
                    UserChoice1 = field1.getText().toLowerCase();
                    UserChoice2 = field2.getText().toLowerCase();
                    UserChoice3 = field3.getText().toLowerCase();

                    while (!"yes".equals(UserChoice1) && !"no".equals(UserChoice1) && !"".equals(UserChoice1)) {
                        UserChoice1 = JOptionPane.showInputDialog(null, "Invalid input for" +
                                " medical insurance! \n you must choose by entering yes or no/blank");
                        if (UserChoice1 == null) {
                            System.exit(0);
                        }
                    }

                    while (!"yes".equals(UserChoice2) && !"no".equals(UserChoice2) && !"".equals(UserChoice2)) {
                        UserChoice2 = JOptionPane.showInputDialog(null, "Invalid input for" +
                                " dental insurance! \n you must choose by entering yes or no/blank");
                        if (UserChoice2 == null) {
                            System.exit(0);
                        }
                    }

                    while (!"yes".equals(UserChoice3) && !"no".equals(UserChoice3) && !"".equals(UserChoice3)) {
                        UserChoice3 = JOptionPane.showInputDialog(null, "Invalid input for" +
                                " Long-Term disability insurance! \n you must choose by entering yes or no/blank");
                        if (UserChoice3 == null) {
                            System.exit(0);
                        }
                    }

                    if (SkillLevel == 2){
                        if (Hours > 40){
                            WeeklySalary = 40 * RATE2 + (Hours-40)*(1.5*RATE2);
                        }
                        else
                            WeeklySalary = Hours * RATE2;
                    }
                    if (SkillLevel == 3){
                        if (Hours > 40){
                            WeeklySalary = 40 * RATE3 + (Hours-40)*(1.5*RATE3);
                        }
                        else
                            WeeklySalary = Hours * RATE3;
                    }

                    if (UserChoice1.equals("yes")){
                        WeeklySalary = WeeklySalary - MEDICAL;
                    }
                    if (UserChoice2.equals("yes")){
                        WeeklySalary = WeeklySalary - DENTAL;
                    }
                    if (UserChoice3.equals("yes")){
                        WeeklySalary = WeeklySalary - LONGTERM;
                    }
                    JOptionPane.showMessageDialog(null, "Your total salary for this week: \n" +
                            "$" + WeeklySalary);

                }
                if (option == JOptionPane.CANCEL_OPTION){
                    System.exit(0);
                }

            }
            else if (Hours > 40){
                JOptionPane.showMessageDialog(null, "Your total salary for this week: \n" +
                        "$" + (40 * RATE1 + (Hours - 40)*(1.5*RATE1)));
            }
            else
                JOptionPane.showMessageDialog(null, "Your total salary for this week: \n" +
                        "$" + (Hours * RATE1 ));
        }
        if (option2 == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }

    }

}

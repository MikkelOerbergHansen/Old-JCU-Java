package ProgrammingExercises;

import javax.swing.*;

public class PastPresentFuture {
    public static void main(String args[]) {
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();

        int Day = 0;
        int Month = 0;
        int Year = 0;


        Object[] message = {
                "Make an input for each field: ",
                "\n",
                "Day:", field1,
                "Month:", field2,
                "Year:", field3,
        };
        int option = JOptionPane.showConfirmDialog(null, message,
                "Past, Present and Future", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            String DayInput = field1.getText();
            while (Day < 1 ) {
                try {
                    if (DayInput.isEmpty())
                        throw new Exception();
                    Day = Integer.parseInt(DayInput);
                    if (Day < 1 || Day > 31)
                        throw new Exception();
                } catch (Exception e) {
                    DayInput = JOptionPane.showInputDialog(null, "Invalid input! \n Day" +
                            " must be an integer" + " >= 1 and <= 31");
                    if (DayInput == null){
                        System.exit(0);
                    }
                }
            }

            String MonthInput = field2.getText();
            while (Month < 1 ) {
                try {
                    if (MonthInput.isEmpty())
                        throw new Exception();
                    Month = Integer.parseInt(MonthInput);
                    if (Month < 1 || Month > 12)
                        throw new Exception();
                } catch (Exception e) {
                    MonthInput = JOptionPane.showInputDialog(null, "Invalid input! \n Month" +
                            " must be an integer" + " >= 1 and <= 12");
                    if (MonthInput == null){
                        System.exit(0);
                    }
                }
            }

            String YearInput = field3.getText();
            while (Year < 1 ) {
                try {
                    if (YearInput.isEmpty())
                        throw new Exception();
                    Year = Integer.parseInt(YearInput);
                    if (Year < 1)
                        throw new Exception();
                } catch (Exception e) {
                    YearInput = JOptionPane.showInputDialog(null, "Invalid input! \n Year" +
                            " must be an integer" + " >= 1 ");
                    if (YearInput == null){
                        System.exit(0);
                    }
                }
            }

            if (Year != 2018)
                JOptionPane.showMessageDialog(null, "Your date is not this year");
            else if (Month < 8)
                JOptionPane.showMessageDialog(null, "Your date is an earlier month this year");
            else if (Month > 8)
                JOptionPane.showMessageDialog(null, "Your date is a later month this year");
            else
                JOptionPane.showMessageDialog(null, "Your date is in this month this year");




        }
        if (option == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }


    }


}

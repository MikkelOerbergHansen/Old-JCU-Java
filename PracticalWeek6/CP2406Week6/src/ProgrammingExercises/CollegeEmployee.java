package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

import javax.swing.*;

public class CollegeEmployee extends Person {
    public int SocialSecurity = 0;
    public int Salary = 0;
    public String Department = "";

    public CollegeEmployee(){
        super();
    }

    @Override
    public void SetFields(){

        JTextField inSocialSecurity = new JTextField();
        JTextField inSalary = new JTextField();
        JTextField inDepartment = new JTextField();
        JTextField inFirstName = new JTextField();
        JTextField inLastName = new JTextField();
        JTextField inAdress = new JTextField();
        JTextField inZipcode = new JTextField();
        JTextField inPhoneNumber = new JTextField();
        Object[] message = {
                "First Name:", inFirstName,
                "Last Name:", inLastName,
                "Adress:", inAdress,
                "ZipCode:", inZipcode,
                "Phone Number:", inPhoneNumber,
                "Social Security Number:", inSocialSecurity,
                "Salary:", inSalary,
                "Department", inDepartment
        };

        int choice = JOptionPane.showConfirmDialog(null, message, "College Employee",
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            FirstName = inFirstName.getText();
            LastName = inLastName.getText();
            Adress = inAdress.getText();
            Zipcode = Integer.parseInt(inZipcode.getText());
            phoneNumber = Integer.parseInt(inPhoneNumber.getText());
            SocialSecurity = Integer.parseInt(inSocialSecurity.getText());
            Salary = Integer.parseInt(inSalary.getText());
            Department = inDepartment.getText();

        }else{
            System.exit(0);
        }

    }

    @Override
    public void display(){
        String printmessage = " " + FirstName + " " + LastName + ", Adress: " + Adress + " " + Zipcode
                + ", Phone Number: " +
                phoneNumber + ", Social Security Number: " + SocialSecurity + ", Salary: $" + Salary +
                ", Department: " + Department;
        System.out.println(printmessage);
    }




}

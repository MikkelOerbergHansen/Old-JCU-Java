package ProgrammingExercises;

import javax.swing.*;

public class Faculty extends CollegeEmployee {
    public boolean Tenured = false;

    public Faculty(){
        super();
    }

    @Override
    public void SetFields(){
        String[] choices = { "true", "false" };

        JTextField inSocialSecurity = new JTextField();
        JTextField inSalary = new JTextField();
        JTextField inDepartment = new JTextField();
        JComboBox inTenured = new JComboBox(choices);
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
                "Department", inDepartment,
                "Tenured", inTenured
        };

        int choice = JOptionPane.showConfirmDialog(null, message, "Faculty",
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
            Tenured = Boolean.parseBoolean(inTenured.getSelectedItem().toString());

        }else{
            System.exit(0);
        }

    }

    @Override
    public void display(){
        String printmessage = " " + FirstName + " " + LastName + ", Adress: " + Adress + " " + Zipcode +
                ", Phone Number: " +
                phoneNumber + ", Social Security Number: " + SocialSecurity + ", Salary: $" + Salary +
                ", Department: " + Department + ", Tenured: " + Tenured;
        System.out.println(printmessage);
    }











}

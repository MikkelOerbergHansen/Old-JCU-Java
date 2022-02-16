package PracticalWeek6.CP2406Week6.src.ProgrammingExercises;

import javax.swing.*;

public class Student extends Person {
    public String Major = "";
    public int GPA = 0;

    public Student(){
        super();
    }

    @Override
    public void SetFields(){

        JTextField inFirstName = new JTextField();
        JTextField inLastName = new JTextField();
        JTextField inAdress = new JTextField();
        JTextField inZipcode = new JTextField();
        JTextField inPhoneNumber = new JTextField();
        JTextField inMajor = new JTextField();
        JTextField inGPA = new JTextField();
        Object[] message = {
                "First Name:", inFirstName,
                "Last Name:", inLastName,
                "Adress:", inAdress,
                "ZipCode:", inZipcode,
                "Phone Number:", inPhoneNumber,
                "Major:", inMajor,
                "GPA:", inGPA
        };

        int choice = JOptionPane.showConfirmDialog(null, message, "Student",
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            FirstName = inFirstName.getText();
            LastName = inLastName.getText();
            Adress = inAdress.getText();
            Zipcode = Integer.parseInt(inZipcode.getText());
            phoneNumber = Integer.parseInt(inPhoneNumber.getText());
            Major = inMajor.getText();
            GPA = Integer.parseInt(inGPA.getText());


        }else{
            System.exit(0);
        }

    }


    @Override
    public void display(){
        String printmessage = " " + FirstName + " " + LastName + ", Adress: " + Adress + " " + Zipcode
                + ", Phone Number: " +
                phoneNumber + ", Major: " + Major + ", GPA: " + GPA;
        System.out.println(printmessage);
    }



}

package ProgrammingExercises;

import javax.swing.*;

public class Person {
    public String FirstName = "";
    public String LastName = "";
    public String Adress = "";
    public int Zipcode = 0;
    public int phoneNumber = 0;

    public Person(){}

    public void SetFields(){

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
                "Phone Number:", inPhoneNumber
        };

        int choice = JOptionPane.showConfirmDialog(null, message, "Person",
                JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            FirstName = inFirstName.getText();
            LastName = inLastName.getText();
            Adress = inAdress.getText();
            Zipcode = Integer.parseInt(inZipcode.getText());
            phoneNumber = Integer.parseInt(inPhoneNumber.getText());
        }else{
            System.exit(0);
        }

    }

    public void display(){
        String printmessage = " " + FirstName + " " + LastName + ", Adress: " + Adress + " " + Zipcode
                + ", Phone Number: " +
                phoneNumber;
        System.out.println(printmessage);
    }


}

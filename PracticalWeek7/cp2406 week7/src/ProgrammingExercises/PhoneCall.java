package ProgrammingExercises;

/*Parent abstract class
String = phoneNumber
Double = price
* */

public abstract class PhoneCall {

    //variable Declaration
    String phoneNumber;
    double price;

    //Public Class constructor
    public PhoneCall(String num){
        phoneNumber = num;
        price = 0.0;
    }

    //set method for setting price
    public void setPrice(double pr) {
        price = pr;
    }

    //abstract get methods
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}

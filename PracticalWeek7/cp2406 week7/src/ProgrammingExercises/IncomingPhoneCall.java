package ProgrammingExercises;

//Child class of PhoneCall.java
public class IncomingPhoneCall extends PhoneCall {
    //Variable declaration for RATE for Incoming calls
    public final static double RATE = 0.02;

    public IncomingPhoneCall(String num){
        super(num);
        price = RATE;
    }

    //Both incoming and outgoing will need a getInfo() method
    //this will be called in demo and array classes
    //instead of specifying .getAttribute()
    public void getInfo(){
        System.out.println("The caller is: " + getPhoneNumber() + "\n " +
                RATE + " per call. Total is $" + getPrice());
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }
}

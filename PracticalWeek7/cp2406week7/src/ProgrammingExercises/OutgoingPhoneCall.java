package ProgrammingExercises;

//Child of Class: PhoneCall.java
public class OutgoingPhoneCall extends PhoneCall {

    //variable declaration for RATE and minutes of phone call made by user
    public final static double RATE = 0.04;
    private int minutes;

    public OutgoingPhoneCall(String num, int mins){
        super(num);
        minutes = mins;
        price = minutes * RATE;
    }

    public void getInfo(){
        System.out.println("Making a call from: " + getPhoneNumber() + "\n " +
                RATE + " per minute at: " + minutes +
                " minutes.  Total is $" + getPrice());
    }


    public double getPrice() {
        return price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

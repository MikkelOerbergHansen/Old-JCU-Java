package ProgrammingExercises;

//Runs program using PhoneCall, Incoming/OutgoingPhoneCall.java files
public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall inCall = new IncomingPhoneCall("1234 5678");
        OutgoingPhoneCall outCall = new OutgoingPhoneCall("9876 5432", 10);

        //method calls to retrieve information about calls
        inCall.getInfo();
        outCall.getInfo();
    }
}

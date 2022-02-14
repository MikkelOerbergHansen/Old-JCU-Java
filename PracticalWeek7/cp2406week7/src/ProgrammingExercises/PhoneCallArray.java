package ProgrammingExercises;

//printing 10 phone calls from an array using a for loop
public class PhoneCallArray {
    public static void main(String[] args) {

        //array variable declaration w/ loop counter
        PhoneCall aCall[] = new PhoneCall[10];
        int x;

        //Add items to an array, starting at zero
        aCall[0] = new IncomingPhoneCall("11111111");
        aCall[1] = new OutgoingPhoneCall("22222222", 17);
        aCall[2] = new IncomingPhoneCall("33333333");
        aCall[3] = new IncomingPhoneCall("444444444");
        aCall[4] = new OutgoingPhoneCall("5555555555", 12);
        aCall[5] = new OutgoingPhoneCall("6666666666", 54);
        aCall[6] = new IncomingPhoneCall("7777777777");
        aCall[7] = new OutgoingPhoneCall("8888888888", 22);
        aCall[8] = new OutgoingPhoneCall("9999999999", 33);
        aCall[9] = new IncomingPhoneCall("1111000000");


        //For loop for counting and printing array
        for (x = 0; x < aCall.length; ++x){
            //note getInfo() method has a string message already,
            // and is specific to each type of call
            aCall[x].getInfo();
            System.out.println("*************");
        }
    }
}

package Ex02;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class DemoPhoneCalls {

    public static void main(String[] args) {
        IncomingCall inCall = new IncomingCall("000");
        OutgoingCall outCall = new OutgoingCall("999", 4d);

        System.out.println(inCall.getDetails());
        System.out.println(outCall.getDetails());
    }
}

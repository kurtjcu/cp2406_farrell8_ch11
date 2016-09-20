package Ex02;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class PhoneCallArray {
    public PhoneCall[] calls;

    public PhoneCallArray() {
        calls = new PhoneCall[10];
    }

    public static void main(String[] args) {
        PhoneCallArray callArray = new PhoneCallArray();

        for (int i = 0; i < 5; i++){
            callArray.calls[i] = new IncomingCall(String.format("%d",123 * i));
            callArray.calls[i+5] = new OutgoingCall(String.format("%d",321 * i), (i * 9) + 1d);

        }

        for(PhoneCall call : callArray.calls){
            System.out.println(call.getDetails());
        }

    }
}

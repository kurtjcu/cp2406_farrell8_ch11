package Ex02;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class IncomingCall extends PhoneCall{

    public IncomingCall(String number){
        super(number);
        super.setPrice(0.02d);
    }

    @Override
    public Double getPrice() {
        return super.price;
    }

    @Override
    public String getNumber() {
        return super.number;
    }

    @Override
    public String getDetails() {
        return ("Number: " + getNumber() + " Rate:" + getPrice()+ " Price:" + getPrice());
    }
}

package Ex02;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class OutgoingCall extends PhoneCall{

    Double rate = 0.04d;
    Double time;

    public OutgoingCall(String number, Double time){
        super(number);
        super.setPrice(rate * time);
        this.time = time;

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
        return ("Number: " + getNumber() + " Rate:" + rate + " Time:" + time +" Price:" + getPrice());
    }
}
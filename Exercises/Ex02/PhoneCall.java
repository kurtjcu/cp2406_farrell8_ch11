package Ex02;

import java.util.AbstractCollection;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public abstract class PhoneCall {
    String number;
    Double price;

    PhoneCall(String number){
        this.number = number;
        this.price = 00d;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double getPrice();
    public abstract String getNumber();
    public abstract String getDetails();
}

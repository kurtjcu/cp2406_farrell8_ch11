package Ex01;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public abstract class Book {
    public String title;
    public Double price;


    public Book(String title) {
        this.title = title;
    }


    public Double getPrice() {
        return price;
    }

    public abstract void setPrice();

    public String getTitle() {
        return title;
    }
}

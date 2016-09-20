package Ex01;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("fiction book");
        NonFiction nonFiction = new NonFiction("nonFiction book");

        System.out.println("Fiction book: " + fiction.getTitle() + " Price: " + fiction.getPrice());
        System.out.println("NonFiction book: " + nonFiction.getTitle() + " Price: " + nonFiction.getPrice());
    }
}

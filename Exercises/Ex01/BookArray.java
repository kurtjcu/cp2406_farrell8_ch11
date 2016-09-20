package Ex01;

/**
 * Created by kurt.Schoenhoff on 20/09/2016.
 */
public class BookArray {

    public Book[] books;

    public BookArray() {
        books = new Book[10];
    }

    public static void main(String[] args) {
        BookArray bookArray = new BookArray();

        for (int i = 0; i < 5; i++){
            bookArray.books[i] = new Fiction("fiction book " + i);
            bookArray.books[i+5] = new NonFiction("nonfiction book " + i);

        }

        for(Book book : bookArray.books){
            System.out.println("Fiction book: " + book.getTitle() + " Price: " + book.getPrice());
        }

    }
}

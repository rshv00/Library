import entity.Book;
import service.BookService;

public class Main {

    public static void main(final String[] args) {
        BookService bs = new BookService();
        bs.addBook(new Book());
    }

}
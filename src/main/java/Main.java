import entity.Book;
import service.BookService;

public class Main {

    public static void main(final String[] args) {
        BookService bs = new BookService();
        Book book = new Book();
        bs.addBook(book);
        System.out.println("list all books:" + bs.getBookById(1L));
        System.out.println("\n" + bs.listBooks());
    }
}
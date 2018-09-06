//package main;
////
////import main.entity.Book;
////import main.service.BookService;
////import org.springframework.context.ApplicationContext;
////import org.springframework.context.annotation.AnnotationConfigApplicationContext;
////
////public class Main {
////
////    public static void main(String[] args) {
////        ApplicationContext context =
////                new AnnotationConfigApplicationContext
////                        ("main");
////        BookService bs = context.getBean(BookService.class);
////        Book book = context.getBean(Book.class);
////        bs.addBook(book);
////        System.out.println("list all books:" + bs.getBookById(1L));
////        System.out.println("\n" + bs.listBooks());
////    }
////}
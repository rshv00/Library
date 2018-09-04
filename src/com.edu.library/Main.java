package com.edu.library;

import com.edu.library.entity.Book;
import com.edu.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext
                        ("com.edu.library");
        BookService bs = context.getBean(BookService.class);
        Book book = context.getBean(Book.class);
        bs.addBook(book);
        System.out.println("list all books:" + bs.getBookById(1L));
        System.out.println("\n" + bs.listBooks());
    }
}
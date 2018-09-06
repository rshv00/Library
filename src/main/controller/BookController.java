package main.controller;

import main.entity.Book;
import main.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    ApplicationContext context;

    BookService bs;

    @GetMapping("/add")
    public void createBook() {
        bs = context.getBean(BookService.class);
        Book book = context.getBean(Book.class);
        book.setId(12L);
        bs.addBook(book);
        System.out.println("createBook function");
    }
}

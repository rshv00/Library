package main.controller;

import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.service.AuthorService;
import main.service.BookInstanceService;
import main.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class BookController {

    @Autowired
    AuthorService as;
    @Autowired
    BookService bs;
    @Autowired
    BookInstanceService bis;

    @GetMapping("/add")
    public String createBook(@RequestParam(name="name")String name,
                           @RequestParam(name = "author")String author,
                           @RequestParam(name = "coauthor")String coauthor,
                           @RequestParam(name = "editionYear")int editionYear){
        BookInstance bookInstance = new BookInstance();
        bookInstance.setEditionYear(editionYear);
        Book book = new Book();
        book.setName(name);
        Author author1 = new Author();
        author1.setName(author);
        Author author2 = new Author();
        author2.setName(coauthor);
        bookInstance.setBook(book);
        bis.addBookInstance(bookInstance);
        bs.addBook(book);
        as.addAuthor(author1);
        as.addAuthor(author2);
        as.getAvgAgeOfReaders(1);
        return "main";
    }
}

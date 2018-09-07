package main.controller;

import main.dao.impl.UserDaoImpl;
import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.service.BookService;
import main.service.impl.AuthorServiceImpl;
import main.service.impl.BookInstanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/admin")
public class BookController {

    @Autowired
    ApplicationContext context;
    @Autowired
    AuthorServiceImpl asi;
    @Autowired
    BookService bs;

    @Autowired
    BookInstanceServiceImpl bis;

    @Autowired
    UserDaoImpl userDao;


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
        asi.addAuthor(author1);
        asi.addAuthor(author2);
        return "main";
    }
}

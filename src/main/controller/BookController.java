package main.controller;

import main.dao.impl.UserDaoImpl;
import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.entity.User;
import main.service.impl.BookServiceImpl;
import main.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/")
public class BookController {

    @Autowired
    ApplicationContext context;
    @Autowired
    BookServiceImpl bs;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserDaoImpl userDao;


    @GetMapping("/add")
    public String createBook(@RequestParam(name="name")String name,
                           @RequestParam(name = "author")String author,
                           @RequestParam(name = "coauthor")String coauthor,
                           @RequestParam(name = "editionYear")int editionYear){
        BookInstance bookInstance = new BookInstance();
        bookInstance.setAvailable(true);
        bookInstance.setEditionYear(editionYear);
        Book book = new Book();
        book.setName(name);
        Author author1 = new Author();
        author1.setName(author);
        Author author2 = new Author();
        author2.setName(coauthor);
        Set<Author> authors = new HashSet<>();
        authors.add(author1);
        authors.add(author2);
        book.setAuthors(authors);
        bookInstance.setBook(book);
        return "main";
    }
}

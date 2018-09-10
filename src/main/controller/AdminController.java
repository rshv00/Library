package main.controller;

import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.entity.Record;
import main.service.AuthorService;
import main.service.BookInstanceService;
import main.service.BookService;
import main.service.RecordService;
import main.service.impl.RecordServiceImpl;
import main.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.View;
import java.time.LocalDate;

@Controller
@RequestMapping("/admin")
public class AdminController {

        @Autowired
        AuthorService as;
        @Autowired
        BookService bs;
        @Autowired
        BookInstanceService bis;
        @Autowired
        RecordServiceImpl recordService;
        @Autowired
        UserServiceImpl userService;

        @GetMapping("/add")
        public String createBook (@RequestParam(name = "name") String name,
                @RequestParam(name = "author") String author,
                @RequestParam(name = "coauthor") String coauthor,
        @RequestParam(name = "editionYear") int editionYear){
            BookInstance bookInstance = new BookInstance();
            bookInstance.setEditionYear(editionYear);
            Book book = new Book();
            book.setName(name);
            Author author1 = new Author();
            author1.setName(author);
            Author author2 = new Author();
            author2.setName(coauthor);
            bookInstance.setBook(book);
            book.addAuthor(author1);
            book.addAuthor(author2);
            bis.addBookInstance(bookInstance);
            bs.addBook(book);
            as.addAuthor(author1);
            as.addAuthor(author2);
            return "/main";
        }

        @GetMapping("/records")
        public ModelAndView showAllRecords () {
            return new ModelAndView("admin/records", "records", recordService.listRecords());
        }

        @GetMapping("/users-list")
        public ModelAndView showUsersAndDebtors () {
            ModelAndView modelAndView = new ModelAndView("admin/users-list");
            modelAndView.addObject("users", userService.listUsers());
            modelAndView.addObject("debtors", recordService.getDebtors(30));
            return modelAndView;
        }
    }
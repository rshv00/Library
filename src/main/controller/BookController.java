package main.controller;

import main.dao.impl.UserDaoImpl;
import main.entity.Book;
import main.entity.User;
import main.service.impl.BookServiceImpl;
import main.service.impl.UserServiceImpl;
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
    @Autowired
    BookServiceImpl bs;

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserDaoImpl userDao;


    @GetMapping("/add")
    public void createBook() {
        Book book = new Book();
        bs.addBook(book);
        User user = new User();
        user.setName("sdf");
        user.setPhone("1242434324324");
        user.setLogin("asdf");
        user.setPass("asdf");
        userService.addUser(user);

    }
}

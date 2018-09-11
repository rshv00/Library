package main.controller;

import main.entity.User;
import main.service.BookInstanceService;
import main.service.impl.BookServiceImpl;
import main.service.impl.RecordServiceImpl;
import main.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    RecordServiceImpl recordService;
    @Autowired
    UserServiceImpl userService;
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    BookInstanceService bookInstanceService;

    @GetMapping("/me")
    public ModelAndView infoAboutMe() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();
        User user = userService.getUserByLogin(username);
        ModelAndView modelAndView = new ModelAndView("user/me");
        modelAndView.addObject("myRecords", recordService.getActiveRecords(user.getId()));
       modelAndView.addObject("daysOfUsing", userService.usingDays(user.getId()));
       user = userService.getUserById(user.getId());
        modelAndView.addObject("userName", user.getName());
        return modelAndView;
    }

    @GetMapping("/trends")
    public ModelAndView showTrends(@RequestParam("dropDown") String value) {
        int days = Integer.parseInt(value);
        ModelAndView modelAndView = new ModelAndView("user/trends");
        modelAndView.addObject("listOfPopular",bookService.getTopBooks(days));
        modelAndView.addObject("listOfUnpopular",bookService.getFlopBooks());
        modelAndView.addObject("numberDuringIndep",bookInstanceService.getCountInstancesAfter1991());
        return modelAndView;
    }

    @GetMapping("/history")
    public ModelAndView showMyHistory() {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();
        User user = userService.getUserByLogin(username);
        ModelAndView modelAndView = new ModelAndView("user/history");
        modelAndView.addObject("myRecords", recordService.getHistoryOfRecords(user.getId()));
        return modelAndView;
    }

    @GetMapping("/book-stats")

    public ModelAndView showBook(@RequestParam("bookName") String bookName) {
        return new ModelAndView();
    }

    @GetMapping("/change-pass")
    public ModelAndView changePass(@RequestParam(name = "password") String pass) {
        Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
        String username = loggedInUser.getName();
        User user = userService.getUserByLogin(username);
        userService.changePassword(user.getId(),pass);
        return new ModelAndView("/");
    }
    @GetMapping("/showTrends")
    public ModelAndView showTrendsPage(){
        return new ModelAndView("user/trends");
    }
}

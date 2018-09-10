package main.controller;

import main.entity.User;
import main.service.impl.RecordServiceImpl;
import main.service.impl.UserServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    RecordServiceImpl recordService;
    @Autowired
    UserServiceImpl userService;

    @GetMapping("/me")
    public ModelAndView infoAboutMe() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();
        long id = Long.parseLong(currentPrincipalName);
        ModelAndView modelAndView = new ModelAndView("user/me");
        modelAndView.addObject("myRecords", recordService.getActiveRecords(id));
        modelAndView.addObject("daysOfUsing", userService.usingDays(id));
        User user = userService.getUserById(id);
        modelAndView.addObject("userName", user.getName());
        return modelAndView;
    }
    @GetMapping("/trends")
    public String showTrends(){
        return "user/trends";
    }
}

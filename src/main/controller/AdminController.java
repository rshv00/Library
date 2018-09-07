package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/add")
    public String addBook(){
        return "WEB-INF/main";
    }
}

//    @RequestMapping("/user-list")
////    public String showUsersDebtors(ModelAndView modelAndView){
////        modelAndView.addObject()
////    }
package main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/add")
    public String addBook(){
        return "main";
    }
//    @RequestMapping("/user-list")
////    public String showUsersDebtors(ModelAndView modelAndView){
////        modelAndView.addObject()
////    }
}

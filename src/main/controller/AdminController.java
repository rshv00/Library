package main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/add")
    public String addBook(){
        return "main";
    }
}

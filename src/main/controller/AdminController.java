package main.controller;

<<<<<<< HEAD
public class AdminController {
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/add")
    public String addBook(){
        return "main";
    }
>>>>>>> a7c984f7a9970ee67651a887ed62e2d2e605ff51
}

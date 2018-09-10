package main.controller;

import main.dao.impl.BookDaoImpl;
import main.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    BookServiceImpl bookService;

    @GetMapping("/")
    public ModelAndView start(){
        ModelAndView modelAndView = new ModelAndView("main");
        modelAndView.addObject("listBook",bookService.listBooks());
        return modelAndView;
    }
}

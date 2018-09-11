package main.controller;

import main.dao.impl.BookDaoImpl;
import main.entity.Book;
import main.entity.BookInstance;
import main.service.BookInstanceService;
import main.service.BookService;
import main.service.impl.BookInstanceServiceImpl;
import main.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    BookInstanceServiceImpl bookInstService;

    @GetMapping("/")
    public ModelAndView start(){
        ModelAndView modelAndView = new ModelAndView("/main.jsp");
        ArrayList<BookInstance> list = new ArrayList<BookInstance>();
        list.addAll(bookInstService.listBooks());
        ArrayList<Integer> listYears = new ArrayList<Integer>();
        for (BookInstance bookInst:
            list ) {
            listYears.add(bookInst.getEditionYear());
        }
        modelAndView.addObject("listBook",list);
        return modelAndView;
    }
}

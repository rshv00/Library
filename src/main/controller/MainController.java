package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.applet.AppletContext;

@Controller
public class MainController {
    @GetMapping("/")
    public String onIndex(){
        return "index";
    }
}

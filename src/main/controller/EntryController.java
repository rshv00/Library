package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntryController {
    @RequestMapping("/login")
    public String onSign(){
        return "WEB-INF/main";
    }
    @RequestMapping("/register")
    public String onMainReg(){
        return "WEB-INF/main";
    }
}

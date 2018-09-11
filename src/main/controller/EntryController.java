package main.controller;

import main.entity.Author;
import main.entity.Book;
import main.entity.BookInstance;
import main.entity.User;
import main.entity.enums.UserRole;
import main.service.UserService;
import main.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class EntryController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String onSign(){
        return "main";
    }

    @RequestMapping("/register")
    public String registratiion( @RequestParam(name = "userName") String name,
                                 @RequestParam(name = "userLogin") String login,
                                 @RequestParam(name = "userPassword") String password,
                                 @RequestParam(name = "userPhone") String phone,
                                 @RequestParam(name = "birthDate") String birthDate){
      User user = new User();
      user.setName(name);
      user.setUserName(login);
      user.setPass(password);
      user.setPhone(phone);
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate localDate = LocalDate.parse(birthDate, formatter);
      user.setBirth_date(localDate);
      user.setRegistration_date(LocalDate.now());
      user.setRole(UserRole.ROLE_USER);
//      user.setId(50);
      userService.addUser(user);
      return "WEB-INF/login";
    }

    @GetMapping("/showLoginPage")
    public String loginPage() {
        return "WEB-INF/login";
    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {
        return "WEB-INF/access-denied";
    }
}

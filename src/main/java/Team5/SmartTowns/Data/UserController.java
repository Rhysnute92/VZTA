package Team5.SmartTowns.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
@Controller
public class UserController {

    private List<user> users = List.of(
            new user (1, "Mrs", "Hannah", "English", "hannah.english@gmail.com"),
            new user (2, "Mr", "Tom", "Harper", "tom.harper2@gmail.com"),
            new user (3, "Mrs", "Sarah", "Burton", "sarahburton@gmail.com"),
            new user (4, "Mr", "Nigel", "Hopkins", "nigelahopkins@gmail.com")
    );

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/userList")
    public ModelAndView userList(){
        ModelAndView mav = new ModelAndView("users.html");
        List<user> users = userRepository.getAllUsers();
        mav.addObject("users", users);
        return mav;
    }
}

package Team5.SmartTowns.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    /* TEMPORARY USER LIST --- TODO REPLACE IT WITH DATABASE LIST*/
    static List<User> users = List.of(
            new User(1, "johndoe@gmail.com", "Claire Redfield"),
            new User(2, "johndoe@gmail.com", "Albert Wesker"),
            new User(3, "johndoe@gmail.com", "Leon Kennedy"),
            new User(4, "johndoe@gmail.com", "Jill Valentine")
    );

    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable int id){
        ModelAndView mav = new ModelAndView("rewards/userProfile");
        users.stream().filter(user -> user.getId() == id).findFirst() //Convoluted way of finding the matching user to the id, probably easier to do a hashmap
                .ifPresent(result -> mav.addObject("user", result));
        return mav;
    }
}

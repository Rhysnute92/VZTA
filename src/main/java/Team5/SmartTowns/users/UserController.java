package Team5.SmartTowns.users;

import Team5.SmartTowns.rewards.Badge;
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
    static List<Badge> badges = List.of(
            new Badge(1, "Badge1", "Bage One is This", 1),
            new Badge(2, "Badge1", "Bage One is This", 4),
            new Badge(3, "Badge1", "Bage One is This", 4),
            new Badge(4, "Badge1", "Bage One is This", 5),
            new Badge(5, "Badge1", "Bage One is This", 5),
            new Badge(46, "Badge1", "Bage One is This", 5),
            new Badge(7, "Badge1", "Bage One is This", 2)
    );

    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable int id){
        ModelAndView mav = new ModelAndView("rewards/userProfile");
        users.stream()
                .filter(user -> user.getId() == id)
                .findFirst() //Convoluted way of finding the matching user to the id, probably easier to do a hashmap
                .ifPresent(result -> mav.addObject("user", result));
        mav.addObject("badges", badges);
        return mav;
    }
}

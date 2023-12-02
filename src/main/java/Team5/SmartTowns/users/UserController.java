package Team5.SmartTowns.users;


import Team5.SmartTowns.rewards.Badge;
import Team5.SmartTowns.rewards.BadgesRepository;
import Team5.SmartTowns.rewards.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BadgesRepository badgesRepository;


    /*TODO REPLACE IT WITH DATABASE LIST*/
    static List<Sticker> stickers = List.of(
            new Sticker(1, "Sticker", "Sticker", 1),
            new Sticker(2, "Sticker", "Sticker", 4),
            new Sticker(3, "Sticker", "Sticker One is This", 4),
            new Sticker(4, "Sticker", "Sticker One is This", 5),
            new Sticker(5, "Sticker", "Sticker One is This", 5),
            new Sticker(46, "Sticker", "Sticker One is This", 5),
            new Sticker(7, "Sticker", "Sticker One is This", 2)
    );

    @GetMapping("/userList")
    public ModelAndView userList() {
        ModelAndView mav = new ModelAndView("towns/userData");
        List<User> users = userRepository.getAllUsers();
        mav.addObject("users", users);
        return mav;
    }

    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable int id) {
        List<Badge> badges = badgesRepository.getAllBadges();
        List<User> users = userRepository.getAllUsers();
        ModelAndView mav = new ModelAndView("rewards/userProfile");
        users.stream()
                .filter(user -> user.getId() == id)
                .findFirst() //Convoluted way of finding the matching user to the id, probably easier to do a hashmap
                .ifPresent(result -> mav.addObject("user", result));
        mav.addObject("badges", badges);
        mav.addObject("stickers", stickers);
        return mav;
    }
}

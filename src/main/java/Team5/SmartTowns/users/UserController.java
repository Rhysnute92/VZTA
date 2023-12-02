package Team5.SmartTowns.users;


import Team5.SmartTowns.rewards.Badge;
import Team5.SmartTowns.rewards.BadgesRepository;
import Team5.SmartTowns.rewards.Sticker;
import Team5.SmartTowns.rewards.StickersRepository;
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
    @Autowired
    private StickersRepository stickersRepository;


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
        List<Sticker> stickers = stickersRepository.getAllStickers();
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

package team5.smartTowns.users;


import team5.smartTowns.rewards.Badge;
import team5.smartTowns.rewards.BadgesRepository;
import team5.smartTowns.rewards.Sticker;
import team5.smartTowns.rewards.StickersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BadgesRepository badgesRepository;
    @Autowired
    private StickersRepository stickersRepository;

    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView mav = new ModelAndView("users/login");
//        List<User> users = userRepository.getAllUsers();
//        mav.addObject("users", users);
        return mav;
    }

    @GetMapping("/userList")
    public ModelAndView userList() {
        ModelAndView mav = new ModelAndView("towns/userData");
        List<User> users = userRepository.getAllUsers();
        mav.addObject("users", users);
        return mav;
    }

    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("users/userProfile");
        List<Badge> badges = badgesRepository.getAllBadges(); /*DEPRECATED FOR THE MOMENT*/
        mav.addObject("badges", badges);
        List<Sticker> allStickers = stickersRepository.getAllStickers();
        List<User> users = userRepository.getAllUsers();
        Map<Long, Boolean> userStickers = userRepository.getStickers(id);

        for (Long stickerID : userStickers.keySet()) { //Finds and updates visibility of stickers based on what the user has
            allStickers.stream()
                    .filter(sticker -> sticker.getId()==stickerID)
                    .findFirst().ifPresent(sticker -> sticker.setVisibility(userStickers.get(stickerID)));
        }

        mav.addObject("user", userRepository.getUser(id));
        mav.addObject("stickers", allStickers);
        return mav;
    }
}

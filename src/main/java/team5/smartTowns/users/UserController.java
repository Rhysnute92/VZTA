package team5.smartTowns.users;


import team5.smartTowns.rewards.Badge;
import team5.smartTowns.rewards.Pack;
import team5.smartTowns.rewards.RewardsRepository;
import team5.smartTowns.rewards.Sticker;
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
    private RewardsRepository rewardsRepository;

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
        List<Sticker> allStickers = rewardsRepository.getAllStickers();
        List<Pack> allPacks = rewardsRepository.getAllPacks();



        List<User> users = userRepository.getAllUsers();
        Map<Long, Boolean> userStickers = userRepository.getStickers(id);
        for (Long stickerID : userStickers.keySet()) { //Finds and updates visibility of stickers based on what the user has
            allStickers.stream()
                    .filter(sticker -> sticker.getId()==stickerID)
                    .findFirst().ifPresent(sticker -> sticker.setVisibility(userStickers.get(stickerID)));
        }
        mav.addObject("user", userRepository.getUser(id));
        mav.addObject("packs", allPacks);
        mav.addAllObjects(getPackInfo(id, 1).getModelMap());


        return mav;
    }

    @GetMapping("/packInfo/{userID}/{packID}")
    public ModelAndView getPackInfo(@PathVariable int userID, @PathVariable int packID) {
        ModelAndView mav = new ModelAndView("users/userFrags :: stickersBox");
        List<Sticker> allStickers = rewardsRepository.getAllStickersFromPack(packID);
        Map<Long, Boolean> userStickers = userRepository.getStickers(userID);

        for (Long stickerID : userStickers.keySet()) { //Finds and updates visibility of stickers based on what the user has
            allStickers.stream()
                    .filter(sticker -> sticker.getId()==stickerID)
                    .findFirst().ifPresent(sticker -> sticker.setVisibility(true));
        }

        mav.addObject("stickers", allStickers);
        int progress = getPackProgress(allStickers);
        mav.addObject("progress", progress);
        mav.addObject("selectedPack", rewardsRepository.findPackByID(packID));
        return mav;
    }

    public int getPackProgress(List<Sticker> allStickers){
        /* GETS PROGRESS FOR GIVEN PACK*/
        double progress = 0;
        try {
            progress = (
                    (double) allStickers.stream().filter(Sticker::hasSticker).count()
                            / allStickers.size() )
                    * 100;
        } catch (ArithmeticException e){ //allStickers is empty
            progress = 0;
        }
        return (int)progress;
    }

}

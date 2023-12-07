package Team5.SmartTowns.users;


import Team5.SmartTowns.rewards.Pack;
import Team5.SmartTowns.rewards.RewardsRepository;
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
        List<Pack> allPacks = rewardsRepository.getAllPacks();
        mav.addObject("user", userRepository.getUserById(id));
        mav.addObject("packs", allPacks);

        mav.addAllObjects(getPackInfo(id, 1).getModelMap());

        return mav;
    }

    @GetMapping("/packInfo/{userID}/{packID}")
    public ModelAndView getPackInfo(@PathVariable int userID, @PathVariable int packID) {
        /* Displays on page the stickers present in the pack and colour the ones the
        *  user has acquired */

        ModelAndView mav = new ModelAndView("users/userFrags :: stickersBox");
        List<Sticker> allStickers = rewardsRepository.getAllStickersFromPack(packID);
        List<Long> userStickers = userRepository.getUserStickersFromPack(userID, packID);



        mav.addObject("stickers", setStickerVisibility(allStickers, userStickers));
        mav.addObject("progress", getPackProgress(allStickers));
        mav.addObject("selectedPack", rewardsRepository.findPackByID(packID));
        return mav;
    }

    public int getPackProgress(List<Sticker> userStickers){
        /* Returns the % of completion of given userStickers */
        double progress = 0;
        if (!userStickers.isEmpty()) {
            progress = userStickers.stream().filter(Sticker::hasSticker).count();
            progress = progress / userStickers.size();
            progress = Math.round(progress * 100);
        }
        return (int) progress;
    }

    public List<Sticker> setStickerVisibility(List<Sticker> displayedStickers, List<Long> userStickers){
        /* Makes displayedStickers which are present in userStickers visible */
        for (Long stickerID : userStickers) {
            displayedStickers.stream()
                    .filter(sticker -> sticker.getId()==stickerID) //Tries to find matching id from the two lists
                    .findFirst().ifPresent(sticker -> sticker.setVisibility(true));
        }
        return displayedStickers;
    }

}

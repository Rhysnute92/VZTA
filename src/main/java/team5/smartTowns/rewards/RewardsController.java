package team5.smartTowns.rewards;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import team5.smartTowns.users.User;
import team5.smartTowns.users.UserRepository;

import java.util.List;
import java.util.Map;

@Controller
public class RewardsController {

    @Autowired
    RewardsRepository rewardsRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/packInfo/{userID}/{packID}")
    public ModelAndView getPackInfo(@PathVariable int userID, @PathVariable int packID) {
        ModelAndView mav = new ModelAndView("users/userFrags :: stickersBox");
        List<Sticker> allStickers = rewardsRepository.getAllStickersFromPack(packID);
        Map<Long, Boolean> userStickers = userRepository.getStickers(userID);

        for (Long stickerID : userStickers.keySet()) { //Finds and updates visibility of stickers based on what the user has
            allStickers.stream()
                    .filter(sticker -> sticker.getId()==stickerID)
                    .findFirst().ifPresent(sticker -> sticker.setVisibility(userStickers.get(stickerID)));
        }

        mav.addObject("stickers", allStickers);

        return mav;
    }


}

package Team5.SmartTowns.users;


import Team5.SmartTowns.rewards.Pack;
import Team5.SmartTowns.rewards.RewardsRepository;
import Team5.SmartTowns.rewards.Sticker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RewardsRepository rewardsRepository;

    /* LOGIN MAPPING & FUNCTIONS */
    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView mav = new ModelAndView("users/login");
        mav.addObject("user", new NewUser( "", "", ""));
        return mav;
    }

    @PostMapping("/login/register")
    public ModelAndView registerUser(@Valid @ModelAttribute("user") NewUser user, BindingResult bindingResult, Model model) {
        ModelAndView mav = new ModelAndView("users/login", model.asMap());
        // TODO VALIDATE EMAIL INPUT

        if (bindingResult.hasErrors()) {
            System.out.println("Errors");
        }
        System.out.println(user.getName());
        System.out.println(user.getPassword());

        if ( userRepository.doesUserExist(user.getEmail()) ) {
            //TODO return modelandview for user already exists
            System.out.println(user.getEmail() + " already exists");
            System.out.print("LOG IN:");
            System.out.println(userRepository.userLogIn(user.email, user.password));
            return mav;
        } else {
            userRepository.addUser(user.name, user.email, user.password);
            System.out.println(user.getEmail() + " created");
            return mav;
        }
    }

    /* USER MAPPING & FUNCTIONS */
    @GetMapping("/user/{id}")
    public ModelAndView getUserPage(@PathVariable int id) {
        ModelAndView mav = new ModelAndView("users/userProfile");
        List<Pack> allPacks = rewardsRepository.getAllPacks();
        mav.addObject("user", userRepository.getUserById(id));
        mav.addObject("packs", allPacks);
        userRepository.addUser("Maria", "MariaEmail", "MariaPassword");
        userRepository.doesUserExist("MariaEmail");
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

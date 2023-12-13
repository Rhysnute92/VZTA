package Team5.SmartTowns.users;


import Team5.SmartTowns.rewards.Pack;
import Team5.SmartTowns.rewards.RewardsRepository;
import Team5.SmartTowns.rewards.Sticker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
        mav.addObject("error", "");
        mav.addObject("status", "");
        System.out.println(userRepository.findUserByName("Admin").getName());
        return mav;
    }

//    @GetMapping("/logout")
//    public ModelAndView getLogOutPage(){
//        ModelAndView mav = new ModelAndView("users/logout");
//        return mav;
//    }

    @PostMapping("/login/register")
    public ModelAndView registerUser(@Valid @ModelAttribute("user") NewUser user, BindingResult bindingResult, Model model) {
        ModelAndView mav = new ModelAndView("users/login", model.asMap());
        // TODO VALIDATE EMAIL INPUT
        mav.addObject("status", "active");
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("users/login");
            modelAndView.addObject("errors", bindingResult);
            return modelAndView;
        }

        if ( userRepository.doesUserExist(user.getEmail()) ) {
            mav.addObject("errors", "Email already in use");
            return mav;
        }

        try {
            userRepository.addUser(user.name, user.email, user.password);
            mav.addObject("error", "");
            //TODO return user creation success
            return mav;
        } catch (DataAccessException e) {
            mav.addObject("error", "User exists");
        }
        return mav;
    }

    @GetMapping("/userProfile")
    public ModelAndView userProfile(){
        ModelAndView mav = new ModelAndView("users/userProfile");
        List<Pack> allPacks = rewardsRepository.getAllPacks();
        mav.addObject("packs", allPacks);

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        mav.addObject("user", userRepository.findUserByName("Admin"));
        mav.addAllObjects(getPackInfo("Admin", 1).getModelMap());
        return mav;
    }


    /* USER MAPPING & FUNCTIONS */
    @GetMapping("/profile/{username}")
    public ModelAndView getUserPage(@PathVariable String username) {
        ModelAndView mav = new ModelAndView("users/userProfile");
        List<Pack> allPacks = rewardsRepository.getAllPacks();
        allPacks.remove(0);
        mav.addObject("user", userRepository.findUserByName(username));
        mav.addObject("packs", allPacks);
        mav.addAllObjects(getPackInfo(username, 1).getModelMap());
        return mav;
    }

    @GetMapping("/packInfo/{username}/{packID}")
    public ModelAndView getPackInfo(@PathVariable String username, @PathVariable int packID) {
        /* Displays on page the stickers present in the pack and colour the ones the
        *  user has acquired */

        ModelAndView mav = new ModelAndView("users/userFrags :: stickersBox");
        List<Sticker> allStickers = rewardsRepository.getAllStickersFromPack(packID);
        List<Long> userStickers = userRepository.getUserStickersFromPack(username, packID);

        List<Pack> allPacks = rewardsRepository.getAllPacks();
        Pack current = allPacks.stream().filter(pack -> pack.getId() == packID).findFirst().get();
        allPacks.remove(current);

        mav.addObject("stickers", setStickerVisibility(allStickers, userStickers));
        mav.addObject("progress", getPackProgress(allStickers));
        mav.addObject("selectedPack", rewardsRepository.findPackByID(packID));
        mav.addObject("packs", allPacks);
        mav.addObject("user", userRepository.findUserByName(username));
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

package Team5.SmartTowns.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    /* TEMPORARY USER LIST --- TODO REPLACE IT WITH DATABASE LIST*/
    List<User> users = List.of(
            new User(1, "johndoe@gmail.com", "Chris Redfield"),
            new User(2, "johndoe@gmail.com", "Claire Redfield"),
            new User(3, "johndoe@gmail.com", "Leon Kennedy"),
            new User(4, "johndoe@gmail.com", "Jill Valentine")
    );

    @GetMapping("/allTrails")
    public ModelAndView getUserPage(){
        ModelAndView mav = new ModelAndView("rewards/userProfile");
        mav.addObject("trails", users); //Mock data for trails
        return mav;
    }
}

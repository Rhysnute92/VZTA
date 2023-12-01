package Team5.SmartTowns.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;
@Controller
public class DatabaseController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private locationRepository locationRepository;
    @Autowired
    private trailsRepository trailsRepository;

    @GetMapping("/userList")
    public ModelAndView userList() {
        ModelAndView mav = new ModelAndView("towns/userData");
        List<user> users = userRepository.getAllUsers();
        mav.addObject("users", users);
        return mav;
    }
    @GetMapping("/trailList")
    public ModelAndView trailList() {
        ModelAndView mav1 = new ModelAndView("towns/trailsData");
        List<trail> trail = trailsRepository.getAllTrails();
        mav1.addObject("trails", trail);
        return mav1;
    }
    @GetMapping("locationList")
    public ModelAndView locationList(){
        ModelAndView mav2 = new ModelAndView("towns/locationData");
        List<location> locations = locationRepository.getAllLocation();
        mav2.addObject("location", locations);
        return mav2;
    }
}

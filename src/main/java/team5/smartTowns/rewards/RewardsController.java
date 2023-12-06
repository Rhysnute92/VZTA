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




}

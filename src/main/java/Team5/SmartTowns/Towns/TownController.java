package Team5.SmartTowns.Towns;

import Team5.SmartTowns.Landmarks.Landmarks;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TownController {

    @GetMapping("/home")
    public ModelAndView getTownList(){
        ModelAndView modelAndView = new ModelAndView("Towns/home/homePage");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        modelAndView.addObject("towns",towns);
        return modelAndView;

    }

//    @GetMapping("/home/town")
//    public ModelAndView getATownTrailsList(){
//        ModelAndView modelAndView = new ModelAndView("userTrails/userTrailsTemplate");
//        modelAndView.addObject("townStuff", a);
//        return modelAndView;
//    }
//

}

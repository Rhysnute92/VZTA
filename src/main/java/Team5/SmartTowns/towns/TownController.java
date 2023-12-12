package Team5.SmartTowns.towns;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TownController {

    @GetMapping("/home")
    public ModelAndView getTownList(){
        ModelAndView modelAndView = new ModelAndView("towns/home/homePage");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        modelAndView.addObject("towns",towns);
        return modelAndView;

    }
    @GetMapping("/mobile-home")
    public ModelAndView getTownListMobile(){
        ModelAndView modelAndView = new ModelAndView("towns/home/mobile-homepage");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        modelAndView.addObject("towns",towns);
        return modelAndView;

    }
}

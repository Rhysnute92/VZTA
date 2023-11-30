package Team5.SmartTowns.Towns;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TownController {

    @GetMapping("/townTest")
    public ModelAndView getTownList(){
        ModelAndView modelAndView = new ModelAndView("Towns/home/homePageTest");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        modelAndView.addObject("towns",towns);
        return modelAndView;

    }
}

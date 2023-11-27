package Team5.SmartTowns.trails;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrailsController {
    @GetMapping("/allTrails")
    public ModelAndView getAllTrails(){
        ModelAndView mav = new ModelAndView("allTrails/allTrails");
        mav.addObject("trails", Trail.trails); //Mock data for trails
        return mav;
    }
    @RequestMapping(value="/id", method=RequestMethod.POST)
    public String sendHtmlFragment(Model map) {
        map.addAttribute("foo", "bar");
        return "allTrails/allTrails";
    }
}

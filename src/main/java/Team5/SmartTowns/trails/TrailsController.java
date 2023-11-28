package Team5.SmartTowns.trails;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/allTrails/{id}")
    public ModelAndView getResultBySearchKey(@PathVariable int id)
    {
        List<Trail> trailList= Trail.trails;//results from db
        ModelAndView mv= new ModelAndView("fragments/allTrailsFrags :: trailSection");
        mv.addObject("searchList", trailList.get(id-1));

        return mv;
    }
}

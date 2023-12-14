package Team5.SmartTowns.trails;


import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.LocationRepositoryJDBC;
import Team5.SmartTowns.data.Trail;
import Team5.SmartTowns.data.TrailsRepository;
import Team5.SmartTowns.landmarks.Landmarks;
import Team5.SmartTowns.placeswithcoordinates.PlacesCoordinatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//import static Team5.SmartTowns.Landmarks.Landmarks.landmarksDragonstrail;

@Controller
public class TrailsController {

    @Autowired
    private TrailsRepository trailsRepository;

    @GetMapping("/allTrails-{city}")
    public ModelAndView getAllTrails(@PathVariable String city){
        ModelAndView mav = new ModelAndView("allTrails/allTrails");
        mav.addObject("trails", trailsRepository.getAllTrailsFromCity(city)); //Mock data for trails
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
        List<Trail> trailList = trailsRepository.getAllTrails();//results from db
        ModelAndView mv= new ModelAndView("fragments/allTrailsFrags :: trailSection");
        mv.addObject("trail", trailList.get(id-1));
        return mv;
    }

}


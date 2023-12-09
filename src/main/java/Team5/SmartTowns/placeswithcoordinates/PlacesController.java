package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.Trail;
import Team5.SmartTowns.data.TrailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
public class PlacesController {

    @Autowired
    private PlacesCoordinatesRepository placeRepo;
    @Autowired
    private LocationRepository locationRepo;




    @GetMapping("/checkpoint")
    public ModelAndView getLocationPages(){
        ModelAndView modelAndView = new ModelAndView("landmarks/locationPage.html");
        List<Location> locations =  locationRepo.getAllLocation();
//        List<Location> approvedLocations =  locationRepo.getApprovedLocations2(locations);
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Integer> locationIDIndex = new ArrayList<Integer>();
        List<Location> locationCoordsWorkaround = new ArrayList<Location>();
        for (LocationsCoordinates coord: locCoords){
            locationIDIndex.add(coord.getLocationID()-1);
            locationCoordsWorkaround.add(locations.get(coord.getLocationID()-1));
        }
        modelAndView.addObject("location", locationCoordsWorkaround);
        modelAndView.addObject("locationCoords", locCoords);
        return  modelAndView;
    }
//
//    @RequestMapping(value="/location", method= RequestMethod.POST)
//    public String sendHtmlFragment(Model map) {
//        map.addAttribute("foo", "bar");
//        return "checkpoint/checkpoint";
//    }
//
//
//    //GC example
//
//    @GetMapping("/allTrails")
//    public ModelAndView getAllTrails(){
//        ModelAndView mav = new ModelAndView("allTrails/allTrails");
//        mav.addObject("trails", Trail.trails); //Mock data for trails
//        return mav;
//    }
//    @RequestMapping(value="/id", method= RequestMethod.POST)
//    public String sendHtmlFragment(Model map) {
//        map.addAttribute("foo", "bar");
//        return "allTrails/allTrails";
//    }
//
//    @GetMapping("/allTrails/{id}")
//    public ModelAndView getResultBySearchKey(@PathVariable int id)
//    {
//        List<Trail> trailList= Trail.trails;//results from db
//        ModelAndView mv= new ModelAndView("fragments/allTrailsFrags :: trailSection");
//        mv.addObject("trail", trailList.get(id-1));
//        return mv;
//    }
}

package Team5.SmartTowns.Towns;

import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Data.Town;
import Team5.SmartTowns.Data.TownRepository;
import Team5.SmartTowns.Data.locationRepository;
import Team5.SmartTowns.Landmarks.Landmarks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TownController {
    @Autowired
    private Team5.SmartTowns.Data.locationRepository locationRepository;
    @Autowired
    private Team5.SmartTowns.Data.TownRepository townRepository;

    @GetMapping("/home")
    public ModelAndView getTownList(){
        ModelAndView modelAndView = new ModelAndView("Towns/home/homePage");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        modelAndView.addObject("towns",towns);
        return modelAndView;

    }

    @GetMapping("/home/town")
    public ModelAndView getATownTrailsList(){
        ModelAndView modelAndView = new ModelAndView("userTrails/userTrailsTemplate");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        List<Town> Towns = townRepository.getAllTowns();
        modelAndView.addObject("towns", Towns);
        List<Location> Locations = locationRepository.getAllLocation();
        modelAndView.addObject("locations", Locations);
        return modelAndView;
    }

    public List<Location> filterByLocationForTrails(List<Location> locationList , String town){
        List<Location> filteredList;
        for( location:locationList){

        }

    }


}

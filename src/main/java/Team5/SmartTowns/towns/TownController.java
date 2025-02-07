package Team5.SmartTowns.towns;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.Town;
import Team5.SmartTowns.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class TownController {
    @Autowired
    private LocationRepository locationRepository;
    @Autowired
    private Team5.SmartTowns.data.TownRepository townRepository;

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

    @GetMapping("/home/town/Caerphilly")
    public ModelAndView getATownTrailsList(){
        ModelAndView modelAndView = new ModelAndView("userTrails/userTrailsTemplate");
        TownStorage townsCurrent= new TownStorage().getInstance();
        List<Towns> towns = townsCurrent.getTownList();
        List<Town> Towns = townRepository.getAllTowns();
        modelAndView.addObject("towns", Towns);
        List<Location> Locations = locationRepository.getAllLocation();
        Locations= filterByLocationForTrails(Locations, "Caerphilly");
        modelAndView.addObject("locations", Locations);
        return modelAndView;
    }

    public List<Location> filterByLocationForTrails(List<Location> locationList , String town){
        List<Location> filteredList = new ArrayList<Location>();;
        for( Location location:locationList){
            if (Objects.equals(location.getLocationPlace(), town)){
                filteredList.add(location);
            }

        }return filteredList;

    }


}

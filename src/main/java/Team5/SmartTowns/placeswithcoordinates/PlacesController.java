package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
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




    @GetMapping("/checkpoints")
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

    @RequestMapping(value="/location", method= RequestMethod.POST)
    public String sendHtmlFragment(Model map) {
        map.addAttribute("foo", "bar");
        return "checkpoint/checkpoint";
    }

        @GetMapping("/checkpoints/{location}")
    public ModelAndView getResultBySearchKey(@PathVariable String location) {
            List<Location> locations =  locationRepo.getAllLocation();
            List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();

            List<Integer> locationIDIndex = new ArrayList<Integer>();
            List<Location> locationCoordsWorkaround = new ArrayList<Location>();
            int locationID = 999;
            int workAroundID=0;// otherwise cases errors e.g. null used. 999 unlikely to be used so safe until then
            for (int i=0;i<locCoords.size();i++){ /// for loop iterating over coordinates table need to match coordinate index with lcoation index manually
                locationIDIndex.add(locCoords.get(i).getLocationID()-1); // gets location ID and therefore location list index number
                locationCoordsWorkaround.add(locations.get(locCoords.get(i).getLocationID()-1));
                if ( (locations.get(locCoords.get(i).getLocationID() - 1).getLocationName().replace(' ', '-').trim().equals(location)) ){
                    locationID= i;
                    break;
                } workAroundID++;
            }System.out.println(locationCoordsWorkaround);
            System.out.println("ag"+locationID);
        ModelAndView modelAndView= new ModelAndView("fragments/locationPageFrags :: locationSection");
            System.out.println("ag"+locationID);
        modelAndView.addObject("locCoord", locCoords.get(locationID));
            System.out.println("sd"+workAroundID);
        modelAndView.addObject("location", locationCoordsWorkaround.get(locationID));
        return modelAndView;
    }

}

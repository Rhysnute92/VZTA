package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.Trail;
import Team5.SmartTowns.data.TrailsRepository;
import jakarta.validation.constraints.Max;
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

    @Autowired
    private TrailsRepository trailsRepo;


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
    public String sendHtmlFragmentLocation(Model map) {
        map.addAttribute("foo", "bar");
        return "checkpoint/checkpoint";
    }




        @GetMapping("/checkpoints/{location}")
    public ModelAndView getResultBySearchKeyLocation(@PathVariable String location) {
            List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
            List<Location> approvedLocations = locationRepo.getAllApprovedLocations();
            int locationID = 999;
            for (int i=0;i<approvedLocations.size();i++){
                if ( (approvedLocations.get(i).getLocationName().replace(' ', '-').trim().equals(location)) ){
                    locationID= i;
                }
            }
        ModelAndView modelAndView= new ModelAndView("fragments/locationPageFrags :: locationSection");
        modelAndView.addObject("locCoord", locCoords.get(locationID));
        modelAndView.addObject("location", approvedLocations.get(locationID));
        return modelAndView;
    }



    /// Trail webpage mapping


    @GetMapping("/trails")
    public ModelAndView getTrailsPage(){
        ModelAndView modelAndView = new ModelAndView("landmarks/trailsPage.html");
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Location> approvedLocations = locationRepo.getAllApprovedLocations();

        List<Trail> trailslocations =  trailsRepo.getAllTrails();
        List<Location> locations =  locationRepo.getAllLocation();
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Integer> locationIDIndex = new ArrayList<Integer>();
        List<Location> locationCoordsWorkaround = new ArrayList<Location>();
        for (LocationsCoordinates coord: locCoords){
            locationIDIndex.add(coord.getLocationID()-1);
            locationCoordsWorkaround.add(locations.get(coord.getLocationID()-1));
        }
        modelAndView.addObject("trails", trailslocations);
        modelAndView.addObject("locations", locationCoordsWorkaround);
        modelAndView.addObject("locationCoords", locCoords);
        return  modelAndView;
    }

    @RequestMapping(value="/trail", method= RequestMethod.POST)
    public String sendHtmlFragmentTrail(Model map) {
        map.addAttribute("foo", "bar");
        return "trail/trail";
    }

    @GetMapping("/trails/{trail}")
    public ModelAndView getResultBySearchKeyTrails(@PathVariable String trail) {
        List<Location> locations =  locationRepo.getAllLocation();
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Trail> trailslocations =  trailsRepo.getAllTrails();
        List<Integer> locationIDIndex = new ArrayList<Integer>();
        List<Location> locationCoordsWorkaround = new ArrayList<Location>();
        int trailID = 999;
        int workAroundID=0;// otherwise cases errors e.g. null used. 999 unlikely to be used so safe until then
        for (LocationsCoordinates coord: locCoords){
            locationIDIndex.add(coord.getLocationID()-1);
            locationCoordsWorkaround.add(locations.get(coord.getLocationID()-1));
        }

        for (int i=0;i<trailslocations.size();i++){

            if (trailslocations.get(i).getTrailName().replace(' ', '-').trim().equals(trail)){
                trailID=i;
            break;}
        }
        ModelAndView modelAndView= new ModelAndView("fragments/trailsPageFrags :: trailsSection");
        modelAndView.addObject("trail", trailslocations.get(trailID));
        modelAndView.addObject("locCoords", locCoords);
        modelAndView.addObject("locations", locationCoordsWorkaround);
        return modelAndView;



//        List<Trail> trailslocations =  trailsRepo.getAllTrails();
//        List<Location> locations =  locationRepo.getAllLocation();
//        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
//        List<Integer> locationIDIndex = new ArrayList<Integer>();
//        List<Location> locationCoordsWorkaround = new ArrayList<Location>();
//        for (LocationsCoordinates coord: locCoords){
//            locationIDIndex.add(coord.getLocationID()-1);
//            locationCoordsWorkaround.add(locations.get(coord.getLocationID()-1));
//        }
//        modelAndView.addObject("trails", trailslocations);
//        modelAndView.addObject("locations", locationCoordsWorkaround);
//        modelAndView.addObject("locationCoords", locCoords);
//        return modelAndView;
    }

}

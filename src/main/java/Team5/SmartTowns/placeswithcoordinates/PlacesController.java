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

import java.util.*;

@Controller
public class PlacesController {

    @Autowired
    private PlacesCoordinatesRepository placeRepo;
    @Autowired
    private LocationRepository locationRepo;

    @Autowired
    private TrailsRepository trailsRepo;

    @GetMapping("/towns")
    public ModelAndView getTownPages(){
        ModelAndView modelAndView = new ModelAndView("towns/townsPageList.html");
        List<TownWithTrails> townsList = placeRepo.getAllTownCoords();
        List<Trail> trailslocations =  trailsRepo.getAllTrails();
        modelAndView.addObject("trails", trailslocations);
        modelAndView.addObject("towns", townsList);
        return  modelAndView;
    }

    @RequestMapping(value="/town", method= RequestMethod.POST)
    public String sendHtmlFragmentTown(Model map) {
        map.addAttribute("foo", "bar");
        return "checkpoint/checkpoint";
    }

    @GetMapping("/towns/{town}")
    public ModelAndView getResultBySearchKeyTowns(@PathVariable String town) {
        List<TownWithTrails> townsList = placeRepo.getAllTownCoords();
        List<Trail> trailslocations =  trailsRepo.getAllTrails();
        List<Trail> correctTrails = new ArrayList<>();
        String townNamee="";
        int indexTown=999;
        for (int i=0;i<townsList.size();i++){
            if (Objects.equals(townsList.get(i).getTownName(), town)){
                indexTown=i;
                townNamee=town;
            }
        }
        if (indexTown!=999){
            int townIDFromTable= placeRepo.getTownIDFromName(townNamee);
            for (int i=0;i<trailslocations.size();i++){
                int trailID = trailsRepo.getTrailIDFromTrailName(trailslocations.get(i).getTrailName());
                if ((trailID>100)&&(trailID<200)&&(Objects.equals(townNamee, "Caerphilly"))){
                    correctTrails.add(trailslocations.get(i));
                }
                if ((trailID>200)&&(trailID<300)&&(Objects.equals(townNamee, "Risca"))){
                    correctTrails.add(trailslocations.get(i));
                }
                if ((trailID>300)&&(trailID<400)&& (Objects.equals(townNamee, "Penarth")) ){
                    correctTrails.add(trailslocations.get(i));
                }
            }
        }

        ModelAndView modelAndView= new ModelAndView("fragments/townsPageFrags :: townSection");
        modelAndView.addObject("town", townsList.get(indexTown));
        modelAndView.addObject("trails", correctTrails);

        return modelAndView;
    }

    @GetMapping("/checkpoints")
    public ModelAndView getLocationPages(){
        ModelAndView modelAndView = new ModelAndView("landmarks/locationPage.html");
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Location> approvedLocations = locationRepo.getAllApprovedLocations();

        modelAndView.addObject("location", approvedLocations);
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
            List<LocationsCoordinates> locCoords = reorderCoordsWRTLocations(placeRepo.getAllLocationCoords());
            List<Location> approvedLocations = locationRepo.getAllApprovedLocations();

            int locationID = 999;
            for (int i=0;i<approvedLocations.size();i++){
                if ( (approvedLocations.get(i).getLocationName().replace(' ', '-').trim().equals(location)) ){
                    locationID= i;
                }
            }

            String trailName=trailsRepo.getTrailNameWithID(approvedLocations.get(locationID).getLocationTrailID()).replace(' ', '-').trim();
        ModelAndView modelAndView= new ModelAndView("fragments/locationPageFrags :: locationSection");
        modelAndView.addObject("locCoord", locCoords.get(locationID));
        modelAndView.addObject("trail", trailName);
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
        List<Location> locationCoordsWorkaround = new ArrayList<Location>();

        modelAndView.addObject("trails", trailslocations);
        modelAndView.addObject("locations", approvedLocations);
        modelAndView.addObject("locationCoords", reorderCoordsWRTLocations(locCoords));
        return  modelAndView;
    }

    @RequestMapping(value="/trail", method= RequestMethod.POST)
    public String sendHtmlFragmentTrail(Model map) {
        map.addAttribute("foo", "bar");
        return "trail/trail";
    }

    @GetMapping("/trails/{trail}")
    public ModelAndView getResultBySearchKeyTrails(@PathVariable String trail) {
        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
        List<Location> approvedLocations = locationRepo.getAllApprovedLocations();
        List<Trail> trailslocations =  trailsRepo.getAllTrails();
        int trailID = 999;// otherwise cases errors e.g. null used. 999 unlikely to be used so safe until then
        for (int i=0;i<trailslocations.size();i++){

            if (trailslocations.get(i).getTrailName().replace(' ', '-').trim().equals(trail)){
                trailID=i;
            break;}
        }
        List<LocationsCoordinates> aa=reorderCoordsWRTLocations(locCoords);
        ModelAndView modelAndView= new ModelAndView("fragments/trailsPageFrags :: trailsSection");
        modelAndView.addObject("trail", trailslocations.get(trailID));
        modelAndView.addObject("locCoords", aa);
        modelAndView.addObject("locations", approvedLocations);
        return modelAndView;
    }


//    public List<LocationsCoordinates> reorderCoordsWRTLocations(List<LocationsCoordinates> locCoords){
//        List<Location> approvedList = locationRepo.getAllLocation();
////        List<LocationsCoordinates> locCoords = placeRepo.getAllLocationCoords();
//        List<Integer> locationID= new ArrayList<Integer>();
//        System.out.println(locCoords);
//        System.out.println("///////");
//        Collections.swap(locCoords,0,10);
//        for(int i=0;i<locCoords.size();i++){
//            if (i==locCoords.size()-1){
//                if (locCoords.get(i).getLocationID()<locCoords.get(i-1).getLocationID()){
//                    Collections.swap(locCoords,i,i--);
//                    i=0;
//                }
//
//            }
//            if (locCoords.get(i).getLocationID()>locCoords.get(i++).getLocationID()){
//                System.out.println("ASDSADASD");
//                Collections.swap(locCoords,i,i++);
//                i=0;
//            }
//
//        } System.out.println(locCoords);
//        return locCoords;
//
//
//
//    }

 // When adding to the locationsCoordinates table, the order is not based on LocationID order, therefore it is needed to rearrange this list to
    // follow ascending locationID so that any new coordinates match up with their intended locations.
    public List<LocationsCoordinates> reorderCoordsWRTLocations(List<LocationsCoordinates> locCoords){
        Collections.sort(locCoords,
                Comparator.comparingInt(LocationsCoordinates::getLocationID));
        return locCoords;

    }

    }



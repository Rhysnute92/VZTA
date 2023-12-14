package Team5.SmartTowns;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;

import Team5.SmartTowns.data.TrailsRepository;
import Team5.SmartTowns.placeswithcoordinates.LocationsCoordinates;
import Team5.SmartTowns.placeswithcoordinates.PlacesCoordinatesRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class LocationRepositoryTest  {

    @Autowired
    TrailsRepository trailsRepo;
    @Autowired
    LocationRepository locationRepository;


    @Autowired
    PlacesCoordinatesRepository placesRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;



//    @BeforeEach
//    public void beforeEachTest(){
//        jdbcTemplate.update("DELETE FROM locations");
//    }

    @Test
    public void testGetAllApprovedLocations() { // test to amke sure all approved locations are called
        List<Location> approvedLocations = locationRepository.getAllApprovedLocations();
        List<Location> allLocations = locationRepository.getAllLocation();
        for (int i=0;i<allLocations.size();i++){ // iterate over all location, removing authorised=true
            for (Location app : approvedLocations){
                if (Objects.equals(allLocations.get(i).getLocationName(), app.getLocationName())){
                    allLocations.remove(allLocations.get(i));
                }
            }
        } boolean noApporvedLeft=false;
        for (Location loc2: allLocations){
            if (loc2.isLocationApproved()){
                noApporvedLeft=false;
                break;
            } else{
                noApporvedLeft=true;
            }
        } assertTrue(noApporvedLeft);
    }


    @Test
    public void testGetAllUnapprovedLocations() { // test to make sure all unapproved coordinates are called
        List<Location> unapprovedLocations = locationRepository.getAllUnapprovedLocations();
        List<Location> allLocations = locationRepository.getAllLocation();
        for (int i=0;i<allLocations.size();i++){ // iterate over all location, removing authorised=false
            for (Location app : unapprovedLocations){
                if (Objects.equals(allLocations.get(i).getLocationName(), app.getLocationName())){
                    allLocations.remove(allLocations.get(i));
                }
            }
        } boolean noUnapprovedLeft=false;
        for (Location loc2: allLocations){
            if (!loc2.isLocationApproved()){
                noUnapprovedLeft=false;
                break;
            } else{
                noUnapprovedLeft=true;
            }
        } assertTrue(noUnapprovedLeft);
    }
    @Test// test to ensure that the number of approved locations and number of associated locations with coordinates are equal
    public void ensureApprovedLocationsAndCoordinatessAreTheSameSize(){
        List<Location> approvedLocations = locationRepository.getAllApprovedLocations();
        List<LocationsCoordinates> coordinatesLocations = placesRepository.getAllLocationCoords();
        assertSame(approvedLocations.size(),coordinatesLocations.size() );

    }


    @Test // test to ensure that all default locations and location coordinates match
    public void ensureApprovedLocationsAndCoordinatessTableLineUpTest(){
        List<Location> approvedLocations = locationRepository.getAllApprovedLocations();
        List<LocationsCoordinates> coordinatesLocations = placesRepository.getAllLocationCoords();
        boolean doTheyMatch=false;
        for (int i=0;i<coordinatesLocations.size();i++){
        int locID=coordinatesLocations.get(i).getLocationID();
         String coordName = jdbcTemplate.queryForObject("SELECT locationName FROM locations WHERE locationID=?", String.class, locID);

         if (Objects.equals(coordName, approvedLocations.get(i).getLocationName())){
             doTheyMatch=true;
         } else{
             doTheyMatch=false;
             break;
         }
        // for loop goes through entire list, if there were any discrepancies, the loop would break, resulting in a fail


        } assertTrue(doTheyMatch);
    }


    @Test
    public void doesApprovalUpdateTest(){ //tests whether locations that are approved have their database approval changed to true
        int approvedLocationsTotal = locationRepository.getAllApprovedLocations().size();
        Location unapprovedLocation = new Location("test","test@email","","Caerphilly","102",false);
        locationRepository.addLocation(unapprovedLocation);
        int newID=locationRepository.nametoLocationID( unapprovedLocation.getLocationName());
        locationRepository.updateApprovalStatus(newID);
        int newApprovedLocationsTotal = locationRepository.getAllApprovedLocations().size();
        assertEquals(1,(newApprovedLocationsTotal-approvedLocationsTotal));
    }
}

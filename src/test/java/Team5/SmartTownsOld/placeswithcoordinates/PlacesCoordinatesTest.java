package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
class PlacesCoordinatesTest {

    @Autowired
    PlacesCoordinatesRepository placesCoordinatesRepository;

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @BeforeEach
    void setUp() {
        /* Ensures that each test starts with a clean table*/
        jdbcTemplate.update("DELETE FROM locationCoordinates");
    }

    @AfterEach
    void tearDown() {
        jdbcTemplate.update("DELETE FROM locationCoordinates");
    }

    @Test
    void getAllLocationCoords() {
        jdbcTemplate.update("insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (2, 51.57623, -3.21910 )");
        jdbcTemplate.update("insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (3, 51.57623, -3.21910 )");
        jdbcTemplate.update("insert into locationCoordinates(locationID, locationCoordsLat, locationCoordsLong) value (4, 51.57623, -3.21910 )");

        List<Long> expected = jdbcTemplate.queryForList("SELECT locationID FROM locationcoordinates", Long.class);
        List<LocationsCoordinates> allObjects = placesCoordinatesRepository.getAllLocationCoords();
        assertEquals(expected.size(), allObjects.size());
        assertEquals(expected.get(0), allObjects.get(0).getLocationID());
        assertEquals(expected.get(1), allObjects.get(1).getLocationID());
        assertEquals(expected.get(2), allObjects.get(2).getLocationID());
    }

    @Test
    void getAllTownCoords() {
    }

    @Test
    void addLocationCoord() {
        int locationID = 1;
        double locationCoordsLat = 1.5;
        double locationCoordsLong = 1.5;
        placesCoordinatesRepository.addLocationCoord(
                new LocationsCoordinates(1, locationCoordsLat, locationCoordsLong)
        );

        double resultLat = jdbcTemplate.queryForObject(
                "SELECT locationCoordsLat FROM locationcoordinates WHERE locationID=?",
                Double.class, locationID);
        double resultLong = jdbcTemplate.queryForObject(
                "SELECT locationCoordsLat FROM locationcoordinates WHERE locationID=?",
                Double.class, locationID);



        assertEquals(locationCoordsLat, resultLat);
        assertEquals(locationCoordsLong, resultLong);
    }


    @Test
    void getFullApprovedLocations() {

    }

    @Test
    void getLocationTableIDValue() {
    }


    @Test
    public void nameToLocationIDTest(){
        List<Location> locationList = locationRepository.getAllLocation();
        String firstLocationName=locationList.get(0).getLocationName();
        String lastLocationName=locationList.get(locationList.size()-1).getLocationName();
        int firstLocationID= locationRepository.nametoLocationID(firstLocationName);
        int lastLocationID= locationRepository.nametoLocationID(lastLocationName);
        // if first and last location are chosen and if SQL ID starts at 1 , while an array index starts at 0, then the following should be equal;
        String firstLocationTest=locationList.get(firstLocationID-1).getLocationName();
        String lastLocationTest=locationList.get(lastLocationID-1).getLocationName();
        assertEquals(firstLocationName,firstLocationTest);
        assertEquals(lastLocationName,lastLocationTest);


    }

    @Test // test to see if
    public void checkIfCoordsAreWithinTownBoundaryTest(){
        // initiate second instance of location without Caerphilly bounds.
        List<Location> locationList = locationRepository.getAllLocation();
        Location unapprovedLocation = new Location("test","test@email","","Caerphilly","102",false);
        locationRepository.addLocation(unapprovedLocation);
        int newID=locationRepository.nametoLocationID( unapprovedLocation.getLocationName());
        LocationsCoordinates newCoord = new LocationsCoordinates(newID,0.00,0.00);
        boolean falseIfOutOfBounds = placesCoordinatesRepository.checkIfCoordsAreWithinTownBoundary(newCoord);
        // initiate second instance of location within Caerphilly bounds.
        Location unapprovedLocationTwo = new Location("test2","test2@email","","Caerphilly","103",false);
        locationRepository.addLocation(unapprovedLocationTwo);
        int newIDTwo=locationRepository.nametoLocationID( unapprovedLocationTwo.getLocationName());
        LocationsCoordinates newCoordTwo = new LocationsCoordinates(newIDTwo,51.57903,-3.22075 );
        boolean falseIfOutOfBoundsTwo = placesCoordinatesRepository.checkIfCoordsAreWithinTownBoundary(newCoordTwo);
        assertNotEquals(falseIfOutOfBounds,falseIfOutOfBoundsTwo);


    }

}
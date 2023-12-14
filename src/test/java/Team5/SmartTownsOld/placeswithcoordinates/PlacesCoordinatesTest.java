package Team5.SmartTownsOld.placeswithcoordinates;

import Team5.SmartTowns.placeswithcoordinates.LocationsCoordinates;
import Team5.SmartTowns.placeswithcoordinates.PlacesCoordinatesRepository;
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
}
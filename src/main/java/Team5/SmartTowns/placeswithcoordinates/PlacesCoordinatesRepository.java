package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface PlacesCoordinatesRepository {

    List<LocationsCoordinates> getAllLocationCoords();
    void addLocationCoord(LocationsCoordinates locCoord);

    List<TownWithTrails> getAllTownCoords();
    void addTownWithCoords(TownWithTrails town);

    int getLocationTableIDValue(List<Location> locations, String locationName);

    Boolean checkIfCoordsAreWithinTownBoundary(LocationsCoordinates loc);

//    List<Location> getFullApprovedLocations(JdbcTemplate aJdbc);




}

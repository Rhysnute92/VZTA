package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.Data.Location;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface PlacesCoordinatesRepository {

    List<LocationsCoordinates> getAllLocationCoords();
    void addLocationCoord(LocationsCoordinates locCoord);

    List<TownWithTrails> getAllTownCoords();
    void addTownWithCoords(TownWithTrails town);

    List<Location> getFullApprovedLocations(JdbcTemplate aJdbc);




}

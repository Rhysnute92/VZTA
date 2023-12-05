//Holds locations data repository (landmarks)
package Team5.SmartTowns.Data;

import java.util.List;


public interface locationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);
//     List<Location> approvedLocations();

}

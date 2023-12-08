//Holds locations data repository (landmarks)
package Team5.SmartTowns.data;

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);


    List<Location> approvedLocations();
    List<Location> unapprovedLocations();


//     List<Location> approvedLocations();


}

//Holds locations data repository (landmarks)
package Team5.SmartTowns.data;

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);


    List<Location> getApprovedLocations();
    List<Location> getUnapprovedLocations();


//     List<Location> approvedLocations();


}

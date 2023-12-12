//Holds locations data repository (landmarks)
package Team5.SmartTowns.Data;

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);


}

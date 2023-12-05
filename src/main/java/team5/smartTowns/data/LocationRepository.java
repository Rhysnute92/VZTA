//Holds locations data repository (landmarks)
package team5.smartTowns.data;

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);


}

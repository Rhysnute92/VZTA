//Holds locations data repository (landmarks)
package Team5.SmartTowns.Data;

import Team5.SmartTowns.Landmarks.Landmarks;

import java.util.List;


public interface locationRepository {
    List<location> getAllLocation();
    void addLocation(location loc);


}

//Holds trails data repository
package Team5.SmartTowns.data;

import java.util.List;

public interface TrailsRepository {
    List<Trail> getAllTrails();
    String getTrailNameWithID(String trailsID);

    List<Trail> getAllTrailsFromCity(String cityName);

    int getTrailIDFromTrailName(String trailsName);
}

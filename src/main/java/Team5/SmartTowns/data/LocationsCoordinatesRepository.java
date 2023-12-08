package Team5.SmartTowns.data;

import java.util.List;

public interface LocationsCoordinatesRepository {

    List<LocationsCoordinates> getAllLocationCoords();
    void addLocationCoord(LocationsCoordinates locCoord);



}

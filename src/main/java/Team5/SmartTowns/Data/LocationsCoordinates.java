package Team5.SmartTowns.Data;



import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class LocationsCoordinates {
    private int locationID;
    private double locationCoordsLong;
    private double locationCoordsLat;
}

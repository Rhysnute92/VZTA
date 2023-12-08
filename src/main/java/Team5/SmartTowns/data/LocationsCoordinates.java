package Team5.SmartTowns.data;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationsCoordinates  extends LocationRepositoryJDBC  {
    /// separate class to location to cover all locations within trails that have been approved and have long/lat coords attached for mapping.
    private int locationID;
    private String locationCoordsLong;
    private String locationCoordsLat;


    public int getLocationID() {
        return locationID;
    }

    public String getLocationCoordsLong() {
        return locationCoordsLong;
    }

    public String getLocationCoordsLat() {
        return locationCoordsLat;
    }

    public void setLocationCoordsLong(String locationCoordsLong) {
        this.locationCoordsLong = locationCoordsLong;
    }

    public void setLocationCoordsLat(String locationCoordsLat) {
        this.locationCoordsLat = locationCoordsLat;
    }

    public LocationsCoordinates(JdbcTemplate aJdbc, int locationID, String locationCoordsLong, String locationCoordsLat) {
        super(aJdbc);
        this.locationID = locationID;
        this.locationCoordsLong = locationCoordsLong;
        this.locationCoordsLat = locationCoordsLat;
    }

    public LocationsCoordinates(int locationID, String locationCoordsLong, String locationCoordsLat) {
        this.locationID = locationID;
        this.locationCoordsLong = locationCoordsLong;
        this.locationCoordsLat = locationCoordsLat;
    }


 /// Need a constructor to create a lcoations list, approved lcoatiosn lsit, unapproved lcoations list.






}

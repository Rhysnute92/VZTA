package Team5.SmartTowns.placeswithcoordinates;



import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepositoryJDBC;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;

import java.text.DecimalFormat;
import java.util.List;

//@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationsCoordinates {
    /// separate class to location to cover all locations within trails that have been approved and have long/lat coords attached for mapping.
    private int locationID;
//    @NotEmpty(message = "You must enter a Latitude.")
//    @Min(value=0,message = "You must enter a Latitude.")
    private Double locationCoordsLat;
   
//    @NotEmpty(message = "You must type in a Longitude.")
//    @Min(value=0,message = "You must type in a Longitude.")
    private Double locationCoordsLong;
    private JdbcTemplate jdbc;

//    public List<Location> getFullApprovedLocations(JdbcTemplate aJdbc){
//        JdbcTemplate jdbcSuper= new LocationRepositoryJDBC().getJdbc();
//        return new LocationRepositoryJDBC(jdbcSuper).getApprovedLocations();
//    }


    public int getLocationID() {
        return locationID;
    }

    public Double getLocationCoordsLong() {
        return locationCoordsLong;
    }

    public Double getLocationCoordsLat() {
        return locationCoordsLat;
    }

    public void setLocationCoordsLong(Double locationCoordsLong) {
        this.locationCoordsLong = locationCoordsLong;
    }

    public void setLocationCoordsLat(Double locationCoordsLat) {
        this.locationCoordsLat = locationCoordsLat;
    }

//    public LocationsCoordinates(JdbcTemplate aJdbc, int locationID, Double locationCoordsLat, Double locationCoordsLong) {
//        super(aJdbc);
//        this.locationID = locationID;
//        this.locationCoordsLong = locationCoordsLong;
//        this.locationCoordsLat = locationCoordsLat;
//    }

//    public LocationsCoordinates(int locationID, Double locationCoordsLat, Double locationCoordsLong,JdbcTemplate jdbc) {
//        super(jdbc);
//        this.locationID = locationID;
//        this.locationCoordsLong = locationCoordsLong;
//        this.locationCoordsLat = locationCoordsLat;
//    }


//    public LocationsCoordinates(JdbcTemplate aJdbc, int locationID, Double locationCoordsLat, Double locationCoordsLong, JdbcTemplate jdbc) {
//        super(aJdbc);
//        this.locationID = locationID;
//        this.locationCoordsLat = locationCoordsLat;
//        this.locationCoordsLong = locationCoordsLong;
//        this.jdbc = jdbc;
//    }

    public LocationsCoordinates(int locationID, Double locationCoordsLat, Double locationCoordsLong) {
        this.locationID = locationID;
        this.locationCoordsLat = locationCoordsLat;
        this.locationCoordsLong = locationCoordsLong;
    }

//    public LocationsCoordinates(JdbcTemplate aJdbc) {
//        super(aJdbc);
//    }

    public List<Location> getFullListLocations(JdbcTemplate aJdbc){
//        LocationsCoordinates jdbcSuper= new LocationsCoordinates(aJdbc);
        return new LocationRepositoryJDBC(aJdbc).getAllLocation();
    }



//    public List<Location> getFullApprovedLocations(JdbcTemplate aJdbc){
//        JdbcTemplate jdbcSuper= new LocationRepositoryJDBC().getJdbc();
//        return new LocationRepositoryJDBC(jdbcSuper).getApprovedLocations();
//    }
//
//    public List<Location> getFullUnapprovedLocations(JdbcTemplate aJdbc){
////        LocationsCoordinates jdbcSuper= new LocationsCoordinates(aJdbc);
//        return new LocationRepositoryJDBC(aJdbc).getUnapprovedLocations();
//    }




 /// Need a constructor to create a locations list, approved collation list, unapproved locations list.


    @Override
    public String toString() {
        return "LocationsCoordinates{" +
                "locationID=" + locationID +
                ", locationCoordsLat=" + locationCoordsLat +
                ", locationCoordsLong=" + locationCoordsLong +
                ", jdbc=" + jdbc +
                '}';
    }
}

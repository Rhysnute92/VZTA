package Team5.SmartTowns.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class LocationsCoordinatesRepositoryJDBC implements LocationsCoordinatesRepository{


    private JdbcTemplate jdbc;
    private RowMapper<LocationsCoordinates> locationCoordMapper;

    public LocationsCoordinatesRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationCoordsMapper();
    }
    private void setlocationCoordsMapper(){
        locationCoordMapper = (rs, i) -> new LocationsCoordinates(

                rs.getInt("locationID"),
                rs.getString("locationCoordsLong"),
                rs.getString("locationCoordsLat")

        );
    }
    public List<LocationsCoordinates> getAllLocationCoords(){
        String sql= "SELECT * FROM locationCoordinates";
        return jdbc.query(sql, locationCoordMapper);
    }

    @Override
    public void addLocationCoord(LocationsCoordinates locCoords) {
        String sql = "insert into locationCoordinates(locationID, locationCoordsLong,locationCoordsLat) values (?,?,?)";

        jdbc.update(sql,locCoords.getLocationID(), locCoords.getLocationCoordsLong(),locCoords.getLocationCoordsLat());

    }


    //	private static JdbcTemplate jdbc;
//	@BeforeAll
//	public static void before() {
//		location = new Location();
//		locationRepo = new locationRepositoryJDBC(jdbc);}
//	@BeforeAll
//	public static void before2() {
//		locationRepo = new locationRepositoryJDBC(jdbc); }

    // Method used to approve and add locations with associated coordinates. List<Location> unapprovedLocations
    public void approveLocationAndAddCoords(int locationID, String longCoords, String latCoords){ // need list too
        String
//        List<String> unapprovedLocationTowns = new ArrayList<String>();
//        for (int i=1;unapprovedLocations.size()>i;i++ ){
//            if (Objects.equals(unapprovedLocations.get(i).getLocationPlace(), town)){





























































































































































































































































































































































            }
        }

//
        // unapproved list
        // if matches name, approve
        // add long/lat coords
        //use to update table
    }
}

package Team5.SmartTowns.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class LocationsCoordinatesRepositoryJDBC extends LocationsCoordinatesRepository{


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
    public List<LocationsCoordinates> getAllLocation(){
        String sql= "SELECT * FROM locationCoordinates";
        return jdbc.query(sql, locationCoordMapper);
    }

    @Override
    public void addLocation(LocationsCoordinates locCoords) {
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
	@Autowired
	private locationRepository locationRepository;

    public void approveLocationAndAddCoords(String town, String longCoords, String latCoords){ // need list too
        List<Location> needApprovalList = new LocationsCoordinatesRepositoryJDBC.unapprovedLocations();
        // unapproved list
        // if matches name, approve
        // add long/lat coords
        //use to update table
    }
}

//Implements the locations repository using JDBC
package Team5.SmartTowns.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocationRepositoryJDBC implements LocationRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Location> locationMapper;

    public LocationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }
    private void setlocationMapper(){
        locationMapper = (rs, i) -> new Location(

                rs.getString("locationName"),
                rs.getString("locationEmail"),
                rs.getString("locationDescription"),
                rs.getString("locationPlace"),
                rs.getInt("locationTrailID")
        );
    }
    public List<Location> getAllLocation(){
        String sql= "SELECT * FROM locations";
        return jdbc.query(sql, locationMapper);
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the Location table
    public void addLocation(Location loc) {
        String sql = "insert into locations( locationName , locationEmail,locationDescription,locationPlace, locationTrailID) values (?,?,?,?,?)";

        jdbc.update(sql,loc.getLocationName(),loc.getLocationEmail(),loc.getLocationDescription(),loc.getLocationPlace(),loc.getLocationTrailID());
    }


}

//Implements the locations repository using JDBC
package Team5.SmartTowns.Data;

import Team5.SmartTowns.Landmarks.Landmarks;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class locationRepositoryJDBC implements locationRepository {
    private JdbcTemplate jdbc;
    private RowMapper<location> locationMapper;

    public locationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }
    private void setlocationMapper(){
        locationMapper = (rs, i) -> new location(
                rs.getInt("locationID"),
                rs.getString("locationName"),
                rs.getString("locationEmail"),
                rs.getString("locationDescription"),
                rs.getString("locationPlace"),
                rs.getInt("locationTrailID")
        );
    }
    public List<location> getAllLocation(){
        String sql= "SELECT * FROM locations";
        return jdbc.query(sql, locationMapper);
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the location table, todo change location class to Location as its better code grammar and looks funky otherwise.
    public void addLocation(location llocation) {
        String sql = "insert into locations(locationID, locationName , locationEmail,locationDescription,locationPlace, locationTrailID) values (?,?,?,?,?,?)";

        jdbc.update(sql, llocation.getLocationID(),llocation.getLocationName(),llocation.getLocationEmail(),llocation.getLocationDescription(),llocation.getLocationPlace(),llocation.getLocationTrailID());
    }


}

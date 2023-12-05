//Implements the locations repository using JDBC
package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class locationRepositoryJDBC implements locationRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Location> locationMapper;

    public locationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }
    private void setlocationMapper(){
        locationMapper = (rs, i) -> new Location(

                rs.getString("locationName"),
                rs.getString("locationEmail"),
                rs.getString("locationDescription"),
                rs.getString("locationPlace"),
                rs.getInt("locationTrailID"),
                rs.getBoolean("locationApproved")
        );
    }
    public List<Location> getAllLocation(){
        String sql= "SELECT * FROM locations";
        return jdbc.query(sql, locationMapper);
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the Location table
    public void addLocation(Location loc) {
        String sql = "insert into locations( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) values (?,?,?,?,?,?)";

        jdbc.update(sql,loc.getLocationName(),loc.getLocationEmail(),loc.getLocationDescription(),loc.getLocationPlace(),loc.getLocationTrailID());
    }

    @Override
    public List<Location> approvedLocations(){
        String sql= "SELECT * FROM locations";
        List<Location> locations = jdbc.query(sql, locationMapper);
        List<Location> locationApprovalList= new ArrayList<>();
        for (Location loc :locations){
            if (loc.isLocationApproved()) {
                locationApprovalList.add(loc);
            }
        } return locationApprovalList;
 }


}

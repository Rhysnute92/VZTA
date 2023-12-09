//Implements the locations repository using JDBC
package Team5.SmartTowns.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LocationRepositoryJDBC implements LocationRepository {
   private JdbcTemplate jdbc;
    private RowMapper<Location> locationMapper;

    public LocationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }

    public LocationRepositoryJDBC() {
        JdbcTemplate ajdbc = new JdbcTemplate();
        this.jdbc =ajdbc;
        
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

    public LocationRepositoryJDBC(JdbcTemplate jdbc, RowMapper<Location> locationMapper) {
        this.jdbc = jdbc;
        this.locationMapper = locationMapper;
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the Location table
    public void addLocation(Location loc) {
        String sql = "insert into locations( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) values (?,?,?,?,?,?)";

        jdbc.update(sql,loc.getLocationName(),loc.getLocationEmail(),loc.getLocationDescription(),loc.getLocationPlace(),loc.getLocationTrailID());
    }

    @Override
    public List<Location> getApprovedLocations(){
        JdbcTemplate jdbc = new JdbcTemplate();
        List<Location> locations = new LocationRepositoryJDBC(jdbc).getAllLocation();
        List<Location> locationApprovalList= new ArrayList<Location>();
        for (Location loc :locations){
            if (loc.isLocationApproved()) {
                locationApprovalList.add(loc);
            }
        } return locationApprovalList;
 }

    @Override
    public List<Location> getApprovedLocations2(List<Location> list){

        List<Location> locationApprovalList= new ArrayList<Location>();
        for (Location loc :list){
            if (loc.isLocationApproved()) {
                locationApprovalList.add(loc);
            }
        } return locationApprovalList;
    }



    @Override
    public List<Location> getUnapprovedLocations(){
        List<Location> locations = getAllLocation();
        List<Location> locationUnapprovedList= new ArrayList<Location>();
        for (Location loc :locations){
            if (!loc.isLocationApproved()) {
                locationUnapprovedList.add(loc);
            }
        } return locationUnapprovedList;
    }


//    public JdbcTemplate getJdbc() {
//        return jdbc;
//    }


}

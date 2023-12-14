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

//    public LocationRepositoryJDBC() {
//        JdbcTemplate ajdbc = new JdbcTemplate();
//        this.jdbc =ajdbc;
//        setlocationMapper();
//
//    }


    private void setlocationMapper(){
        locationMapper = (rs, i) -> new Location(
                rs.getLong("locationID"),
                rs.getString("locationName"),
                rs.getString("locationEmail"),
                rs.getString("locationDescription"),
                rs.getString("locationPlace"),
                rs.getString("locationTrailID"),
                rs.getBoolean("locationApproved")
        );
    }
    public List<Location> getAllLocation(){
        String sql= "SELECT * FROM locations";
        return jdbc.query(sql, locationMapper);
    }


    @Override
    public List<Location> getAllApprovedLocations(){
        String sql= "SELECT * FROM locations";
        List<Location> lis = jdbc.query(sql, locationMapper);
        List<Location> lisFiltered = new ArrayList<>();
        for (Location li : lis){
            if (li.isLocationApproved()){
                lisFiltered.add(li);
            }
        }
        return lisFiltered;
    }

    @Override
    public List<Location> getAllUnapprovedLocations(){
        String sql= "SELECT * FROM locations";
        List<Location> lis = jdbc.query(sql, locationMapper);
        List<Location> lisFiltered = new ArrayList<>();
        for (Location li : lis){
            if (!li.isLocationApproved()){
                lisFiltered.add(li);
            }
        }
        return lisFiltered;
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the Location table
    public void addLocation(Location loc) {
        String sql = "insert into locations( locationName , locationEmail,locationDescription,locationPlace, locationTrailID, locationApproved) values (?,?,?,?,?,?)";

        jdbc.update(sql,loc.getLocationName(),loc.getLocationEmail(),loc.getLocationDescription(),loc.getLocationPlace(),loc.getLocationTrailID(), false);
    }

//    @Override
//    public List<Location> getApprovedLocations(){
//        JdbcTemplate jdbc = new JdbcTemplate();
//        List<Location> locations = new LocationRepositoryJDBC(jdbc).getAllLocation();
//        List<Location> locationApprovalList= new ArrayList<Location>();
//        for (Location loc :locations){
//            if (loc.isLocationApproved()) {
//                locationApprovalList.add(loc);
//            }
//        } return locationApprovalList;
// }
//
//    @Override
//    public List<Location> getApprovedLocations2(List<Location> list){
//
//        List<Location> locationApprovalList= new ArrayList<Location>();
//        for (Location loc :list){
//            if (loc.isLocationApproved()) {
//                locationApprovalList.add(loc);
//            }
//        } return locationApprovalList;
//    }
//


//    @Override
//    public List<Location> getUnapprovedLocations(){
//        List<Location> locations = getAllLocation();
//        List<Location> locationUnapprovedList= new ArrayList<Location>();
//        for (Location loc :locations){
//            if (!loc.isLocationApproved()) {
//                locationUnapprovedList.add(loc);
//            }
//        } return locationUnapprovedList;
//    }

    @Override
    public int nametoLocationID(String name){
        return jdbc.queryForObject("SELECT locationID FROM locations WHERE locationName=?", Integer.class, name);


    }
    @Override
    public void updateApprovalStatus(int locID){
        String updateSql = "update locations set locationApproved = true where locationID = ?";
        jdbc.update(updateSql, locID);
    }
//    return jdbc.queryForObject("SELECT locationApproval FROM locations WHERE locationName=?", locationID);

//    public JdbcTemplate getJdbc() {
//        return jdbc;
//    }


}

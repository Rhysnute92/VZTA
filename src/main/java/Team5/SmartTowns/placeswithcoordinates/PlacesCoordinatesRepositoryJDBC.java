package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Objects;

@Repository
public class PlacesCoordinatesRepositoryJDBC implements PlacesCoordinatesRepository {


    private JdbcTemplate jdbc;
    private RowMapper<LocationsCoordinates> locationCoordMapper;
    private RowMapper<TownWithTrails> townCoordMapper;
    public PlacesCoordinatesRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setLocationCoordsMapper();
        setTownCoordsMapper();
    }
    private void setLocationCoordsMapper(){
        locationCoordMapper = (rs, i) -> new LocationsCoordinates(

                rs.getInt("locationID"),
                rs.getString("locationCoordsLat"),
                rs.getString("locationCoordsLong")

        );
    }
    private void setTownCoordsMapper(){
        townCoordMapper = (rs, i) -> new TownWithTrails(

                rs.getString("townName"),
                rs.getString("townCentreCoordsLat"),
                rs.getString("townCentreCoordsLong"),
                rs.getString("ownLeftmostCoordsLat"),
                rs.getString("townRightmostCoordsLat"),
                rs.getString("townUppermostCoordsLong"),
                rs.getString("townLowermostCoordsLong")

        );
    }



    public List<LocationsCoordinates> getAllLocationCoords(){
        String sql= "SELECT * FROM locationCoordinates";
        return jdbc.query(sql, locationCoordMapper);
    }
    public List<TownWithTrails> getAllTownCoords(){
        String sql= "SELECT * FROM townswithtrails";
        return jdbc.query(sql, townCoordMapper);
    }

    @Override
    public void addLocationCoord(LocationsCoordinates locCoords) {
        String sql = "insert into locationCoordinates(locationID, locationCoordsLat,locationCoordsLong) values (?,?,?)";

        jdbc.update(sql,locCoords.getLocationID(), locCoords.getLocationCoordsLong(),locCoords.getLocationCoordsLat());

    }
    @Override
    public void addTownWithCoords(TownWithTrails town) {
        String sql = "insert into townswithtrails(townName,townCentreCoordsLat,townCentreCoordsLong,townLeftmostCoordsLat,townRightmostCoordsLat,townUppermostCoordsLong,townLowermostCoordsLong) values (?,?,?,?,?,?,?)";

        jdbc.update(sql,town.getTownName(),town.getTownCentreCoordsLong(),town.getTownCentreCoordsLong(),town.getTownLeftmostCoordsLat(),town.getTownRightmostCoordsLat(),town.getTownUppermostCoordsLong(),town.getTownLowermostCoordsLong());

    }

    @Override //TODO CHECK
    public List<Location> getFullApprovedLocations(JdbcTemplate aJdbc) {
        return null;
    }


    public boolean checkInputtedCoordsMatchTown(String inpLongCoords, String inpLatCoords, String townName){
     PlacesCoordinatesRepositoryJDBC jbdcsecond = new PlacesCoordinatesRepositoryJDBC(jdbc);
     List<TownWithTrails> allTowns = jbdcsecond.getAllTownCoords();
     for (TownWithTrails town : allTowns){
         if (Objects.equals(townName, town.getTownName())){
             // check lon within boundaries
//             if ((inpLongCoords))



         }
     }
    return true;}



    // Method used to approve and add locations with associated coordinates. List<Location> unapprovedLocations
    public void approveLocationAndAddCoords(String locationsName, String longCoords, String latCoords,JdbcTemplate jdbc) { // need list too
        LocationsCoordinates jdbcTemp= new LocationsCoordinates(jdbc);
        List<Location> unapprovedLocations = jdbcTemp.getFullUnapprovedLocations(jdbc);
        PlacesCoordinatesRepositoryJDBC jbdcsecond = new PlacesCoordinatesRepositoryJDBC(jdbc);
        List<TownWithTrails> allTowns = jbdcsecond.getAllTownCoords();
        int unapporvedLocationsListIndex;
        for (int i=0; i<unapprovedLocations.size();i++){ // check if location exists
            if (Objects.equals(unapprovedLocations.get(i).getLocationName(), locationsName)){
                unapporvedLocationsListIndex =i;
                break;

            } else if(!Objects.equals(unapprovedLocations.get(i).getLocationPlace(), locationsName)){
                System.out.println("Error, location is not valid, please check your spelling or locations table.");
                return;
            }
//            String toBeApprovedLocationTown=unapprovedLocations.get(unapporvedLocationsListIndex).getLocationPlace();
//            for (TownWithTrails town : allTowns){
//                if (Objects.equals(toBeApprovedLocationTown, town.getTownName())){


                }

            }




           // check if location within respective town boundaries
        }






        /// if location id == unapproved location id,-> make sure coords within boundaries, -> approve and append lcoations table and add to coords table.

//        List<String> unapprovedLocationTowns = new ArrayList<String>();
//        for (int i=1;unapprovedLocations.size()>i;i++ ){
//            if (Objects.equals(unapprovedLocations.get(i).getLocationPlace(), town)){






























































































































































































































































































































































//        }
//
////
//        // unapproved list
//        // if matches name, approve
//        // add long/lat coords
//        //use to update table
//    }
//}

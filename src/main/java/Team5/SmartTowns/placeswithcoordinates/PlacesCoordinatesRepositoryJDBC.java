package Team5.SmartTowns.placeswithcoordinates;

import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
                rs.getDouble("locationCoordsLat"),
                rs.getDouble("locationCoordsLong")

        );
    }
    private void setTownCoordsMapper(){
        townCoordMapper = (rs, i) -> new TownWithTrails(

                rs.getString("townName"),
                rs.getString("townCentreCoordsLat"),
                rs.getString("townCentreCoordsLong"),
                rs.getString("townUppermostCoordsLat"),
                rs.getString("townLowermostCoordsLat"),
                rs.getString("townLeftmostCoordsLong"),
                rs.getString("townRightmostCoordsLong")


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
        String sql = "insert into townswithtrails(townName,townCentreCoordsLat,townCentreCoordsLong,townUppermostCoordsLat,townLowermostCoordsLat,townLeftmostCoordsLong,townRightmostCoordsLong) values (?,?,?,?,?,?,?)";

        jdbc.update(sql,town.getTownName(),town.getTownCentreCoordsLong(),town.getTownCentreCoordsLong(),town.getTownUppermostCoordsLat(),town.getTownLowermostCoordsLat(),town.getTownLeftmostCoordsLong(),town.getTownRightmostCoordsLong());

    }


//    public List<Location> getFullApprovedLocations(JdbcTemplate aJdbc) {
////        LocationsCoordinates jdbcSuper= new LocationsCoordinates(aJdbc);
//        return new LocationRepositoryJDBC(aJdbc).getApprovedLocations();
//    }

//    @Override //TODO CHECK
//    public List<Location> getFullApprovedLocations(JdbcTemplate aJdbc) {
//        return null;
//    }







    public boolean checkInputtedCoordsMatchTown(String inpLatCoords, String inpLongCoords, String townName){
     PlacesCoordinatesRepositoryJDBC jbdcsecond = new PlacesCoordinatesRepositoryJDBC(jdbc);
     List<TownWithTrails> allTowns = jbdcsecond.getAllTownCoords();
     for (TownWithTrails town : allTowns){
         if (Objects.equals(townName, town.getTownName())){
             // check lon within boundaries
             // convert values to doubles
             double inpLat=Double.parseDouble(inpLatCoords);
             double inpLong=Double.parseDouble(inpLongCoords);
             double townBoundaryLatUppermost=Double.parseDouble(town.getTownUppermostCoordsLat());
             double townBoundaryLatLowermost=Double.parseDouble(town.getTownLowermostCoordsLat());

             double townBoundaryLongLeftmost=Double.parseDouble(town.getTownLeftmostCoordsLong());
             double townBoundaryLongRightmost=Double.parseDouble(town.getTownRightmostCoordsLong());
             // check coords within respective town boundary (boundary decided by rough google maps red-line)
             if ( (inpLat<=townBoundaryLatUppermost)&& (inpLat>=townBoundaryLatLowermost) && (inpLat<=townBoundaryLongLeftmost) &&  (inpLat<=townBoundaryLongRightmost)){
                 // location within boundary
                 return true;
             } else{
                 System.out.println("Location outside town boundary. "); //todo scanner bad idea, add admin override?
                 return false;
             }



         }
     }
    return true;}

    @Override
    public int getLocationTableIDValue(List<Location> locations, String locationName){
        int index;
        for(int i=0;i<locations.size();i++){
            if (Objects.equals(locations.get(i).getLocationName(), locationName)){
                index = i;
                return index;

            }
        } return index= Integer.parseInt(null);

    }

    @Autowired
    LocationRepository local;
    @Override
    public Boolean checkIfCoordsAreWithinTownBoundary(LocationsCoordinates loc){
        int locationID=loc.getLocationID();
        String locationTown= jdbc.queryForObject("SELECT locationPlace FROM locations WHERE locationID=?", String.class, locationID);
        List<TownWithTrails> allTowns = getAllTownCoords();
        for (int i=0;i<allTowns.size();i++){
            if (Objects.equals(allTowns.get(i).getTownName(), locationTown)){


                double inpLat=(loc.getLocationCoordsLat());
                double inpLong=(loc.getLocationCoordsLong());

                double townBoundaryLatUppermost=Double.parseDouble(allTowns.get(i).getTownUppermostCoordsLat());
                double townBoundaryLatLowermost=Double.parseDouble(allTowns.get(i).getTownLowermostCoordsLat());

                double townBoundaryLongLeftmost=Double.parseDouble(allTowns.get(i).getTownLeftmostCoordsLong());
                double townBoundaryLongRightmost=Double.parseDouble(allTowns.get(i).getTownRightmostCoordsLong());
                // check coords within respective town boundary (boundary decided by rough google maps red-line)
                if ( (inpLat<=townBoundaryLatUppermost)&& (inpLat>=townBoundaryLatLowermost) && (inpLong>=townBoundaryLongLeftmost) &&  (inpLong<=townBoundaryLongRightmost)){
                    // location within boundary returns true
                    return true;
            }}
        } return false; // if location outside boundary, return true won't function and it wil return false.
    }

    @Override
    public int getTownIDFromName(String townsName){
        return jdbc.queryForObject("SELECT townID FROM townswithtrails WHERE townName=?", Integer.class, townsName);
    }

    // Method used to approve and add locations with associated coordinates. List<Location> unapprovedLocations
//    public void approveLocationAndAddCoords(String locationsName, Double latCoords, Double longCoords,JdbcTemplate jdbc) {
//        // need list too
//
//        LocationsCoordinates jdbcTemp= new LocationsCoordinates(jdbc);
//        List<Location> unapprovedLocations = jdbcTemp.getFullUnapprovedLocations(jdbc);
//        List<Location> allLocations = jdbcTemp.getFullListLocations(jdbc);
//
//        PlacesCoordinatesRepositoryJDBC jbdcsecond = new PlacesCoordinatesRepositoryJDBC(jdbc);
//        List<TownWithTrails> allTowns = jbdcsecond.getAllTownCoords();
//        int unapporvedLocationsListIndex=99;  // initialize variable to allow after if statement to run todo fix this
//        for (int i=0; i<unapprovedLocations.size();i++){ // check if location exists
//            if (Objects.equals(unapprovedLocations.get(i).getLocationName(), locationsName)){
//                unapporvedLocationsListIndex =i;
//                break;
//
//            } else if(!Objects.equals(unapprovedLocations.get(i).getLocationPlace(), locationsName)){
//                System.out.println("Error, location is not valid, please check your spelling or locations table.");
//
//                return;
//            }
//            String toBeApprovedLocationTown=unapprovedLocations.get(unapporvedLocationsListIndex).getLocationPlace();
//            int tableLocationIDOfInputtedLocation= getLocationTableIDValue(allLocations, locationsName);
//            LocationsCoordinates unapprovedLocation= new LocationsCoordinates(tableLocationIDOfInputtedLocation,latCoords, longCoords);
//            boolean locationWithinTownBoundaries= checkInputtedCoordsMatchTown(Double.toString(latCoords) ,Double.toString(longCoords), toBeApprovedLocationTown);
//            if (locationWithinTownBoundaries){
//                addLocationCoord(unapprovedLocation);
//                return;
//
//
//            } else {
//                return;}
//
////            for (TownWithTrails town : allTowns){
////                if (Objects.equals(toBeApprovedLocationTown, town.getTownName())){
//
//
//                }
//
//            }




           // check if location within respective town boundaries
        }





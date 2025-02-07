//Holds locations data repository (landmarks)
package Team5.SmartTowns.data;

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);

    void updateApprovalStatus(int locID);


    List<Location> getAllApprovedLocations();
    int nametoLocationID(String name);

//    List<Location> getApprovedLocations2(List<Location> list);

    List<Location> getAllUnapprovedLocations();


//     List<Location> approvedLocations();


}

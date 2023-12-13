//Holds locations data repository (landmarks)
<<<<<<< HEAD:src/main/java/Team5/SmartTowns/Data/LocationRepository.java
package Team5.SmartTowns.Data;
=======
package Team5.SmartTowns.data;
>>>>>>> main:src/main/java/Team5/SmartTowns/data/LocationRepository.java

import java.util.List;


public interface LocationRepository {
    List<Location> getAllLocation();
    void addLocation(Location loc);


<<<<<<< HEAD:src/main/java/Team5/SmartTowns/Data/LocationRepository.java
=======
    List<Location> getApprovedLocations();

//    List<Location> getApprovedLocations2(List<Location> list);

    List<Location> getUnapprovedLocations();


//     List<Location> approvedLocations();


>>>>>>> main:src/main/java/Team5/SmartTowns/data/LocationRepository.java
}

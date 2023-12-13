//Holds variable data for the locations table (landmarks)
package Team5.SmartTowns.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
//    private int locationID;
    private String locationName;
    private String locationEmail;
    private String locationDescription;
    private String locationPlace;
    private int locationTrailID;

<<<<<<< HEAD:src/main/java/Team5/SmartTowns/Data/Location.java

=======
    private boolean locationApproved;

    public Location() {

    }
>>>>>>> main:src/main/java/Team5/SmartTowns/data/Location.java

    @Override
    public String toString() {
        return "Location{" +
                 locationName + '\'' +
                 locationEmail + '\'' +
                 locationDescription + '\'' +
                 locationPlace + '\'' +
                 locationTrailID +
                locationApproved+
                '}';
    }

    public String getLocationName() {
        return locationName;
    }

    public String getLocationEmail() {
        return locationEmail;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public String getLocationPlace() {
        return locationPlace;
    }

    public int getLocationTrailID() {
        return locationTrailID;
    }

<<<<<<< HEAD:src/main/java/Team5/SmartTowns/Data/Location.java


    public int testMe(){
        int a=4;
        return 4;
=======
    public boolean isLocationApproved() {
        return locationApproved;
>>>>>>> main:src/main/java/Team5/SmartTowns/data/Location.java
    }
}

//Holds variable data for the locations table (landmarks)
package Team5.SmartTowns.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Location {
//    private int locationID;
    private String locationName;
    private String locationEmail;
    private String locationDescription;
    private String locationPlace;
    private int locationTrailID;

    @Override
    public String toString() {
        return "Location{" +
                 locationName + '\'' +
                 locationEmail + '\'' +
                 locationDescription + '\'' +
                 locationPlace + '\'' +
                 locationTrailID +
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


}

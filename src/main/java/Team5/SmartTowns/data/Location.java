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


    private boolean locationApproved;

    public Location() {

    }

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





    public boolean isLocationApproved() {
        return locationApproved;

    }

    public Location(String locationName, String locationEmail, String locationDescription, String locationPlace, int locationTrailID, boolean locationApproved) {
        this.locationName = locationName;
        this.locationEmail = locationEmail;
        this.locationDescription = locationDescription;
        this.locationPlace = locationPlace;
        this.locationTrailID = locationTrailID;
        this.locationApproved = locationApproved;
    }
}

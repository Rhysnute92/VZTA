//Holds variable data for the locations table (landmarks)
package Team5.SmartTowns.data;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Location {
    private long locationID;
    private String locationName;
    private String locationEmail;
    private String locationDescription;
    private String locationPlace;
    private String locationTrailID;

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

    public String getLocationTrailID() {
        return locationTrailID;
    }

    public boolean isLocationApproved() {
        return locationApproved;
    }


    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public void setLocationEmail(String locationEmail) {
        this.locationEmail = locationEmail;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public void setLocationPlace(String locationPlace) {
        this.locationPlace = locationPlace;
    }

    public void setLocationTrailID(String locationTrailID) {
        this.locationTrailID = locationTrailID;
    }

    public void setLocationApproved(boolean locationApproved) {
        this.locationApproved = locationApproved;
    }
}

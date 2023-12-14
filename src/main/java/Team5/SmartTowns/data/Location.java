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

    public Location(String locationName, String locationEmail, String locationDescription, String locationPlace, int locationTrailID, boolean locationApproved) {
        this.locationName = locationName;
        this.locationEmail = locationEmail;
        this.locationDescription = locationDescription;
        this.locationPlace = locationPlace;
        this.locationTrailID = locationTrailID;
        this.locationApproved = locationApproved;
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

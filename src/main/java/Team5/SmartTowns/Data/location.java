//Holds variable data for the locations table (landmarks)
package Team5.SmartTowns.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
//insert into locations (locationID, locationName , locationEmail,locationDescription,locationPlace,
//        locationTrailID
//        ) value ('1', 'St Cenydd','','location description here','Caerphilly',0101);
@Data
@AllArgsConstructor
public class location {
    private int locationID;
    private String locationName;
    private String locationEmail;
    private String locationDescription;
    private String locationPlace;
    private int locationTrailID;

    @Override
    public String toString() {
        return "location{" +
                "" + locationID +
                ", '" + locationName + '\'' +
                ", '" + locationEmail + '\'' +
                ", '" + locationDescription + '\'' +
                ", '" + locationPlace + '\'' +
                ", " + locationTrailID +
                '}';
    }


    public int getLocationID() {
        return locationID;
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

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
}

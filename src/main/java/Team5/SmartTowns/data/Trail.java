//Holds variable data for the trails table
package Team5.SmartTowns.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trail {
    private String trailsId;
    private String trailName;
    private String trailNumber;


    public String getTrailsId() {
        return trailsId;
    }

    public String getTrailName() {
        return trailName;
    }

    public String getTrailNumber() {
        return trailNumber;
    }


}

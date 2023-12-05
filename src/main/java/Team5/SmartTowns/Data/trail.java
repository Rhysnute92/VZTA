//Holds variable data for the trails table
package Team5.SmartTowns.Data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class trail {
    private int trailsId;
    private String name;
    private Boolean tru;
}

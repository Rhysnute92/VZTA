package Team5.SmartTowns.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Town {
    private String townName;
    private Integer townTrailNumber;


    public String getTownName() {
        return townName;
    }

    public Integer getTownTrailNumber() {
        return townTrailNumber;
    }
}

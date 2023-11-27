package Team5.SmartTowns.Landmarks;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Landmarks {
    private String landmarkName;
    private String landmarkDescription;
    private String landmarkLocation;
    private int trailID;


    public Landmarks(){
        this.landmarkName ="";
        this.landmarkDescription ="";
        this.landmarkLocation ="";
        this.trailID =0;
    }

    public Landmarks(String landmarkName, String landmarkDescription, String landmarkLocation, int trailID) {
        this.landmarkName = landmarkName;
        this.landmarkDescription = landmarkDescription;
        this.landmarkLocation = landmarkLocation;
        this.trailID = trailID;
    }
}

package Team5.SmartTowns.Landmarks;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Landmarks {
    private String landmarkName;

    private String landmarkEmail;
    private String landmarkDescription;
    private String landmarkLocation;
    private Integer trailID;


    public Landmarks(){
        this.landmarkName ="";
        this.landmarkEmail="";
        this.landmarkDescription ="";
        this.landmarkLocation ="";
        this.trailID =0;
    }

    public Landmarks(String landmarkName, String landmarkEmail, String landmarkDescription, String landmarkLocation, Integer trailID) {
        this.landmarkName = landmarkName;
        this.landmarkEmail = landmarkEmail;
        this.landmarkDescription = landmarkDescription;
        this.landmarkLocation = landmarkLocation;
        this.trailID = trailID;
    }
}

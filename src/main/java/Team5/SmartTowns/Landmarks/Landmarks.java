package Team5.SmartTowns.Landmarks;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Landmarks {
    @NotEmpty(message = "You must type in a username.")
    private String landmarkName;
    @Email(message = "You must attach a contact address.")
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

//    public Landmarks(String landmarkName, String landmarkEmail, String landmarkDescription, String landmarkLocation, Integer trailID) {
//        this.landmarkName = landmarkName;
//        this.landmarkEmail = landmarkEmail;
//        this.landmarkDescription = landmarkDescription;
//        this.landmarkLocation = landmarkLocation;
//        this.trailID = trailID;
//    }
}

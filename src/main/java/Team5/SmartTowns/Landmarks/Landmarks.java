package Team5.SmartTowns.Landmarks;

import Team5.SmartTowns.trails.Trail;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Landmarks {

    // Intialised object to getID from trail.
    Trail trail = new Trail();

    //Predefined Landmark for Dragons Tale.
    public static List<Landmarks> landmarksDragonstrail = List.of(
            new Landmarks( 1, "A scent of...Dragon", "The Dragon has been spotted near by, find the QR code to continue" , "Start your discovery, at the sweet shop."),
            new Landmarks( 2, "They've been found!", "Don't let them escape, find the next QR code to continue!", "location test")
    );

    private Integer trailID;
    private int landmarkID;
    @NotEmpty(message = "You must type in a username.")
    private String landmarkName;
    @Email(message = "You must attach a contact address.")
    private String landmarkEmail;
    private String landmarkDescription;
    private String landmarkLocation;
    private String landmarkPicture;

    // Constructor for List above.
    public Landmarks( int landmarkID, String landmarkName, String landmarkDescription, String landmarkLocation) {
        this.landmarkID = landmarkID;
        this.landmarkName = landmarkName;
        this.landmarkDescription = landmarkDescription;
        this.landmarkLocation = landmarkLocation;    }


}

package Team5.SmartTowns.landmarks;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Landmarks {

    // Initialized object to getID from trail.

    //Predefined Landmark for Dragons Tale.
    public static List<Landmarks> landmarksDragonstrail = List.of(
            new Landmarks( 1, "A scent of...Dragon", "The Dragon has been spotted near by, find the QR code to continue" , "Start your discovery, at the sweet shop."),
            new Landmarks( 2, "They've been found!", "Don't let them escape, find the next QR code to continue!", "Location test")
    );
    private String trailID;
    private int landmarkID;
    @NotEmpty(message = "You must type in a username.")
    private String landmarkName;
    @NotEmpty(message = "You must attach a contact address.") // Requires @NotEmpty for form validation
    @Email(message = "You must attach a contact address.")
    private String landmarkEmail;
    private String landmarkDescription;
    private String landmarkLocation;
    private String landmarkPicture;

    public static List<Landmarks> getLandmarksDragonstrail() {
        return landmarksDragonstrail;
    }

    // Constructor for List above.
    public Landmarks( int landmarkID, String landmarkName, String landmarkDescription, String landmarkLocation) {
        this.landmarkID = landmarkID;
        this.landmarkName = landmarkName;
        this.landmarkDescription = landmarkDescription;
        this.landmarkLocation = landmarkLocation;    }
}

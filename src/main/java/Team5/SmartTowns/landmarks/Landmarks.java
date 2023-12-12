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
    private Integer trailID;
    private int landmarkID;
    @NotEmpty(message = "You must type in a username.")
    private String landmarkName;
    @NotEmpty(message = "You must attach a contact address.") // Requires @NotEmpty for form validation
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

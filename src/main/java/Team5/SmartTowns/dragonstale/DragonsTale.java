package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.landmarks.Landmarks;
import lombok.Data;

import java.util.List;


@Data
public class DragonsTale {
    Landmarks landmarks = new Landmarks();

    //As there were already landmark fields created, I used composition to import them into the class to be used within the file.
    private int landmarkID = landmarks.getLandmarkID();
    private String landmarkName = landmarks.getLandmarkName();
    private String landmarkDescription = landmarks.getLandmarkDescription();
    private String getImgPath;
    public static List<Landmarks> landmarksDragonstrail = List.of(
            new Landmarks( 1, "A scent of...Dragon", "The Dragon has been spotted near by, find the QR code to continue" , "Start your discovery, at the sweet shop."),
            new Landmarks( 2, "They've been found!", "Don't let them escape, find the next QR code to continue!", "Location test")
    );
    public static List<Landmarks> getLandmarksDragonstrail() {
        return landmarksDragonstrail;
    }
}

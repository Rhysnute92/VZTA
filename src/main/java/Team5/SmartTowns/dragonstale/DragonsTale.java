package Team5.SmartTowns.dragonstale;

import Team5.SmartTowns.landmarks.Landmarks;

import java.util.List;

public class DragonsTale {
    public static List<Landmarks> landmarksDragonstrail = List.of(
            new Landmarks( 1, "A scent of...Dragon", "The Dragon has been spotted near by, find the QR code to continue" , "Start your discovery, at the sweet shop."),
            new Landmarks( 2, "They've been found!", "Don't let them escape, find the next QR code to continue!", "Location test")
    );
    public static List<Landmarks> getLandmarksDragonstrail() {
        return landmarksDragonstrail;
    }
}

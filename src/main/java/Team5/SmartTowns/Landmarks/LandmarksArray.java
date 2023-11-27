package Team5.SmartTowns.Landmarks;

import java.util.ArrayList;
import java.util.List;

public class LandmarksArray {
    private List<Landmarks> landmarksList;
    private static LandmarksArray singelton;

    LandmarksArray() {
        landmarksList = new ArrayList<>(); //ArrayList is mutable


    }

}

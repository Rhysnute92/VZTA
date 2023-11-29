package Team5.SmartTowns.trails;

import lombok.Data;

import java.io.File;
import java.util.List;

@Data
public class Trail {
    public static List<Trail> trails = List.of(
            new Trail(1,"Trail1", "This is trail one"),
            new Trail(2,"Trail2", "This is trail two"),
            new Trail(3,"Trail3", "This is trail three"),
            new Trail(4,"Trail4", "This is trail four"),
            new Trail(5,"Trail5", "This is trail five, it has no image")
    );
    int id;
    String name;
    String description;
    int nLandmarks;
    int difficulty; //1-5
    String imgPath;

    public Trail(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        imgPath = findImagePath();
    }

    private String findImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/trails/trail" + id + ".jpg";
        String notFoundPath = "images/trails/trailNotFound.jpg";

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? imgPath : notFoundPath;
    }
}

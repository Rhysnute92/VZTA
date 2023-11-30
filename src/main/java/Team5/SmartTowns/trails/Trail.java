package Team5.SmartTowns.trails;

import lombok.Data;

import java.io.File;
import java.util.List;

@Data
public class Trail {
    public static List<Trail> trails = List.of(
            new Trail(1,"Caerphilly Castle Trail", "Take a stroll through the grounds of one of Europe's finest historic buildings and you will see stunning views of the castle and the lakes. The route of the trail is marked with eight special circular markers, which depict various fascinating historical facts relating to the castle. Pupils from Ysgol Gynradd Gymraeg Caerffili, Plasyfelin Junior School, Ysgol Y Castell and Twyn Primary worked with the artist to come up with the different designs. You do not need to pay to go in the castle to complete this trail. This Trail is fairly short at 1.5 miles and very suitable for wheelchairs and pushchairs as the route stays mostly on well-marked and ramped paths with just a couple of short diversions onto grassed areas."),
            new Trail(2,"Trail2", "This is trail two"),
            new Trail(3,"Trail3", "This is trail three"),
            new Trail(4,"Trail4", "This is trail four"),
            new Trail(5,"Trail5", "EDITING THIS")
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

    public static List<Trail> getTrails() {
        return trails;
    }
}

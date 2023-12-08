package Team5.SmartTowns.users;

import Team5.SmartTowns.rewards.Badge;
import Team5.SmartTowns.rewards.Sticker;
import lombok.Data;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;

@Data
public class User {
    int id;
    String email; //Validation would be done by email, since they will have that
    String name;
    String imgPath;
    int dragonProgress;
    Map<Sticker, Boolean> hasStickers = new HashMap<>(); // True if User has sticker (key)
    Map<Integer, Boolean> dragonstaleLandmarkIDs = new HashMap<>(); // Storing the IDs of the landmarks associated with Dragonstale, as well as if the user has visited it before (boolean)

    public User(int id, String email, String name, int dragonProgress) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.dragonProgress = dragonProgress;
        imgPath = findImagePath();
    }
    public User(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
        imgPath = findImagePath();
    }

    private String findImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/users/" + id + ".jpg";
        String notFoundPath = "../images/users/0.png";

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? "../" + imgPath : notFoundPath;
    }
}

package team5.smartTowns.users;

import lombok.Getter;
import lombok.Setter;
import team5.smartTowns.rewards.Badge;
import team5.smartTowns.rewards.Sticker;
import lombok.Data;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class User {

    int id;
    String email; //Validation would be done by email, since they will have that
    String name;
    String imgPath;

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

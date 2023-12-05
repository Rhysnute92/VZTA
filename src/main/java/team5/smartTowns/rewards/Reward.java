package team5.smartTowns.rewards;

import lombok.Getter;

import java.io.File;

@Getter
public abstract class Reward {
    /* Abstract class for all rewards */

    int id;
    String displayImg; //Path to the image file
    String name;
    String description;

    public Reward(int id, String name, String description) {
        //Default constructor
        this.id = id;
        this.name = name;
        this.description = description;
        displayImg = findImagePath();
    }

    public abstract String getImgFolder();
    /*Returns folder in which images are located*/

    public String getDefaultImg(){
        /*Returns the name of the default image to be used in case no image is found*/
        return "0.png";
    };
    public String findImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/rewards/" + getImgFolder() + "/" + id + ".jpg";
        String notFoundPath = "images/rewards/" + getImgFolder() + "/" + getDefaultImg();

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? imgPath : notFoundPath;
    }
}

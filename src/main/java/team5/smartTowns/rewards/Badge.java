/*AUTHOR: Gabriel Copat*/
package team5.smartTowns.rewards;

import lombok.Data;

import java.io.File;
import java.util.Objects;

@Data
public class Badge {
    /* Badges can be earned by completing certain goals.
     * They are displayed in the user profile page
     *
     * For example, one might earn a badge after visiting 20 locations */

    int id;
    String name;
    String description;
    String imgPath;
    int difficulty; //1-5

    public Badge(int id, String name, String description, int difficulty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        imgPath = findImagePath();
    }

    private String findImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/rewards/badges/" + id + ".jpg";
        String notFoundPath = "/images/rewards/badges/0.png";

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? imgPath : notFoundPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Badge badge = (Badge) o;
        return id == badge.id && Objects.equals(name, badge.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

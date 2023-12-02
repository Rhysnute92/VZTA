/*AUTHOR: Gabriel Copat*/
package Team5.SmartTowns.rewards;

import lombok.Data;

import java.io.File;
import java.util.Objects;

@Data
public class Sticker {
    /* Stickers are trade-able rewards, they vary in rarity and are earned at random */

    int id;
    String name;
    String description;
    String imgPath;
    int rarity; //1-5
    boolean hasSticker;

    public Sticker(int id, String name, String description, int rarity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        imgPath = findImagePath();
    }

    private String findImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/rewards/stickers/" + id + ".jpg";
        String notFoundPath = "images/rewards/stickers/0.png";

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? imgPath : notFoundPath;
    }

    public boolean hasSticker(){
        return hasSticker;
    }
    public void setVisibility(boolean hasSticker){
        this.hasSticker = hasSticker;
    }
    public String getVisibility(){
        return hasSticker? "" : "grayedOut";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sticker sticker = (Sticker) o;
        return id == sticker.id && Objects.equals(name, sticker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


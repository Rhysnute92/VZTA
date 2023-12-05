/*AUTHOR: Gabriel Copat*/
package team5.smartTowns.rewards;

import lombok.Getter;


@Getter
public class Sticker extends Reward{
    /* Stickers are randomly earned rewards from a specific pack */

    int rarity; //1-5
    boolean hasSticker;
    String pack;

    public Sticker(int id, String name, String description, int rarity, String pack) {
        super(id, name, description);
        this.rarity = rarity;
    }

    @Override
    public String getImgFolder() {
        return "stickers";
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
}


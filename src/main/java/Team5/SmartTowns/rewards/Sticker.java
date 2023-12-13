/*AUTHOR: Gabriel Copat*/
package Team5.SmartTowns.rewards;

import lombok.Getter;


@Getter
public class Sticker extends Reward{
    /* Stickers are randomly earned rewards from a specific pack */

    final int rarity; //1-5
    final int packID;

    boolean hasSticker;


    public Sticker(int packID, int id, String name, String description, int rarity) {
        super(id, name, description);
        this.rarity = rarity;
        this.packID = packID;
        displayImg = super.findImagePath();
    }

    @Override
    public String getImgFolder() {
        return "stickers/" + getPackID();
    }

    public boolean hasSticker(){
        return hasSticker;
    }
    public void setVisibility(boolean hasSticker){
        this.hasSticker = hasSticker;
    }
    public String getVisibility(){
        return hasSticker ? "gotSticker" : "grayedSticker";
    }
}


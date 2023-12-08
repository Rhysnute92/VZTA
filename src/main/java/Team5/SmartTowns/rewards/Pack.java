package Team5.SmartTowns.rewards;

import lombok.Getter;

import java.util.List;

@Getter
public class Pack extends Reward{

    int progression; //0-100%;

    public Pack(int id, String name, String description) {
        super(id, name, description);
        displayImg = super.findImagePath();
    }

    public void setProgression(List<Sticker> packStickers, List<Sticker> userStickers){
        /* Takes in a list with all stickers in the pack and a list with all userStickers from the pack
        *  These lists are taken from database in the Controllers via SQL query*/
        int totalAmount = packStickers.size();
        int hasAmount = userStickers.size();
        progression = (int) ((totalAmount/hasAmount) * 100);
    }
    @Override
    public String getImgFolder() {
        return "packs";
    }
}

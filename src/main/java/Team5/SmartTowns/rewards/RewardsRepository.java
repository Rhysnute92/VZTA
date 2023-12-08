//Holds locations data repository
package Team5.SmartTowns.rewards;

import java.util.List;

public interface RewardsRepository {
    List<Sticker> getAllStickers();

    List<Sticker> getAllStickersFromPack(int packID);

    List<Sticker> getAllStickersFromUser(int userID);

    List<Pack> getAllPacks();

    Pack findPackByID(int id);

}


//Holds locations data repository
package team5.smartTowns.rewards;

import team5.smartTowns.rewards.Badge;
import team5.smartTowns.rewards.Sticker;

import java.util.List;

public interface RewardsRepository {
    List<Badge> getAllBadges();
    List<Sticker> getAllStickers();
}


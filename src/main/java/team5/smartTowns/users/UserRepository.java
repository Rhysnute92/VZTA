//Holds users data repository
package team5.smartTowns.users;

import java.util.List;
import java.util.Map;

public interface UserRepository {
    List<User> getAllUsers();
    List<Long> getUserStickersFromPack(int userID, int packID);
    User getUserById(int userID);
    boolean unlockSticker(int userID, int packID, int stickerID);
}

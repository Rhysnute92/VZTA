//Holds users data repository
package Team5.SmartTowns.users;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    List<Long> getUserStickersFromPack(int userID, int packID);
    User getUserById(int userID);
    boolean unlockSticker(int userID, int packID, int stickerID);
}

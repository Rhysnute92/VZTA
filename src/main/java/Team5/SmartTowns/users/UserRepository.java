//Holds users data repository
package Team5.SmartTowns.users;

import java.util.List;

public interface UserRepository {
    List<User> getAllUsers();
    List<Long> getUserStickersFromPack(String username, int packID);
    boolean unlockSticker(String username, int packID, int stickerID);
    boolean addUser(String username, String email, String password);
    boolean doesUserExist(String email);
    User findUserByEmail(String email);
    User findUserByName(String name);
}

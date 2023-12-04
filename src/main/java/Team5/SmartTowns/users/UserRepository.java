//Holds users data repository
package Team5.SmartTowns.users;

import java.util.List;
import java.util.Map;

public interface UserRepository {
    List<User> getAllUsers();
//    Map<Long, Integer> getBadgeProgress(int id);
    Map<Long, Boolean> getStickers(int id);
    User getUser(int id);
}

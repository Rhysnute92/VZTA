//Implements the users repository using JDBC
package Team5.SmartTowns.users;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepositoryJDBC implements UserRepository{
    private JdbcTemplate jdbc;
    private RowMapper<User> userMapper;
    private

    public UserRepositoryJDBC(JdbcTemplate aJdbc){
        this.jdbc = aJdbc;
        setUserMapper();
    }

    private void setUserMapper(){
        userMapper = (rs, i) -> new User(
                rs.getInt("userID"),
                rs.getString("email"),
                rs.getString("name"),
                rs.getInt("dragonProgress"),
                rs.getObject("dragonstaleLandmarkIDs", getTest())
        );
    }

    @Override
    public List<User> getAllUsers(){
        String sql= "SELECT * FROM users";
        return jdbc.query(sql, userMapper);
    }


    @Override
    public User getUser(int id){
        String sql= "SELECT * FROM users WHERE userID="+id;
        List<User> result = jdbc.query(sql, userMapper);
        return result.get(0);
    }

    @Override
    public Map<Long, Boolean> getStickers(int id){
        String sql = "SELECT stickerID, hasSticker FROM stickerprogress WHERE userID=" + id;
        List<Map<String, Object>> query = jdbc.queryForList(sql);
        Map<Long, Boolean> progress = new HashMap<>();
        for (Map<String, Object> result : query) {
            progress.put((Long)result.get("stickerID"), (boolean)result.get("hasSticker"));
        }
        return progress;
    }

    @Override
    public Map<Integer, Boolean> getDTCompletion(int id){
        //Loop over multiple different key-value pairs to find the one that's needed.
        String sql = "SELECT  "
    }


//    @Override
//    public Map<Long, Integer> getBadgeProgress(int id){
//        String sql = "SELECT badgeID, progress FROM badgeprogress WHERE userID=" + id;
//        List<Map<String, Object>> query = jdbc.queryForList(sql);
//        Map<Long, Integer> progress = new HashMap<>();
//        for (Map<String, Object> result : query) {
//            progress.put((Long)result.get("badgeID"), (int)result.get("progress"));
//        }
//        return progress;
//    }
}

//Implements the users repository using JDBC
package Team5.SmartTowns.users;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryJDBC implements UserRepository{

    private JdbcTemplate jdbc;
    private RowMapper<User> userMapper;

    public UserRepositoryJDBC(JdbcTemplate aJdbc){
        this.jdbc = aJdbc;
        setUserMapper();
    }

    private void setUserMapper(){
        userMapper = (rs, i) -> new User(
                rs.getInt("id"),
                rs.getString("email"),
                rs.getString("name")
        );
    }

    @Override
    public List<User> getAllUsers(){
        String sql= "SELECT * FROM users";
        return jdbc.query(sql, userMapper);
    }

    @Override
    public User getUserById(int userID){
        String sql= "SELECT * FROM users WHERE id="+userID;
        List<User> result = jdbc.query(sql, userMapper);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public List<Long> getUserStickersFromPack(int userID, int packID) {
        String sql = "SELECT stickerID FROM stickerprogress WHERE (userID, packID)= (" + userID + "," + packID + ")";
        return jdbc.queryForList(sql, Long.class);
    }

    @Override
    public boolean unlockSticker(int userID, int packID, int stickerID){
        String sql = "INSERT INTO stickerprogress (userID, packID, stickerID) VALUES (" +
                userID + ", " + packID + "," + stickerID + ")";
        jdbc.update(sql);
        return true;
    }
}

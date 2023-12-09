//Implements the users repository using JDBC
package Team5.SmartTowns.users;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.object.SqlQuery;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Repository
public class UserRepositoryJDBC implements UserRepository{
    private final JdbcTemplate jdbc;
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
        String sql= "SELECT * FROM users WHERE id=?";
        List<User> result = jdbc.query(sql, userMapper, userID);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public List<Long> getUserStickersFromPack(int userID, int packID) {
        String sql = "SELECT stickerID FROM stickerprogress WHERE (userID, packID)= (?,?)";
        return jdbc.queryForList(sql, Long.class, userID, packID);
    }

    @Override
    public boolean unlockSticker(int userID, int packID, int stickerID){
        String sql = "INSERT INTO stickerprogress (userID, packID, stickerID) VALUES (?,?,?)";
        jdbc.update(sql, userID, packID, stickerID);
        return true;
    }

    @Override
    public boolean addUser(String username, String email, String password){
        String query = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
        jdbc.update(query, username, email, password);
        return true;
    }
    @Override
    public boolean doesUserExist(String email){
        String query = "SELECT COUNT(email) FROM users WHERE (email) = (?)";
        return !(jdbc.queryForObject(query, Integer.class, email) == 0);
    }
    @Override
    public boolean userLogIn(String email, String password){
        String query = "SELECT (password) FROM users WHERE (email) = (?)";
        String dbpassword = jdbc.queryForObject(query, String.class, email);
        return Objects.equals(dbpassword, password);
    }

}

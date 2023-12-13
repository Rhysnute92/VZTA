//Implements the users repository using JDBC
package Team5.SmartTowns.users;

import org.springframework.dao.DataAccessException;
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
                rs.getString("email"),
                rs.getString("username")
        );
    }

    @Override
    public List<User> getAllUsers(){
        String sql= "SELECT * FROM users";
        return jdbc.query(sql, userMapper);
    }


    @Override
    public List<Long> getUserStickersFromPack(String username, int packID) {
        /* Returns a list with the stickerIDs of stickers that the specified user has unlocked from the given pack */
        String sql = "SELECT stickerID FROM stickerprogress WHERE (username, packID)= (?,?)";
        return jdbc.queryForList(sql, Long.class, username, packID);
    }

    @Override
    public boolean unlockSticker(String username, int packID, int stickerID){
        /* Adds entry in the stickerprogress database, effectively unlocking the sticker for the user
        *  Returns false if no sticker is unlocked */
        String query = "SELECT COUNT(id) FROM stickers WHERE (stickerID, packID) = (stickerID, packID)";
        if (jdbc.queryForObject(query, Integer.class) == 1){ //Checks if sticker exists
            String sql = "INSERT INTO stickerprogress (username, packID, stickerID) VALUES (?,?,?)";
            jdbc.update(sql, username, packID, stickerID);
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(String username, String email, String password) throws DataAccessException{
        /* Adds new user to the database */
        String query = "INSERT INTO users (username, email, password) VALUES (?, ?, ?);";
        String query2= "INSERT INTO authorities (username, authority) VALUES (?,?);";
        jdbc.update(query, username, email, password);
        jdbc.update(query2, username, "USER");
        return true;
    }
    @Override
    public boolean doesUserExist(String email){
        /* Returns true if a user with given email already exists in the database */
        String query = "SELECT COUNT(email) FROM users WHERE (email) = (?)";
        return !(jdbc.queryForObject(query, Integer.class, email) == 0);
    }

    @Override
    public User findUserByEmail(String email) {
        /* Finds user matching given email */
        String query = "SELECT * FROM users WHERE (email) = (?)";
        List<User> result = jdbc.query(query, userMapper, email);
        return result.isEmpty() ? null : result.get(0);
    }
    @Override
    public User findUserByName(String name) {
        /* Finds user matching given name */
        String query = "SELECT * FROM users WHERE (username) = (?)";
        List<User> result = jdbc.query(query, userMapper, name);
        return result.isEmpty() ? null : result.get(0);
    }

}

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
                rs.getInt("userID"),
                rs.getString("email"),
                rs.getString("name")
        );
    }



    @Override
    public List<User> getAllUsers(){
        String sql= "SELECT * FROM users";
        return jdbc.query(sql, userMapper);
    }
}

package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryJDBC implements UserRepository{

    private JdbcTemplate jdbc;
    private RowMapper<user> userMapper;

    public UserRepositoryJDBC(JdbcTemplate aJdbc){
        this.jdbc = aJdbc;
        setuserMapper();
    }


    private void setuserMapper(){
        userMapper = (rs, i) -> new user(
                rs.getInt("userId"),
                rs.getString("name")
        );
    }



    @Override
    public List<user> getAllUsers(){
        String sql= "SELECT * FROM users";
        return jdbc.query(sql, userMapper);
    }
}

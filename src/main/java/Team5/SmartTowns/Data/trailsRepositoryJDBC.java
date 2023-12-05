//Implements the trails repository using JDBC
package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class trailsRepositoryJDBC implements trailsRepository{
    private JdbcTemplate jdbc;
    private RowMapper<trail> trailMapper;
        public trailsRepositoryJDBC(JdbcTemplate aJdbc){
        this.jdbc = aJdbc;
        settrailsMapper();
    }
    private void settrailsMapper(){
        trailMapper = (rs, i) -> new trail(
                rs.getInt("trailID"),
                rs.getString("name"),
                rs.getBoolean("tru")
        );
    }
    public List<trail> getAllTrails(){
        String sql= "SELECT * FROM trails";
        return jdbc.query(sql, trailMapper);
    }
}

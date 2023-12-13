//Implements the trails repository using JDBC
package Team5.SmartTowns.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TrailsRepositoryJDBC implements TrailsRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Trail> trailMapper;
        public TrailsRepositoryJDBC(JdbcTemplate aJdbc){
        this.jdbc = aJdbc;
        settrailsMapper();
    }
    private void settrailsMapper(){
        trailMapper = (rs, i) -> new Trail(
                rs.getInt("trailID"),
                rs.getString("name"),
                rs.getBoolean("tru")
        );
    }
    public List<Trail> getAllTrails(){
        String sql= "SELECT * FROM trails";
        return jdbc.query(sql, trailMapper);
    }
}

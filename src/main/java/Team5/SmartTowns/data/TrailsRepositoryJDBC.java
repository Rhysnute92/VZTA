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
                rs.getLong("trailID"),
                rs.getString("trailName"),
                rs.getString("trailNumber")
        );
    }
    public List<Trail> getAllTrails(){
        String sql= "SELECT * FROM trails";
        return jdbc.query(sql, trailMapper);
    }
    @Override
    public String getTrailNameWithID(String trailsID){
        String resultName = jdbc.queryForObject(
                "SELECT trailName FROM trails WHERE trailID=?", String.class, trailsID);
        return resultName;


    }

    @Override
    public List<Trail> getAllTrailsFromCity(String cityName) {
        String sql = "SELECT * FROM trails WHERE city = ?";
        return jdbc.query(sql, trailMapper, cityName);
    }


}

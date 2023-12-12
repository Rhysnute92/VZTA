package Team5.SmartTowns.Data;

import Team5.SmartTowns.trails.Trail;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class MockUser {

    private JdbcTemplate jdbc;
    private RowMapper<Trail> trailMapper;
    public List<Trail> getAllTrails(){
        String sql= "SELECT * FROM trails";
        return jdbc.query(sql, trailMapper);
    }
}

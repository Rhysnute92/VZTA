package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class MockUser {

    private JdbcTemplate jdbc;
    private RowMapper<trail> trailMapper;

    public List<trail> getAllTrails(){
        String sql= "SELECT * FROM trails";
        return jdbc.query(sql, trailMapper);
    }
}

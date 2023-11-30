package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public abstract class locationRepositoryJDBC implements locationRepository {
    private JdbcTemplate jdbc;
    private RowMapper<location> locationMapper;

    public locationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }
    private void setlocationMapper(){
        locationMapper = (rs, i) -> new location(
                rs.getInt("locationId"),
                rs.getString("name")
        );
    }
    public List<location> getAllLocation(){
        String sql= "SELECT * FROM location";
        return jdbc.query(sql, locationMapper);
    }
}

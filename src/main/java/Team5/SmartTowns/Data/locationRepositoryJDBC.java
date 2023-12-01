//Implements the locations repository using JDBC
package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class locationRepositoryJDBC implements locationRepository {
    private JdbcTemplate jdbc;
    private RowMapper<location> locationMapper;

    public locationRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setlocationMapper();
    }
    private void setlocationMapper(){
        locationMapper = (rs, i) -> new location(
                rs.getInt("locationID"),
                rs.getString("locationName")
//                rs.getString("locationEmail"),
//                rs.getString("locationDescription"),
//                rs.getString("locationPlace"), //todo revert this
//                rs.getInt("locationTrailID")
        );
    }
    public List<location> getAllLocation(){
        String sql= "SELECT locationID,locationName FROM locations";
        return jdbc.query(sql, locationMapper);
    }
}

//Implements the locations repository using JDBC
package team5.smartTowns.rewards;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BadgesRepositoryJDBC implements BadgesRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Badge> badgeMapper;

    public BadgesRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setBadgeMapper();
    }
    private void setBadgeMapper(){
        badgeMapper = (rs, i) -> new Badge(
                rs.getInt("badgeID"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("difficulty")
        );
    }

    @Override
    public List<Badge> getAllBadges(){
        String sql= "SELECT * FROM badges";
        return jdbc.query(sql, badgeMapper);
    }
}

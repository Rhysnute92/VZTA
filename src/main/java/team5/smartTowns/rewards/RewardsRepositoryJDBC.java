//Implements the locations repository using JDBC
package team5.smartTowns.rewards;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RewardsRepositoryJDBC implements RewardsRepository {
    private final JdbcTemplate jdbc;
    private RowMapper<Badge> badgeMapper;
    private RowMapper<Sticker> stickerMapper;

    public RewardsRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setBadgeMapper();
        setStickerMapper();
    }
    private void setBadgeMapper(){
        badgeMapper = (rs, i) -> new Badge(
                rs.getInt("badgeID"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("difficulty")
        );
    }

    private void setStickerMapper(){
        stickerMapper = (rs, i) -> new Sticker(
                rs.getInt("stickerID"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("rarity")
        );
    }

    @Override
    public List<Sticker> getAllStickers(){
        String sql= "SELECT * FROM stickers";
        return jdbc.query(sql, stickerMapper);
    }

    @Override
    public List<Badge> getAllBadges(){
        String sql= "SELECT * FROM badges";
        return jdbc.query(sql, badgeMapper);
    }
}

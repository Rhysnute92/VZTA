//Implements the locations repository using JDBC
package team5.smartTowns.rewards;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import team5.smartTowns.users.User;

import java.util.List;

@Repository
public class RewardsRepositoryJDBC implements RewardsRepository {
    private final JdbcTemplate jdbc;
    private RowMapper<Badge> badgeMapper;
    private RowMapper<Sticker> stickerMapper;
    private RowMapper<Pack> packMapper;

    public RewardsRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setBadgeMapper();
        setStickerMapper();
        setPackMapper();
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
                rs.getInt("rarity"),
                rs.getInt("packID")
        );
    }
    private void setPackMapper(){
        packMapper = (rs, i) -> new Pack(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("description")
        );
    }

    @Override
    public List<Sticker> getAllStickers(){
        String sql= "SELECT * FROM stickers";
        return jdbc.query(sql, stickerMapper);
    }

    @Override
    public List<Pack> getAllPacks() {
        String sql= "SELECT * FROM packs";
        return jdbc.query(sql, packMapper);
    }

    @Override
    public List<Badge> getAllBadges(){
        String sql= "SELECT * FROM badges";
        return jdbc.query(sql, badgeMapper);
    }

    public List<Sticker> getAllStickersFromPack(int packID){
        String sql= "SELECT * FROM stickers WHERE packID="+packID;
        return jdbc.query(sql, stickerMapper);
    }

    @Override
    public Pack findPackByID(int id){
        String sql= "SELECT * FROM packs WHERE id="+id;
        List<Pack> result = jdbc.query(sql, packMapper);
        return result.get(0);
    }
}

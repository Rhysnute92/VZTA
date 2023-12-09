//Implements the locations repository using JDBC
package Team5.SmartTowns.rewards;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RewardsRepositoryJDBC implements RewardsRepository {
    private final JdbcTemplate jdbc;
    private RowMapper<Sticker> stickerMapper;
    private RowMapper<Pack> packMapper;

    public RewardsRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setStickerMapper();
        setPackMapper();
    }

    private void setStickerMapper(){
        stickerMapper = (rs, i) -> new Sticker(
                rs.getInt("packID"),
                rs.getInt("stickerID"),
                rs.getString("name"),
                rs.getString("description"),
                rs.getInt("rarity")
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
    public List<Sticker> getAllStickersFromPack(int packID){
        String sql= "SELECT * FROM stickers WHERE packID="+packID;
        return jdbc.query(sql, stickerMapper);
    }

    @Override
    public List<Sticker> getAllStickersFromUser(int userID) {
        /* FINDS ALL STICKERS UNLOCKED BY THE GIVEN USER */
        String sql= "SELECT * FROM stickers LEFT JOIN stickerprogress " +
                "ON (stickers.id, stickers.packID) = (stickerprogress.stickerID, stickerprogress.packID) " +
                "WHERE stickerprogress.userID="+userID;
        return jdbc.query(sql, stickerMapper);
    }

    @Override
    public Pack findPackByID(int id){
        String sql= "SELECT * FROM packs WHERE id="+id;
        List<Pack> result = jdbc.query(sql, packMapper);
        return result.isEmpty() ? null : result.get(0);
    }
}

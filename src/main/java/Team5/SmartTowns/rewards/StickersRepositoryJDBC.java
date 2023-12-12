//Implements the locations repository using JDBC
package Team5.SmartTowns.rewards;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StickersRepositoryJDBC implements StickersRepository {
    private JdbcTemplate jdbc;
    private RowMapper<Sticker> stickerMapper;

    public StickersRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setStickerMapper();
    }
    private void setStickerMapper(){
        stickerMapper = (rs, i) -> new Sticker(
                rs.getInt("stickerID"),
                rs.getInt("stickerID"), rs.getString("name"),
                rs.getString("description"),
                rs.getInt("rarity")
        );
    }

    @Override
    public List<Sticker> getAllStickers(){
        String sql= "SELECT * FROM stickers";
        return jdbc.query(sql, stickerMapper);
    }
}

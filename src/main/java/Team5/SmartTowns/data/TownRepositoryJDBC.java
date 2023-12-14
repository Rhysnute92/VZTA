package Team5.SmartTowns.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TownRepositoryJDBC implements TownRepository{

    private JdbcTemplate jdbc;
    private RowMapper<Town> townMapper;

    public TownRepositoryJDBC(JdbcTemplate aJdbc) {
        this.jdbc = aJdbc;
        setTownMapper();
    }
    private void setTownMapper(){
        townMapper = (rs, i) -> new Town(
                rs.getString("townName"),
                rs.getInt("townTrailNumber")
        );
    }
    public List<Town> getAllTowns(){
        String sql= "SELECT * FROM towns";
        return jdbc.query(sql, townMapper);
    }

    @Override // intended implementation at current: user data from templates/Landmarks/LandmarkFormTh.html is added to the Location table
    public void addTown(Town town) {
        String sql = "insert into towns( townName,townTrailNumber) values (?,?)";

        jdbc.update(sql,town.getTownName(),town.getTownTrailNumber());
    }

}

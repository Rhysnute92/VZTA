package Team5.SmartTowns.localauthority;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LocalAuthorityRepositoryJDBC implements LocalAuthorityRepository {
    private JdbcTemplate jdbc;
    private RowMapper<LocalAuthority> localAuthorityMapper;

    public LocalAuthorityRepositoryJDBC(JdbcTemplate ajdbc){
        this.jdbc = ajdbc;
        setlocalauthorityMapper();
    }

    private void setlocalauthorityMapper(){
        localAuthorityMapper = (rs, i) -> new LocalAuthority(
                rs.getString("localAuthorityName"),
                rs.getString("address1"),
                rs.getString("address2"),
                rs.getString("city"),
                rs.getString("county"),
                rs.getString("postcode"),
                rs.getString("website")
        );
    }
    public List<LocalAuthority> getAllLocalAuthority(){
        String sql = "SELECT * FROM localAuthority";
        return jdbc.query(sql, localAuthorityMapper);
    }
    @Override
    public void addLocalAuthority(LocalAuthority loc){
        String sql = "INSERT INTO localAuthority( localAuthorityName, address1, address2, city, county, postcode, website) values (?, ?, ?, ?, ?, ?, ?)";
        jdbc.update(sql, loc.getLocalAuthorityName(),loc.getAddress1(),loc.getAddress2(),loc.getCity(),loc.getCounty(),loc.getPostcode(),loc.getWebsite());
    }

}

package Team5.SmartTowns.Data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class localAuthorityRepositoryJDBC implements localAuthorityRepository {
    private JdbcTemplate jdbc;
    private RowMapper<localAuthority> localAuthorityMapper;

    public localAuthorityRepositoryJDBC(JdbcTemplate ajdbc){
        this.jdbc = ajdbc;
        setlocalauthorityMapper();
    }

    private void setlocalauthorityMapper(){
        localAuthorityMapper = (rs, i) -> new localAuthority(
                rs.getString("localAuthorityName"),
                rs.getString("address1"),
                rs.getString("address2"),
                rs.getString("city"),
                rs.getString("county"),
                rs.getString("postcode"),
                rs.getString("website")
        );
    }
    public List<localAuthority> getAllLocalAuthority(){
        String sql = "SELECT * FROM localAuthority";
        return jdbc.query(sql, localAuthorityMapper);
    }
    @Override
    public void addLocalAuthority(localAuthority loc){
        String sql = "INSERT INTO localAuthority( localAuthorityName, address1, address2, city, county, postcode, website) values (?, ?, ?, ?, ?, ?, ?)";
        jdbc.update(sql, loc.getLocalAuthorityName(),loc.getAddress1(),loc.getAddress2(),loc.getCity(),loc.getCounty(),loc.getPostcode(),loc.getWebsite());
    }

}

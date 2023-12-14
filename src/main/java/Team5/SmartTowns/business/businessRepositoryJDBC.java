package Team5.SmartTowns.business;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class businessRepositoryJDBC implements businessRepository{

        private JdbcTemplate jdbc;
        private RowMapper<business> businessMapper;

        public businessRepositoryJDBC(JdbcTemplate ajdbc){
            this.jdbc = ajdbc;
            setbusinessMapper();
        }

        private void setbusinessMapper(){
            businessMapper = (rs, i) -> new business(
                    rs.getString("businessName"),
                    rs.getString("address1"),
                    rs.getString("address2"),
                    rs.getString("city"),
                    rs.getString("county"),
                    rs.getString("postcode"),
                    rs.getString("website")
            );
        }
        public List<business> getAllBusinesses(){
            String sql = "SELECT * FROM businesses";
            return jdbc.query(sql, businessMapper);
        }

    @Override
    public void addBusiness(business bus) {
            String sql = "INSERT INTO businesses( businessName, address1, address2, city, county, postcode, website) values (?, ?, ?, ?, ?, ?, ?)";
            jdbc.update(sql, bus.getBusinessName(),bus.getAddress1(),bus.getAddress2(),bus.getCity(),bus.getCounty(),bus.getPostcode(),bus.getWebsite());
        }
}



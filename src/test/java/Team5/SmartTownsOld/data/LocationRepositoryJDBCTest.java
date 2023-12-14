//package Team5.SmartTowns.data;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//
//@SpringBootTest
//class LocationRepositoryJDBCTest {
//    private JdbcTemplate jdbcTemplate;
//    private LocationRepositoryJDBC locationRepositoryJDBC;
//
//    private RowMapper<Location> locationMapper;
//
//
//    @Autowired
//    public void setlocationMapper(){
//        locationMapper = (rs, i) -> new Location(
//
//                rs.getString("locationName"),
//                rs.getString("locationEmail"),
//                rs.getString("locationDescription"),
//                rs.getString("locationPlace"),
//                rs.getString("locationTrailID"),
//                rs.getBoolean("locationApproved")
//        );
//    }
//    @Autowired
//    public void LocationRepositoryJDBC(JdbcTemplate jdbc){
//        this.jdbcTemplate = jdbc;
//        locationRepositoryJDBC = new LocationRepositoryJDBC(jdbc);
//    }
//
//
//
//
//    @Test
//    public void test(){
//
//    }
//
//
//}
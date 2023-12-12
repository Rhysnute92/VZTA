//package Team5.SmartTowns.data;

//import  org.junit.platform.commons.util.Preconditions;
//
import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.LocationRepositoryJDBC;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@SpringBootTest
public class testTwo {

private JdbcTemplate jdbcTemplate;
private LocationRepositoryJDBC locationRepositoryJDBC;

private RowMapper<Location> locationMapper;

@Autowired
private LocationRepository locationRepository;


@Autowired
    public void LocationRepositoryJDBC(JdbcTemplate jdbc){
    this.jdbcTemplate = jdbc;
    locationRepositoryJDBC = new LocationRepositoryJDBC(jdbc);
}


@BeforeAll
public static void setUp(){
    locationRepository = new LocationRepositoryJDBC.getAllLocation();
// locationRepository = (LocationRepositoryJDBC) locationRepository.getAllLocation();
}

@Test
public void test(){
    int aa=1;
   assertEquals(1,aa);

    }



}

//package Team5.SmartTowns.Data;
//
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//// create lists of sql data todo
//@SpringBootTest
//class locationRepositoryJDBCTest {
//
//private static LocationRepository locationRepo;
//
//
//    @Autowired
//    private LocationRepository locationRepo;
//
//    @Mock
//    private JdbcTemplate jdbc;
//@BeforeAll
//public static void setup(){
//    LocationRepositoryJDBC aa= new LocationRepositoryJDBC(jdbc);
//}
//    @Test
//    void getAllLocation() {
//        List<Location> locations=  locationRepo.getAllLocation();
//        int preAdd = locations.size();
//        Location loc = new Location("House","House@Bricks","Description Here","Caerphilly",103);
//        locationRepo.addLocation(loc);
//        int postAdd = locationRepo.getAllLocation().size();
//        assertEquals(1,(postAdd-preAdd));
//    }
//
//    @Test
//    void addLocation() {
//    }
//
//    @Test
//    void setJdbc() {
//    }
//}
//package Team5.SmartTowns;
//
//import Team5.SmartTowns.Data.Location;
//import Team5.SmartTowns.Data.LocationRepository;
//import Team5.SmartTowns.Data.LocationRepositoryJDBC;
//import org.junit.Before;
////import org.junit.runner.RunWith;
////import org.mockito.Mockito;
////import org.mockito.internal.invocation.InvocationsFinder;
//import org.junit.jupiter.api.BeforeAll;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.TestConfiguration;
//
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.core.JdbcTemplate;
////import org.springframework.test.context.junit4.SpringRunner;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.testng.AssertJUnit.assertEquals;
//
////@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Test6Mock {
//
//    @TestConfiguration
//    static class EmployeeServiceImplTestContextConfiguration {
//
//        @Bean
//        public Location location() {
//            return new Location();
//        }
//    }
//
//
//        @Autowired
//        private LocationRepository locationRepo;
//        @Autowired
//        private LocationRepositoryJDBC locationRepoJ;
//
//
//        @MockBean
//        private JdbcTemplate jdbc;
//
//
//        @BeforeAll
//        public static void setUp() {
//            LocationRepository LocationRepository= new LocationRepository() {
//                @Override
//                public List<Location> getAllLocation() {
//                    return null;
//                }
//
//                @Override
//                public void addLocation(Location loc) {
//
//                }
//            };
//
////        Location alex = new Location("House","House@Bricks","Description Here","Caerphilly",103);
////
////        Mockito.when(LocationRepository.getAllLocation())
////                .thenReturn(LocationRepository.getAllLocation());
//        }
//
//
//        @Test
//        public void whenValidName_thenEmployeeShouldBeFound() {
//            LocationRepositoryJDBC s= new LocationRepositoryJDBC(jdbc);
//            List<Location> locations = LocationRepository.getAllLocation();
//            assertEquals(18,locations.size());
//
//        }
//    }
//

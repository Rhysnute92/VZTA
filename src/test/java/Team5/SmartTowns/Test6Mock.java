//package Team5.SmartTowns;
//
//import Team5.SmartTowns.Data.Location;
//import Team5.SmartTowns.Data.locationRepository;
//import Team5.SmartTowns.Data.locationRepositoryJDBC;
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
//        private locationRepository locationRepo;
//        @Autowired
//        private locationRepositoryJDBC locationRepoJ;
//
//
//        @MockBean
//        private JdbcTemplate jdbc;
//
//
//        @BeforeAll
//        public static void setUp() {
//            locationRepository locationRepository= new locationRepository() {
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
////        Mockito.when(locationRepository.getAllLocation())
////                .thenReturn(locationRepository.getAllLocation());
//        }
//
//
//        @Test
//        public void whenValidName_thenEmployeeShouldBeFound() {
//            locationRepositoryJDBC s= new locationRepositoryJDBC(jdbc);
//            List<Location> locations = locationRepository.getAllLocation();
//            assertEquals(18,locations.size());
//
//        }
//    }
//

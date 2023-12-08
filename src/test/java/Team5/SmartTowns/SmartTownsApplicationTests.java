package Team5.SmartTowns;

import Team5.SmartTowns.data.DatabaseController;
import Team5.SmartTowns.data.Location;
import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.LocationRepositoryJDBC;
import Team5.SmartTowns.landmarks.Landmarks;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Inherited;
import java.util.List;




@SpringBootTest
class SmartTownsApplicationTests {

	@Test
	void contextLoads() {
	}





//	private static Location location;
//	private static locationRepositoryJDBC locationRepo;
//	private static JdbcTemplate jdbc;
//	@BeforeAll
//	public static void before() {
//		location = new Location();
//		locationRepo = new locationRepositoryJDBC(jdbc);}
//	@BeforeAll
//	public static void before2() {
//		locationRepo = new locationRepositoryJDBC(jdbc); }
//	@Autowired
//	private locationRepository locationRepository;

//	@Test
//	public void whenAddingLocationsNonApprovedLocationsDontShowInTrails(){
//		/// Discover number of approved/unapproved locations before adding tests
//		List<Location> approvedNumber = locationRepo.approvedLocations();
//	}
////		Location loc1= new Location("TestFail", "Test@PleaseFail.test", "Fail Description here",
////				"Caerphilly", 103, false);
////		Location loc2= new Location("TestFail", "Test@PleaseFail2.test", "Fail Description here",
////				"Caerphilly", 103, false);
////		Location loc3= new Location("TestPass", "Test@PleasePass.test", "Pass Description here",
////				"Caerphilly", 103, true);
////		locationRepository.addLocation(loc1);
////		locationRepository.addLocation(loc2);
////		locationRepository.addLocation(loc3);
////		List<Location> ApprovedNumberAfter=locationRepository.approvedLocations();
////
////		assertEquals(1,( ApprovedNumber.size()-ApprovedNumberAfter.size()));
//		}
	}



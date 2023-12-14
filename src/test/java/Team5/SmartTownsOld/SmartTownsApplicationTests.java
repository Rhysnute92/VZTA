//package Team5.SmartTowns;
//
<<<<<<< HEAD
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SmartTownsApplicationTests {
//
=======
//import Team5.SmartTowns.data.DatabaseController;
//import Team5.SmartTowns.data.Location;
//import Team5.SmartTowns.data.LocationRepository;
//import Team5.SmartTowns.data.LocationRepositoryJDBC;
//import Team5.SmartTowns.landmarks.Landmarks;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import java.lang.annotation.Inherited;
//import java.util.List;
//
//
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
////@SpringBootTest
//class SmartTownsApplicationTests {
//
//	@Autowired
//	private LocationRepository locationRepository;
//
//
>>>>>>> main
//	@Test
//	void contextLoads() {
//	}
//
<<<<<<< HEAD
//}
//
//////	test2
////	public void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount1() {
////		DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
////				.addScript("classpath:jdbc/schema.sql")
////				.addScript("classpath:jdbc/test-data.sql")
////				.build();
////
////		LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC();
////		employeeDAO.setDataSource(dataSource);
////
////		assertEquals(4, employeeDAO.getCountOfEmployees());}
////
////	@Test
//////	test 1
////	void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
////		LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC(ajdbc);
//////		employeeDAO.setJdbcTemplate(ajdbc);
////		assertEquals(4, employeeDAO.getAllLocation().size());
////
//////		assertEquals(4, employeeDAO.getCountOfEmployees());
////	}}
//////	@Test
//////	void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
//////		EmployeeDAO employeeDAO = new EmployeeDAO();
//////		employeeDAO.setJdbcTemplate(jdbcTemplate);
//////
//////		assertEquals(4, employeeDAO.getCountOfEmployees());
//////	}
////
=======
//	@Test
//	void test(){
//		Location location = new Location();
//		location.setLocationName("Test");
//		location.setLocationEmail("test@test");
//		location.setLocationDescription("Description Here");
//		location.setLocationPlace("Caerphilly");
//		location.setLocationTrailID("0103");
//		location.setLocationApproved(false);
//
//		int locSize1 = locationRepository.getAllLocation().size();
//		locationRepository.addLocation(location);
//		int locSize2 = locationRepository.getAllLocation().size();
//		assertEquals(1, (locSize2-locSize1));
//
//
//	}
//
//
//
//
//
////	private static Location location;
////	private static locationRepositoryJDBC locationRepo;
////	private static JdbcTemplate jdbc;
////	@BeforeAll
////	public static void before() {
////		location = new Location();
////		locationRepo = new locationRepositoryJDBC(jdbc);}
////	@BeforeAll
////	public static void before2() {
////		locationRepo = new locationRepositoryJDBC(jdbc); }
////	@Autowired
////	private locationRepository locationRepository;
>>>>>>> main
//
////	@Test
////	public void whenAddingLocationsNonApprovedLocationsDontShowInTrails(){
////		/// Discover number of approved/unapproved locations before adding tests
////		List<Location> approvedNumber = locationRepo.approvedLocations();
////	}
//////		Location loc1= new Location("TestFail", "Test@PleaseFail.test", "Fail Description here",
//////				"Caerphilly", 103, false);
//////		Location loc2= new Location("TestFail", "Test@PleaseFail2.test", "Fail Description here",
//////				"Caerphilly", 103, false);
//////		Location loc3= new Location("TestPass", "Test@PleasePass.test", "Pass Description here",
//////				"Caerphilly", 103, true);
//////		locationRepository.addLocation(loc1);
//////		locationRepository.addLocation(loc2);
//////		locationRepository.addLocation(loc3);
//////		List<Location> ApprovedNumberAfter=locationRepository.approvedLocations();
//////
//////		assertEquals(1,( ApprovedNumber.size()-ApprovedNumberAfter.size()));
////		}
//	}
<<<<<<< HEAD
=======
//
//// create test where getFullListLocations and getFullApproved/Unapporved lcopations from lcoationcooirds matches locationJDBC
>>>>>>> main

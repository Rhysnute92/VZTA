//package Team5.SmartTowns;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//class SmartTownsApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}
//
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

package Team5.SmartTowns;

import Team5.SmartTowns.Data.LocationRepository;
import Team5.SmartTowns.Data.LocationRepositoryJDBC;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.jdbc.Sql;
//import org.testng.Assert;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

@SpringBootTest
@JdbcTest

@Sql({"schema.sql", "data.sql"})
class SmartTownsApplicationTests {
@Autowired
	private JdbcTemplate ajdbc;

	@Test
//	test2
	public void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount1() {
		DataSource dataSource = new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("classpath:jdbc/schema.sql")
				.addScript("classpath:jdbc/test-data.sql")
				.build();

		LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC();
		employeeDAO.setDataSource(dataSource);

		assertEquals(4, employeeDAO.getCountOfEmployees());}

	@Test
//	test 1
	void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
		LocationRepositoryJDBC employeeDAO = new LocationRepositoryJDBC();
		employeeDAO.setJdbcTemplate(ajdbc);
		assertEquals(4, employeeDAO.getAllLocation().size());

//		assertEquals(4, employeeDAO.getCountOfEmployees());
	}
//	@Test
//	void whenInjectInMemoryDataSource_thenReturnCorrectEmployeeCount() {
//		EmployeeDAO employeeDAO = new EmployeeDAO();
//		employeeDAO.setJdbcTemplate(jdbcTemplate);
//
//		assertEquals(4, employeeDAO.getCountOfEmployees());
//	}




//
////	private static TownController townController;
//
//
////	private static Team5.SmartTowns.Data.Location location;
////	@Mock
////	private static JdbcTemplate jdbc;
////
////	@Autowired
////	private Team5.SmartTowns.Data.LocationRepository locationRepo;
////	JdbcTemplate jdbc = Mockito.mock(JdbcTemplate.class);
//////	@Autowired
//////	private static Team5.SmartTowns.Data.TownRepository townRepository;
//////
//////
//////	private static Team5.SmartTowns.Data.Location town;
//////	private static RowMapper<Location> locationMapper;
////
////
////	@BeforeAll
////	public void before() {
//////		MockitoAnnotations.initMocks(this);
//////		location = new Location();
////		locationRepo = mock(new LocationRepositoryJDBC(jdbc));
//////		townController = new TownController();
////	}
//////	@BeforeAll
//////	public static void before(){}
//////		location = new Location();
//////}
////
////	@Test
////	void contextLoads() {
////	}
////
////	@Test
////	public void whenFilteringTownsByLocationsReturnOneTown() {
////		List<Location> allLocations = ( locationRepo.getAllLocation());
////		List<Town> allTowns = townRepository.getAllTowns();
////		int allLocationNumber=allLocations.size();
////		int allLocationNumberAfterFilter=0;
////		for (Town town : allTowns){
////			allLocationNumberAfterFilter+=townController.filterByLocationForTrails(allLocations, town.getTownName() ).size();
//		}
////		assertSame(allLocationNumber,allLocationNumberAfterFilter);
//// /// list of all locations,
////	filter by all three towns
////	add together size  should be same
//	}
//
//
//

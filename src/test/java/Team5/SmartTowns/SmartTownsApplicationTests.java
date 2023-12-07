package Team5.SmartTowns;

import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Data.Town;
import Team5.SmartTowns.Data.TownRepository;
import Team5.SmartTowns.Data.locationRepositoryJDBC;
import Team5.SmartTowns.Towns.TownController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

@SpringBootTest
@JdbcTest
@Sql({"schema.sql", "data.sql"})
class SmartTownsApplicationTests {

//
//	private static TownController townController;


//	private static Team5.SmartTowns.Data.Location location;
//	@Mock
//	private static JdbcTemplate jdbc;

	@Autowired
	private Team5.SmartTowns.Data.locationRepository locationRepo;
	JdbcTemplate jdbc = Mockito.mock(JdbcTemplate.class);
//	@Autowired
//	private static Team5.SmartTowns.Data.TownRepository townRepository;
//
//
//	private static Team5.SmartTowns.Data.Location town;
//	private static RowMapper<Location> locationMapper;


	@BeforeAll
	public void before() {
//		MockitoAnnotations.initMocks(this);
//		location = new Location();
		locationRepo = mock(new locationRepositoryJDBC(jdbc));
//		townController = new TownController();
	}
//	@BeforeAll
//	public static void before(){}
//		location = new Location();
//}

	@Test
	void contextLoads() {
	}

	@Test
	public void whenFilteringTownsByLocationsReturnOneTown() {
		List<Location> allLocations = ( locationRepo.getAllLocation());
//		List<Town> allTowns = townRepository.getAllTowns();
//		int allLocationNumber=allLocations.size();
//		int allLocationNumberAfterFilter=0;
//		for (Town town : allTowns){
//			allLocationNumberAfterFilter+=townController.filterByLocationForTrails(allLocations, town.getTownName() ).size();
		}
//		assertSame(allLocationNumber,allLocationNumberAfterFilter);
// /// list of all locations,
//	filter by all three towns
//	add together size  should be same
	}




package Team5.SmartTowns;

import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Data.Town;
import Team5.SmartTowns.Data.TownRepository;
import Team5.SmartTowns.Towns.TownController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SmartTownsApplicationTests {


	private static TownController townController;
	@Autowired
	private Team5.SmartTowns.Data.locationRepository locationRepository;

	private Team5.SmartTowns.Data.Location location;

	@Autowired
	private Team5.SmartTowns.Data.TownRepository townRepository;

	private Team5.SmartTowns.Data.Location town;

	@BeforeAll
	public static void before() {
		locationRepositroy = new location.locationRepository();
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
		List<Location> allLocations = locationRepository.getAllLocation();
		List<Town> allTowns = townRepository.getAllTowns();
		int allLocationNumber=allLocations.size();
		int allLocationNumberAfterFilter=0;
		for (Town town : allTowns){
			allLocationNumberAfterFilter+=townController.filterByLocationForTrails(allLocations,town.getTownName()).size();
		}
		assertSame(allLocationNumber,allLocationNumberAfterFilter);
 /// list of all locations,
//	filter by all three towns
//	add together size  should be same
	}


}

package Team5.SmartTowns;

import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Towns.TownController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SmartTownsApplicationTests {

	private static TownController townController;
	@Autowired
	private Team5.SmartTowns.Data.locationRepository locationRepository;

	private Team5.SmartTowns.Data.Location location;
//	@BeforeAll
//	public static void before(){}
//		location = new Location();
//}

	@Test
	void contextLoads() {
	}

//	@Test
//	public void whenFilteringTownsByLocationsReturnOneTown() {
//
//		townController.filterByLocationForTrails()
//
//
//		assertEquals(, townController.filterByLocationForTrails);
//	}
//
//
}

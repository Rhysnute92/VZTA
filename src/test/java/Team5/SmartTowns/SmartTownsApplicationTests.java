package Team5.SmartTowns;

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
//	@BeforeAll
//	public static void before(){}
//		townController= new townController();
//}

	@Test
	void contextLoads() {
	}

	@Test
	public void whenFilteringTownsByLocationsReturnOneTown() {

		townController.filterByLocationForTrails()


		assertEquals(, townController.filterByLocationForTrails);
	}


}

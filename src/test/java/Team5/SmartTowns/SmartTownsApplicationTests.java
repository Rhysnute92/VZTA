package Team5.SmartTowns;

import Team5.SmartTowns.Data.DatabaseController;
import Team5.SmartTowns.Data.Location;
import Team5.SmartTowns.Data.locationRepository;
import Team5.SmartTowns.Landmarks.Landmarks;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.annotation.Inherited;
import java.util.List;

import static sun.java2d.pipe.PixelToParallelogramConverter.len;


@SpringBootTest
class SmartTownsApplicationTests {

	@Test
	void contextLoads() {
	}

	private static Landmarks landamrk;
	private static Location location;
	@Autowired
	private locationRepository locationRepository;

	@Test
	public void whenAddingLocationsNonApprovedLocationsDontShowInTrails(){
		/// Discover number of approved/unapproved locations before adding tests
//		DatabaseController.approvedLocations();

		int locationFailureNumber= locations.size()-locationApprovalList.size(); // ensure number always positive

		Location loc1= new Location("TestFail", "Test@PleaseFail.test", "Fail Description here",
				"Caerphilly", 103, false);
		Location loc2= new Location("TestFail", "Test@PleaseFail.test", "Fail Description here",
				"Caerphilly", 103, false);
		Location loc3= new Location("TestPass", "Test@PleasePass.test", "Pass Description here",
				"Caerphilly", 103, true);
		locationRepository.addLocation(loc1);
		locationRepository.addLocation(loc2);
		locationRepository.addLocation(loc3);
		List<Location> locationsAfter = locationRepository.getAllLocation();
		List<String> locationApprovalListAfter = null;
		List<String> locationFailureListAfter = null;
//		for (int i=0;i<locations.size();i++){
//			location
		for (Location loc :locationsAfter){
			if (loc.isLocationApproved()) {
				locationApprovalListAfter.add(loc.getLocationName());
			} else{
				locationFailureListAfter.add(loc.getLocationName());}
			}
		int locationFailureNumberAfter= locations.size()-locationApprovalListAfter.size(); // ensure number always positive
		assertEquals(2,locationFailureNumber-locationFailureNumberAfter);
		}





//		locationRepository.addLocation(loc); // adds valid landmark to locations table
//		ModelAndView modelAndView = new ModelAndView("redirect:/home");
	}



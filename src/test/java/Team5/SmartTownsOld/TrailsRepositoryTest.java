package Team5.SmartTownsOld;

import Team5.SmartTowns.data.LocationRepository;
import Team5.SmartTowns.data.TrailsRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class TrailsRepositoryTest {
    @Autowired
    TrailsRepository trailsRepo;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void getTrailNameWithIDTest(){
        String trailsID="101";
        String trailName= trailsRepo.getTrailNameWithID(trailsID);
        assertEquals("Caerphilly Castle Trail",trailName);
         trailsID="102";
         trailName= trailsRepo.getTrailNameWithID(trailsID);
        assertEquals("Caerphilly Pub Trail",trailName);
         trailsID="103";
         trailName= trailsRepo.getTrailNameWithID(trailsID);
        assertEquals("Caerphilly Heritage Trail",trailName);
         trailsID="201";
        trailName= trailsRepo.getTrailNameWithID(trailsID);
        assertEquals("Risca Heritage Trail",trailName);
        trailsID="301";
        trailName= trailsRepo.getTrailNameWithID(trailsID);
        assertEquals("Penarth Esplanade Trail",trailName);
    } // test whether function works correctly for all instances




}

//Holds variable data for the trails table
package Team5.SmartTowns.data;

import Team5.SmartTowns.placeswithcoordinates.PlacesCoordinatesRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.File;
import java.util.List;

@Data
@AllArgsConstructor
public class Trail {
    private Long trailsId;
    private String trailName;
    private String trailNumber;
    private String imgPath;


    public Trail(Long trailsId, String trailName, String trailNumber) {
        this.trailsId = trailsId;
        this.trailName = trailName;
        this.trailNumber = trailNumber;
    }

    public Long getTrailsId() {
        return trailsId;
    }

    public String getTrailName() {
        return trailName;
    }

    public String getTrailNumber() {
        return trailNumber;
    }

    public String getTrailLink(){
        String[] split = trailName.split(" ");
        return String.join("-", split);
    }


    public String getImagePath(){
        /* Finds the image in the Path folder, if image is not found assigns default image */
        String imgPath = "images/trails/trail" + trailsId + ".jpg";
        String notFoundPath = "images/trails/trailNotFound.jpg";

        File imgFile = new File("src/main/resources/static/" + imgPath);
        return imgFile.exists() ? imgPath : notFoundPath;
    }

}

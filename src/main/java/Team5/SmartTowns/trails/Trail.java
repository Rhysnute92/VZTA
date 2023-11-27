package Team5.SmartTowns.trails;

import lombok.Data;

import java.util.List;

@Data
public class Trail {
    public static List<Trail> trails = List.of(
            new Trail(1,"Trail1", "This is trail one"),
            new Trail(2,"Trail2", "This is trail two"),
            new Trail(3,"Trail3", "This is trail three"),
            new Trail(4,"Trail4", "This is trail four")
    );
    int id;
    String name;
    String description;
    int nLandmarks;
    int difficulty; //1-5

    public Trail(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}

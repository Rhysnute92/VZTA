package Team5.SmartTowns.towns;

import lombok.Data;

@Data
public class Towns {
    private String name;
    private Integer id;
    private int trailNumber;
    private int trailProgress;

    private String imageTown;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTrailNumber() {
        return trailNumber;
    }

    public void setTrailNumber(int trailNumber) {
        this.trailNumber = trailNumber;
    }

    public int getTrailProgress() {
        return trailProgress;
    }

    public void setTrailProgress(int trailProgress) {
        this.trailProgress = trailProgress;
    }

    public String getImageTown() {
        return imageTown;
    }

    public void setImageTown(String imageTown) {
        this.imageTown = imageTown;
    }

    public Towns(String name, Integer id, int trailNumber, int trailProgress, String imageTown) {
        this.name = name;
        this.id = id;
        this.trailNumber = trailNumber;
        this.trailProgress = trailProgress;
        this.imageTown = imageTown;
    }
}

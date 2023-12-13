package Team5.SmartTowns.Data;

import java.util.List;

public interface TownRepository {
    List<Town> getAllTowns();
    void addTown(Town town);
}

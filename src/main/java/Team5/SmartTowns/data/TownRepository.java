package Team5.SmartTowns.data;

import java.util.List;

public interface TownRepository {
    List<Town> getAllTowns();
    void addTown(Town town);
}

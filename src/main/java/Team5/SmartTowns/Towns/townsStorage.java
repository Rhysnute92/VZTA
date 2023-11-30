package Team5.SmartTowns.Towns;

import java.util.ArrayList;
import java.util.List;

public class townsStorage {
    private List<towns> townList;
    private static townsStorage singelton;

    townsStorage() {
        townList = new ArrayList<>();
        townList.addAll(
          List.of(
                  new towns("Caerphilly",01,3,70),
                  new towns("Risca",02,2,0),
                  new towns("Penarth",03,5,60)


          )

        );

    }





}

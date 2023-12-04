package Team5.SmartTowns.Towns;

import java.util.ArrayList;
import java.util.List;

public class TownStorage {
    private List<Towns> townList;
    private static TownStorage singleton;

    TownStorage() {
        townList = new ArrayList<>();
        townList.addAll(
          List.of(
                  new Towns("Caerphilly",01,3,70,"/images/CaerphillyCastle.jpg"),
                  new Towns("Risca",02,2,34,"/images/RiscaBanner.jpg"),
                  new Towns("Penarth",03,5,0,"/images/PenarthBanner.jpg"),
                  new Towns("Penarth",03,5,50,"/images/PenarthBanner.jpg"),
                  new Towns("Caerphilly",01,3,70,"/images/CaerphillyCastle.jpg"),
                  new Towns("Risca",02,2,90,"/images/RiscaBanner.jpg"),
                  new Towns("Penarth",03,5,100,"/images/PenarthBanner.jpg")



          )

        );

    }
    public static TownStorage getInstance() {
        if (singleton == null) {
            singleton = new TownStorage();

        }
        return singleton;
    }

    public List<Towns> getTownList() {
        return townList;
    }




}

package team5.smartTowns.towns;

import java.util.ArrayList;
import java.util.List;

public class TownStorage {
    private List<Towns> townList;
    private static TownStorage singleton;

    TownStorage() {
        townList = new ArrayList<>();
        townList.addAll(
          List.of(
                  new Towns("Caerphilly",01,3,70,"/images/banners/CaerphillyCastle.jpg"),
                  new Towns("Risca",02,2,34,"/images/banners/RiscaBanner.jpg"),
                  new Towns("Penarth",03,5,0,"/images/banners/PenarthBanner.jpg"),
                  new Towns("Penarth",03,5,50,"/images/banners/PenarthBanner.jpg"),
                  new Towns("Caerphilly",01,3,70,"/images/banners/CaerphillyCastle.jpg"),
                  new Towns("Risca",02,2,90,"/images/banners/RiscaBanner.jpg"),
                  new Towns("Penarth",03,5,100,"/images/banners/PenarthBanner.jpg")



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

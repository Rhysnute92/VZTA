package Team5.SmartTowns.placeswithcoordinates;

public class TownWithTrails {

    private String townName;
    private String townCentreCoordsLat;
    private String townCentreCoordsLong;
    private String townUppermostCoordsLat;
    private String townLowermostCoordsLat;
    private String townLeftmostCoordsLong;
    private String townRightmostCoordsLong;

    public String getTownName() {
        return townName;
    }

    public String getTownCentreCoordsLat() {
        return townCentreCoordsLat;
    }

    public String getTownCentreCoordsLong() {
        return townCentreCoordsLong;
    }

    public String getTownUppermostCoordsLat() {
        return townUppermostCoordsLat;
    }

    public String getTownLowermostCoordsLat() {
        return townLowermostCoordsLat;
    }

    public String getTownLeftmostCoordsLong() {
        return townLeftmostCoordsLong;
    }

    public String getTownRightmostCoordsLong() {
        return townRightmostCoordsLong;
    }


    public TownWithTrails(String townName, String townCentreCoordsLat, String townCentreCoordsLong, String townUppermostCoordsLat, String townLowermostCoordsLat, String townLeftmostCoordsLong, String townRightmostCoordsLong) {
        this.townName = townName;
        this.townCentreCoordsLat = townCentreCoordsLat;
        this.townCentreCoordsLong = townCentreCoordsLong;
        this.townUppermostCoordsLat = townUppermostCoordsLat;
        this.townLowermostCoordsLat = townLowermostCoordsLat;
        this.townLeftmostCoordsLong = townLeftmostCoordsLong;
        this.townRightmostCoordsLong = townRightmostCoordsLong;
    }
}

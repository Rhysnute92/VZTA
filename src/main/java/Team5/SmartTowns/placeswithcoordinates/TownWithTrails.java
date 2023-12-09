package Team5.SmartTowns.placeswithcoordinates;

public class TownWithTrails {

    private String townName;
    private String townCentreCoordsLat;
    private String townCentreCoordsLong;
    private String townLeftmostCoordsLat;
    private String townRightmostCoordsLat;
    private String townUppermostCoordsLong;
    private String townLowermostCoordsLong;

    public String getTownName() {
        return townName;
    }

    public String getTownCentreCoordsLat() {
        return townCentreCoordsLat;
    }

    public String getTownCentreCoordsLong() {
        return townCentreCoordsLong;
    }

    public String getTownLeftmostCoordsLat() {
        return townLeftmostCoordsLat;
    }

    public String getTownRightmostCoordsLat() {
        return townRightmostCoordsLat;
    }

    public String getTownUppermostCoordsLong() {
        return townUppermostCoordsLong;
    }

    public String getTownLowermostCoordsLong() {
        return townLowermostCoordsLong;
    }

    public TownWithTrails(String townName, String townCentreCoordsLat, String townCentreCoordsLong, String townLeftmostCoordsLat, String townRightmostCoordsLat, String townUppermostCoordsLong, String townLowermostCoordsLong) {
        this.townName = townName;
        this.townCentreCoordsLat = townCentreCoordsLat;
        this.townCentreCoordsLong = townCentreCoordsLong;
        this.townLeftmostCoordsLat = townLeftmostCoordsLat;
        this.townRightmostCoordsLat = townRightmostCoordsLat;
        this.townUppermostCoordsLong = townUppermostCoordsLong;
        this.townLowermostCoordsLong = townLowermostCoordsLong;
    }
}

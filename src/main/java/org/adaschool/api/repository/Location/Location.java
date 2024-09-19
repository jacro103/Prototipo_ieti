package main.java.org.adaschool.api.repository.Location;

public class Location {

    private float lat;
    private float lon;
    private String address;

    public Location(float lat, float lon, String address) {
        this.lat = lat;
        this.lon = lon;
        this.address = address;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

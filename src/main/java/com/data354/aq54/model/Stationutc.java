package com.data354.aq54.model;

public class Stationutc {

    private long station_id;
    private String station_name;
    private double latitude;
    private double longitude;
    private String last_transmission_utc;


    public Stationutc(long station_id, String station_name, double latitude, double longitude, String last_transmission_utc) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.last_transmission_utc = last_transmission_utc;
    }

    public Stationutc() {
    }

    public String getLast_transmission_utc() {
        return last_transmission_utc;
    }

    public void setLast_transmission_utc(String last_transmission_utc) {
        this.last_transmission_utc = last_transmission_utc;
    }

    public long getStationId() {
        return station_id;
    }

    public String getStationName() {
        return station_name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setStation_id(long station_id) {
        this.station_id = station_id;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Stationutc{" +
                "station_id=" + station_id +
                ", station_name='" + station_name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", last_transmission_utc='" + last_transmission_utc + '\'' +
                '}';
    }
}


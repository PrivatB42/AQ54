package com.data354.aq54.model;

public class Station {
    private String project_name;
    private long station_id;
    private String station_name;
    private double latitude;
    private double longitude;

    public Station(String project_name, long station_id, String station_name, double latitude, double longitude) {
        this.project_name = project_name;
        this.station_id = station_id;
        this.station_name = station_name;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public Station() {
    }

    public String getProjectName() {
        return project_name;
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

    public void setProject_name(String project_name) {
        this.project_name = project_name;
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
        return "Station{" +
                "project_name='" + project_name + '\'' +
                ", station_id=" + station_id +
                ", station_name='" + station_name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}


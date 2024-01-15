package com.data354.aq54.model;

import java.util.List;

public class SessionInfo {
    private String station;
    private String description;
    private long sessiond_id;
    private List<IntegratedSensor> integrated_sensors;

    public SessionInfo(String station, String description, long sessiond_id, List<IntegratedSensor> integrated_sensors) {
        this.station = station;
        this.description = description;
        this.sessiond_id = sessiond_id;
        this.integrated_sensors = integrated_sensors;
    }

    public SessionInfo() {
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSessiond_id() {
        return sessiond_id;
    }

    public void setSessiond_id(long sessiond_id) {
        this.sessiond_id = sessiond_id;
    }

    public List<IntegratedSensor> getIntegrated_sensors() {
        return integrated_sensors;
    }

    public void setIntegrated_sensors(List<IntegratedSensor> integrated_sensors) {
        this.integrated_sensors = integrated_sensors;
    }

    @Override
    public String toString() {
        return "SessionInfo{" +
                "station='" + station + '\'' +
                ", description='" + description + '\'' +
                ", sessiond_id=" + sessiond_id +
                ", integrated_sensors=" + integrated_sensors +
                '}';
    }

    public static class IntegratedSensor {
        private String type;
        private String unit;

        public IntegratedSensor(String type, String unit) {
            this.type = type;
            this.unit = unit;
        }

        public IntegratedSensor() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        @Override
        public String toString() {
            return "IntegratedSensor{" +
                    "type='" + type + '\'' +
                    ", unit='" + unit + '\'' +
                    '}';
        }
    }
}


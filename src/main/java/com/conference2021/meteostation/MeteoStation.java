package com.conference2021.meteostation;

public class MeteoStation {
    private long id; // uniq id
    private double temperature;
    private double humidity;
    private double pressure;

    public MeteoStation() {
    }

    public MeteoStation(long id) {
        this.id = id;
        temperature = 23.2;
        humidity = 86;
        pressure = 747;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public long getId() {
        return id;
    }
}

package com.conference2021.meteostation;

import org.springframework.test.util.ReflectionTestUtils;

public class MeteoSationBuilder {
    private MeteoStation model;

    public MeteoSationBuilder() {
        this.model = new MeteoStation();
    }

    public MeteoSationBuilder id(Long id) {
        ReflectionTestUtils.setField(model, "id", id);
        return this;
    }

    public MeteoSationBuilder temperature(double temperature) {
        ReflectionTestUtils.setField(model, "temperature", temperature);
        return this;
    }

    public MeteoSationBuilder humidity(double humidity) {
        ReflectionTestUtils.setField(model, "humidity", humidity);
        return this;
    }

    public MeteoSationBuilder pressure(double pressure) {
        ReflectionTestUtils.setField(model, "pressure", pressure);
        return this;
    }

    public MeteoStation build() {
        return model;
    }
}

package com.app.entities;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model = "jaguar";

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

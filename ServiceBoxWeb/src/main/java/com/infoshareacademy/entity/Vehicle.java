package com.infoshareacademy.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Vehicle extends Entity {
    private String make;
    private String model;
    private String plateNumber;
    private double engineCapacity;
    private int productionYear;
    private int mileage;
    private String vin;

    // foreign key (many-to-one)
    private int clientId;

    public Vehicle() {
    }

    public Vehicle(String make, String model, String plateNumber, double engineCapacity, int productionYear) {
        this.make = make;
        this.model = model;
        this.plateNumber = plateNumber;
        this.engineCapacity = engineCapacity;
        this.productionYear = productionYear;
    }
}

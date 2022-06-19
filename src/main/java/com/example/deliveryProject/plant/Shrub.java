package com.example.deliveryProject.plant;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "plant")
public class Shrub extends Plant {
    private int heightCm; //any reasonable unit of measurement is fine
    private int widthCm;

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }
}
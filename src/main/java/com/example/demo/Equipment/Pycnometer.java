package com.example.demo.Equipment;

public class Pycnometer extends Equipment {
    private double accuracy;
    private String material;

    public Pycnometer() {

    }

    public Pycnometer(double price, TypeOfEquipment height, EnumProducer producer, double accuracy) {
        super(price, height, producer);
        this.accuracy = accuracy;
    }

    public final double getAccuracy() {
        return accuracy;
    }

    public final void setAccuracy(final double accuracy) {
        this.accuracy = accuracy;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }


}


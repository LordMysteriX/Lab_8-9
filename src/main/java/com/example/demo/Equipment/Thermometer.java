package com.example.demo.Equipment;

public class Thermometer extends Equipment {
    private String typeOfThermometer;


    public Thermometer() {

    }

    public Thermometer(double price, TypeOfEquipment height, EnumProducer producer, String typeOfThermometer) {
        super(price, height, producer);
        this.typeOfThermometer = typeOfThermometer;
    }

    public final String getTypeOfThermometer() {
        return typeOfThermometer;
    }

    public final void setTypeOfThermometer(final String typeOfThermometer) {
        this.typeOfThermometer = typeOfThermometer;
    }

}

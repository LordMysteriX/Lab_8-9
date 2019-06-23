package com.example.demo.Equipment;

public class Calorimeter extends Equipment {
    private int volume;

    public Calorimeter() {

    }

    public Calorimeter(double price, TypeOfEquipment height, EnumProducer producer, int volume) {
        super(price, height, producer);
        this.volume = volume;
    }

    public final int getVolume() {
        return volume;
    }

    public final void setVolume(final int volume) {
        this.volume = volume;
    }
}

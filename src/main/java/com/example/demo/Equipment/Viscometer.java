package com.example.demo.Equipment;

public class Viscometer extends Equipment {
    private int mistake;

    public Viscometer() {

    }

    public Viscometer(double price, TypeOfEquipment height, EnumProducer producer, int mistake) {
        super(price, height, producer);
        this.mistake = mistake;
    }

    public final int getMistake() {
        return mistake;
    }

    public final void setMistake(final int mistake) {
        this.mistake = mistake;
    }
}

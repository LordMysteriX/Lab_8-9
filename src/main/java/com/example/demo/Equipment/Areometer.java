package com.example.demo.Equipment;

import javax.persistence.*;

@Entity
@Inheritance
public class Areometer extends Equipment {
    private int lenght;

    public Areometer() {

    }

    public Areometer(double price, TypeOfEquipment height, EnumProducer producer, int lenght) {
        super(price, height, producer);
        this.lenght = lenght;
    }

    public final int getLenght() {
        return lenght;
    }

    public final void setLenght(final int lenght) {
        this.lenght = lenght;
    }
}


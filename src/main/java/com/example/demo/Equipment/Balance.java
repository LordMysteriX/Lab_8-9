package com.example.demo.Equipment;

public class Balance extends Equipment {
    private int maxWeight;

    public Balance() {

    }

    public Balance(double price, TypeOfEquipment height, EnumProducer producer, int maxWeight) {
        super(price, height, producer);
        this.maxWeight = maxWeight;
    }

    public int getmaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}



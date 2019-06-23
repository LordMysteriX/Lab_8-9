package com.example.demo.Equipment;

import javax.persistence.*;

@Entity
public class Equipment  {

    private double price;

    @Enumerated(EnumType.STRING)
    private TypeOfEquipment height;

    @Enumerated(EnumType.STRING)
    private EnumProducer producer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer idObj) {
        this.id = idObj;
    }

    @Override
    public final String toString() {
        return "Items: Price = " + price
                + ", height = " + height
                + ", Producer = " + producer;
    }

    public Equipment() {

    }

    public Equipment(final double price, final TypeOfEquipment height,
                     final EnumProducer producer) {
        this.price = price;
        this.height = height;
        this.producer = producer;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public final TypeOfEquipment getHeight() {
        return height;
    }

    public final void setHeight(final TypeOfEquipment height) {
        this.height = height;
    }

    public final EnumProducer getProducer() {
        return producer;
    }

    public final void setProducer(final EnumProducer producer) {
        this.producer = producer;
    }


    public String getHeaders(){
        return "price: " + price + ", "
                + "height: " + height + ", "
                +"producer: " + producer + ", ";

    }

    public String toCSV(){
        return "price: " + price + ", "
                + "height: " + height + ", "
                +"producer: " + producer + ", ";
    }
}

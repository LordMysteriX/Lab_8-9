package com.example.demo.EquipmentManager;

import com.example.demo.Equipment.EnumProducer;
import com.example.demo.Equipment.Equipment;
import com.example.demo.Equipment.TypeOfEquipment;

import java.util.List;

public interface EquipmentManager {

    List<Equipment> findByProducer(List<Equipment> devices, final EnumProducer producer);

    List<Equipment> findByHeight(List<Equipment> devices, final TypeOfEquipment height);

    List<Equipment> sortByPriceIncrease(List<Equipment> devices);

    List<Equipment> sortByPriceDecrease(List<Equipment> devices);

}

package com.example.demo.repositories;

import com.example.demo.Equipment.Equipment;
import org.springframework.data.repository.CrudRepository;

public interface EquipmentRepository<T extends Equipment> extends
        CrudRepository<T, Integer> {
}
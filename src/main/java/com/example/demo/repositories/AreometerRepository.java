package com.example.demo.repositories;

import com.example.demo.Equipment.Areometer;

import javax.transaction.Transactional;

@Transactional
public interface AreometerRepository extends EquipmentRepository<Areometer> {

}


package com.example.demo;

import com.example.demo.Equipment.Areometer;
import com.example.demo.Equipment.EnumProducer;
import com.example.demo.Equipment.TypeOfEquipment;
import com.example.demo.repositories.AreometerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(final AreometerRepository areometerRepository) {

        return (args) -> {
            areometerRepository.save(new Areometer(40, TypeOfEquipment.LOW,
                    EnumProducer.TOSHIBA, 10));

            areometerRepository.findAll().forEach(System.out::println);
        };
    }
}
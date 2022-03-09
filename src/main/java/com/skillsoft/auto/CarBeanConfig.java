package com.skillsoft.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CarBeanConfig {

    @Bean
    public Car2 carBean() {

        Car2 car = new Car2();

        ArrayList<String> notes = new ArrayList<>();
        notes.add("Internal combustion engine");
        notes.add("3-year service included");

        car.setType("Sedan");
        car.setModel("BMW 740 2021");
        car.setPrice(88000);
        car.setCombinedFuelEconomy(25);
        car.setNotes(notes);

        return car;
    }

    @Bean(name = "engineBMW")
    public Engine1 engine() {

        return new Engine1(335, 5500, 3.0f,
                "I-6", "premium unleaded");
    }

    @Bean(name = "gearboxBMW")
    public Gearbox_v1 gearbox() {

        Gearbox_v1 myGearbox = new Gearbox_v1();
        myGearbox.setType("Shiftable Automatic");
        myGearbox.setNumGears(8);

        return myGearbox;
    }

    @Bean(name = "seatOptionOne")
    public Seats_v1 seatOne(){

        Seats_v1 seatsConfig = new Seats_v1();
        seatsConfig.setType("Bucket Leather");
        seatsConfig.setColor("Black");
        seatsConfig.setHeated(true);

        return seatsConfig;
    }

    @Bean(name = "seatOptionTwo")
    public Seats_v1 seatTwo(){

        Seats_v1 seatsConfig = new Seats_v1();
        seatsConfig.setType("Bucket Vinyl");
        seatsConfig.setColor("Beige");
        seatsConfig.setHeated(true);

        return seatsConfig;
    }

    @Bean(name = "seatOptionThree")
    public Seats_v1 seatThree(){

        Seats_v1 seatsConfig = new Seats_v1();
        seatsConfig.setType("Bucket Leather");
        seatsConfig.setColor("Brown");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

    @Bean(name = "seatOptionFour")
    public Seats_v1 seatFour(){

        Seats_v1 seatsConfig = new Seats_v1();
        seatsConfig.setType("Bucket Fabric");
        seatsConfig.setColor("Black");
        seatsConfig.setHeated(false);

        return seatsConfig;
    }

}

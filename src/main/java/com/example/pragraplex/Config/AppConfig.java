package com.example.pragraplex.Config;

import com.example.pragraplex.entity.Car;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
//    @Profile("dev")
//    @Bean
//    public Car car (){
//        return Car.builder().carName("aaudi").build();
//    }
//    @Profile("prod")
//    @Bean
//    public Car car2 (){
//
//        return Car.builder().carName("bmw").build();
//    }

    @Bean
    public Car car(@Value("${car.name}") String name){
        return Car.builder().carName(name).build();
    }

}

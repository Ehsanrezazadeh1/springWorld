package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {


    @Bean(name = "pride")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Pride gaz suz");
        return veh;
    }


    @Bean(value = "RD")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("RD bedoone tormoz");
        return veh;
    }

    @Bean("glx")
    @Primary // hey spring context! if I don't declare name to my beans, give to load this Bean! tashakor!
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("GLX Iran 68");
        return veh;
    }
}

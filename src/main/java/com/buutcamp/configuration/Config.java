package com.buutcamp.configuration;


import com.buutcamp.countries.Finland;
import com.buutcamp.countries.Sweden;
import com.buutcamp.inputhandle.HandleInput;
import com.buutcamp.interfaces.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.buutcamp.lecture2exercise"})
public class Config {

    @Bean
    public HandleInput getHandleInput() { return new HandleInput(); }

    @Bean
    public Country getFinland() {
        Country country = new Finland();
        country.setName("Finland");
        country.setPresident("Sauli");
        country.setPopulation("5+milj");
        return country;
    }

    @Bean
    public Country getSweden() {
        Country country = new Sweden();
        country.setName("Sweden");
        country.setPresident("Kaarle XVI Kustaa");
        country.setPopulation("9 967 274");
        return country;
    }

}

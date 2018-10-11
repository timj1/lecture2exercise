package com.buutcamp.configuration;


import com.buutcamp.countries.Finland;
import com.buutcamp.countries.Sweden;
import com.buutcamp.interfaces.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.buutcamp.lecture2exercise"})
public class Config {

    @Bean
    public Country getFinland() { return new Finland(); }

    @Bean
    public Country getSweden() { return new Sweden(); }

}

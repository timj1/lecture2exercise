package com.buutcamp.main;

import com.buutcamp.configuration.Config;
import com.buutcamp.countries.Finland;
import com.buutcamp.countries.Sweden;
import com.buutcamp.inputhandle.HandleInput;
import com.buutcamp.interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class RunApp {

    public RunApp(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Country finland = applicationContext.getBean(Finland.class);
        Country sweden = applicationContext.getBean(Sweden.class);

        HandleInput handleInput = new HandleInput();
        while (true) {
            String userInput = handleInput.getUserInput().toLowerCase();
            String method = userInput.substring(0,3);
            int tmp = userInput.indexOf(" ");
            String tmpString = userInput.substring(tmp+1);
            tmp = tmpString.indexOf(" ");
            String country = tmpString.substring(0,tmp);
            System.out.println(method);
            System.out.println(country);

            if (method.equals("get")) {
                System.out.println("Country: " + finland.getName());
            }

            if (country.equals("get finland")) {
                System.out.println("Country: " + finland.getName());
                System.out.println("President: " + finland.getPresident());
                System.out.println("Population: " + finland.getPopulation());
            }
            if (userInput.equals("get sweden")) {
                System.out.println("Country: " + sweden.getName());
                System.out.println("President: " + sweden.getPresident());
                System.out.println("Population: " + sweden.getPopulation());
            }


            if (userInput.equals("exit")) {
                return;
            }
        }
    }
}

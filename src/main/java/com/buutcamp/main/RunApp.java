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

        //Country finland = applicationContext.getBean(Finland.class);
        //Country sweden = applicationContext.getBean(Sweden.class);

        HandleInput handleInput = applicationContext.getBean("getHandleInput", HandleInput.class);
        while (true) {
            String userInput = handleInput.getUserInput().toLowerCase().trim();

            String [] separateStrings = userInput.split(" ");
            System.out.println(separateStrings);
            Country country;

            if (userInput.equals("exit")) {
                return;
            } else if (separateStrings[0].equals("get")) {

                if (handleInput.isValidCountry((separateStrings[1]))){
                    country = applicationContext.getBean(separateStrings[1], Country.class);
                    System.out.println("Country name: " + country.getName());
                    System.out.println("Country president: " + country.getPresident());
                    System.out.println("Population count: " + country.getPopulation());
                }

            } else  if (separateStrings[0].equals("set")){
                if (handleInput.isValidCountry((separateStrings[1]))) {
                    //"set sweden president=someNameHere"
                    String[] action = separateStrings[2].split("=");
                    if (action[0].equals("president")) {
                        country = applicationContext.getBean(separateStrings[1], Country.class);
                        country.setPresident(action[1]);
                    } else if (action[0].equals("country")) {
                        country = applicationContext.getBean(separateStrings[1], Country.class);
                        country.setName(action[1]);
                    }
                    else if (action[0].equals("population")) {
                        country = applicationContext.getBean(separateStrings[1], Country.class);
                        country.setPopulation(action[1]);
                    }
                }

            }



           /* if (method.equals("get")) {
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
            }*/
        }
    }
}

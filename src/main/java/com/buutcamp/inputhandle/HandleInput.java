package com.buutcamp.inputhandle;

import com.buutcamp.configuration.Config;
import com.buutcamp.interfaces.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HandleInput {

    public String getUserInput() {
        System.out.println("User input:");

        String userInput = "";
        try {
            BufferedReader bufferedReader
                    = new BufferedReader(new InputStreamReader(System.in));
            userInput = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return userInput;
    }

    public boolean isValidCountry(String inputCountry) {
        //load application context
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(Config.class);

        //get bean names
        //String[] beanNames = ctx.getBeanDefinitionNames();
        String[] beanNames = ctx.getBeanNamesForType(Country.class);

        System.out.println(beanNames[0]);
        //System.out.println(beanNames[0]);

        //Check if inputCountry exists in the bean
        //Names array
        if (Arrays.asList(beanNames).contains(inputCountry)) {
            ctx.close();
            return true;
        } else {
            ctx.close();
            return false;
        }

    }
}

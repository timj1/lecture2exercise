package com.buutcamp.main;

import com.buutcamp.inputhandle.HandleInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunApp {

    public RunApp(){
        HandleInput handleInput = new HandleInput();
        while (true) {
            String userInput = handleInput.getUserInput();

            System.out.println(userInput);

            if (userInput.equals("exit")) {
                return;
            }
        }
    }
}

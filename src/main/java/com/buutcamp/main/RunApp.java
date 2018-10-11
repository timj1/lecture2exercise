package com.buutcamp.main;

import com.buutcamp.inputhandle.HandleInput;


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

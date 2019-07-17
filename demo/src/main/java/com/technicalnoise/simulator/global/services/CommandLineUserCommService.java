package com.technicalnoise.simulator.global.services;

public class CommandLineUserCommService implements UserCommService {

    @Override
    public String getUserInput(String message) {
        System.out.println(message);
        return System.console().readLine();
    }
    
}
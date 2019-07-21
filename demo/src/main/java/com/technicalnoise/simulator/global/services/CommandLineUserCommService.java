package com.technicalnoise.simulator.global.services;

public class CommandLineUserCommService implements UserCommService {

    @Override
    public String getUserInput(String message) {
        System.out.println(message);
        return System.console().readLine();
    }

    @Override
    public void provideUserFeedback(String message) {
        System.out.println(message);
    }
    
}
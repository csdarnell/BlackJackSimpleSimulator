package com.technicalnoise.simulator.global.services;

public interface UserCommService {
    /**
     * Get the user's input based on the provided message.
     * @param message
     * @return String The user's response
     */
    String getUserInput(String message);
}
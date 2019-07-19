package com.technicalnoise.simulator.casino.card;

public class OutOfCardsException extends Exception { 
    private static final long serialVersionUID = 8104212181974215283L;

    public OutOfCardsException(String errorMessage) {
        super(errorMessage);
    }
}
package com.technicalnoise.simulator.global;

/**
 * A generic representation of any person that participates in a game
 */
public interface Participant {
    public String getName();

    public void performTurn();
}
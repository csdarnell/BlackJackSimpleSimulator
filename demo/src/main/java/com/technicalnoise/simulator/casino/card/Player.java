package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

/**
 * 
 */
public abstract class Player extends CardParticipant {

    public Player(String name, Seat seat, ArrayList<OtherParticipantSeat> participantSeats) {
        super(name, seat, participantSeats);
    }

    public void performTurn() {

    }
}
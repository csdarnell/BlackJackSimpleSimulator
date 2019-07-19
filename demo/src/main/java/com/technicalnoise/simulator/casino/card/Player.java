package com.technicalnoise.simulator.casino.card;

import java.util.List;

/**
 * 
 */
public abstract class Player extends CardParticipant {

    public Player(String name, Seat seat, List<OtherParticipantSeat> participantSeats) {
        super(name, seat, participantSeats);
        this.playerType = "Player";
    }

    public void performTurn() {

    }
}
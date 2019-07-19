package com.technicalnoise.simulator.casino.card;

import java.util.List;

/**
 * 
 */
public abstract class CardPlayer extends CardParticipant {

    public CardPlayer(String name, Seat seat, List<OtherParticipantSeat> participantSeats) {
        super(name, seat, participantSeats);
        this.participantType = "Player";
    }

    public void performTurn() {

    }
}
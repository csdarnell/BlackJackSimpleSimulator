package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

public abstract class Dealer extends CardParticipant {

    private TableCardManagement cardManagement;

    public Dealer(String name, Seat seat, ArrayList<OtherParticipantSeat> participantSeats, TableCardManagement cardManagement) {
        super(name, seat, participantSeats);
        this.playerType = "Dealer";
        this.cardManagement = cardManagement;
    }


    public void performTurn() {

    }
}
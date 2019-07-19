package com.technicalnoise.simulator.casino.card;

import java.util.List;

public abstract class Dealer extends CardParticipant {

    protected TableCardManagement cardManagement;
    protected TableStatusManagement tableStatusManagement;

    public Dealer(String name, Seat seat, List<OtherParticipantSeat> participantSeats, TableCardManagement cardManagement, TableStatusManagement tableStatusManagement) {
        super(name, seat, participantSeats);
        this.playerType = "Dealer";
        this.cardManagement = cardManagement;
        this.tableStatusManagement = tableStatusManagement;
    }

    public void performTurn() {

    }
}
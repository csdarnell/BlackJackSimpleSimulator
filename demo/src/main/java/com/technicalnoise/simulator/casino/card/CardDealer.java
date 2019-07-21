package com.technicalnoise.simulator.casino.card;

import java.util.List;

public abstract class CardDealer extends CardParticipant {

    protected TableCardManagement cardManagement;
    protected TableStatusManagement tableStatusManagement;

    public CardDealer(String name, CardSeat seat, List<OtherParticipantSeat> participantSeats, TableCardManagement cardManagement, TableStatusManagement tableStatusManagement) {
        super(name, seat, participantSeats);
        this.participantType = "Dealer";
        this.cardManagement = cardManagement;
        this.tableStatusManagement = tableStatusManagement;
    }

    public void performTurn() {

    }
}
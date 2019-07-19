package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;

import com.technicalnoise.simulator.casino.card.*;
import com.technicalnoise.simulator.global.Participant;

public class BlackJackDealer extends CardDealer implements BlackjackParticipant {

    public BlackJackDealer(String name, Seat seat, List<OtherParticipantSeat> participantSeats,
            TableCardManagement cardManagement, TableStatusManagement tableStatusManagement) {
        super(name, seat, participantSeats, cardManagement, tableStatusManagement);
    }

    @Override
    public List<Card> viewCards(Participant requestingParticipant) {
        return null;
    }

    @Override
    public void DecideHitOrStand() {

    }

    @Override
    public void Hit() {

    }

    @Override
    public void Stand() {

    }

}
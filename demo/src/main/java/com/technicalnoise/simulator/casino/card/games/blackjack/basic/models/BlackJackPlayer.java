package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;
import com.technicalnoise.simulator.casino.card.*;
import com.technicalnoise.simulator.global.Participant;

public class BlackjackPlayer extends CardPlayer implements BlackjackParticipant {

    public BlackjackPlayer(String name, Seat seat, List<OtherParticipantSeat> participantSeats) {
        super(name, seat, participantSeats);
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
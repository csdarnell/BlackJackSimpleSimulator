package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;
import com.technicalnoise.simulator.casino.card.*;

public class BlackjackParticipant extends CardParticipant {
 
    public BlackjackParticipant(String participantName, PlayerSeat seat, List<OtherParticipantSeat> participantSeats) {
        super(participantName, seat, participantSeats);
    }

    void DecideHitOrStand() {

    }
    void Hit() {}
    void Stand() {}
}
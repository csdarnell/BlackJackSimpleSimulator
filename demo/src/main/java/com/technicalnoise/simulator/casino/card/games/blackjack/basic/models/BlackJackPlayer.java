package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;
import com.technicalnoise.simulator.casino.card.*;

public class BlackjackPlayer extends BlackjackParticipant {
    public BlackjackPlayer(String participantName, PlayerSeat seat, List<OtherParticipantSeat> participantSeats) {
        super(participantName, seat, participantSeats);
    }

}
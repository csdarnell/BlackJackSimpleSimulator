package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;

import com.technicalnoise.simulator.casino.card.*;

public class BlackJackDealer implements BlackjackParticipant, Dealer {
    public BlackJackDealer(String participantName, PlayerSeat seat, List<OtherParticipantSeat> participantSeats) {
        super(participantName, seat, participantSeats);
    }

}
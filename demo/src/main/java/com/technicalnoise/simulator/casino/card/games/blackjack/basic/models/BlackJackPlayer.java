package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

import java.util.List;
import com.technicalnoise.simulator.casino.card.*;
import com.technicalnoise.simulator.global.Participant;
import com.technicalnoise.simulator.global.services.UserCommService;

public class BlackjackPlayer extends CardPlayer implements BlackjackParticipant {

    private UserCommService commService;

    public BlackjackPlayer(String name, CardSeat seat, List<OtherParticipantSeat> participantSeats, UserCommService commService) {
        super(name, seat, participantSeats);
        this.commService = commService;
    }

    @Override
    public List<Card> viewCards(Participant requestingParticipant) {
        return null;
    }

    @Override
    public void DecideHitOrStand() {
        Boolean validResponse = true;
        do{
            String response = commService.getUserInput("Hit or Stand? Press [H] or [S] and press the [Enter] key.");
            switch(response) {
                case "H":
                    Hit();
                    break;
                case "S":
                    Stand();
                    break;
                default:
                    validResponse = false;
                    break;
            }
        } while (!validResponse);
    }

    @Override
    public void Hit() {

    }

    @Override
    public void Stand() {

    }

}
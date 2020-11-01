package com.technicalnoise.simulator.casino.card;

import java.util.List;

import com.technicalnoise.simulator.global.Participant;

public interface PlayerSeat {
    /**
     * Allow the Player to view their cards
     * @param requestingParticipant
     */
    List<Card> viewCards(Participant requestingParticipant);

    /**
     * set the Player for this seat
     * @param Participant The player that is sitting in the seat
     */
    void setPlayer(Participant player);
}
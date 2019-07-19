package com.technicalnoise.simulator.casino.card.games.blackjack.basic.models;

public interface BlackjackParticipant {
 
    /**
     * The Participant must decide whether it will Hit or Stand
     */
    void DecideHitOrStand();
    /**
     * The action to take if the Participant Hits
     */
    void Hit();
    /**
     * The action to take if the Participant Stands
     */
    void Stand();
}
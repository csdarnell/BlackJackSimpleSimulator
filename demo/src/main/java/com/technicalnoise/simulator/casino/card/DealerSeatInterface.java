package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

/**
 * Define the way that a Dealer can interface with a Seat;  Primarily used for Card management
 */
public interface DealerSeatInterface {
    
    /**
     * Provide a new Card to the Seat
     * @param card
     */
    void addCard(Card card);

    /**
     * Have the Seat return all cards to the Table
     * @return all Cards held by the Seat
     */
    ArrayList<Card> returnCards();


}
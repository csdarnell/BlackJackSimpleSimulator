package com.technicalnoise.simulator.casino.card.services;

import com.technicalnoise.simulator.casino.card.Card;

/**
 * A Card Viewing Serivce is responsible for figuring out how to present cards for other Table Seats to see
 */
public interface CardViewingService {
    /**
     * Initiate a Card showing action; prepares the presentation output for cards to be listed
     * @param {string} message 
     */
    void initiateCardShowing(String message);
    /**
     * Present a card to the presentation output
     * @param card
     */
    void showCard(Card card);
    /**
     * Finish the Card showing action;
     * @param message
     */
    void endCardShowing(String message);
}
package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

/**
 * Table Card Management provides for managing the Cards on the Table, including
 * the concept of a Discard deck
 */
public interface TableCardManagement {

    /**
     * Combine the Discard cards into the deck and shuffle
     */
    void shuffleCardDeck();

    /**
     * Get the next card from the Deck
     */
    void getNextCard();

    /**
     * Allow a Dealer to provide cards back to the Table, sending them to a Discard pile
     * @param discardedCards
     */
    void addCardsToDiscard(ArrayList<Card> discardedCards);

    /**
     * Informational:  How many cards have been sent to the Discard pile
     */
    int getDiscardCardCount();

    /**
     * Is the Deck empty?
     */
    boolean isDeckEmpty();
}
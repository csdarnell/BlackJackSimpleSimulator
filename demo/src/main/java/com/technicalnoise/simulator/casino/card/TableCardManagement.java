package com.technicalnoise.simulator.casino.card;

import java.util.List;

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
     * @return Card The next card off the top of the deck
     * @throws OutOfCardsException When the deck is out of Cards
     */
    Card getNextCard() throws OutOfCardsException;

    /**
     * Allow a Dealer to provide cards back to the Table, sending them to a Discard pile
     * @param discardedCards
     */
    void addCardsToDiscard(List<Card> discardedCards);

    /**
     * Are there any cards in the discard pile?
     */
    boolean hasDiscardedCards();

    /**
     * Is the Deck empty?
     */
    boolean isDeckEmpty();
}
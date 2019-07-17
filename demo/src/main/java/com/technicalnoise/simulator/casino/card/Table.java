package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

import com.technicalnoise.simulator.casino.card.TableCardManagement;

/**
 * A generic representation of a card game table and is generally responsible for managing the game; primarily consisting of the Dealer, Seats, for players, and a card Deck.
 */
public abstract class Table implements TableCardManagement {
    // private Dealer dealer;
    private ArrayList<Seat> seats;

    // TODO:  Manage the Deck as a QUEUE!!!  Is there a Queue in this language????
    private ArrayList<Card> deck;

    private boolean gameOver = false;
    
    


    /**
     * @return ArrayList<Card> return the deck
     */
    public ArrayList<Card> getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * @return ArrayList<Seat> return the seats
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    // /**
    //  * @return Dealer return the dealer
    //  */
    // public Dealer getDealer() {
    //     return dealer;
    // }

    // /**
    //  * @param dealer the dealer to set
    //  */
    // public void setDealer(Dealer dealer) {
    //     this.dealer = dealer;
    // }

    /**
     * @return boolean return the gameOver
     */
    public boolean isGameOver() {
        return gameOver;
    }

}
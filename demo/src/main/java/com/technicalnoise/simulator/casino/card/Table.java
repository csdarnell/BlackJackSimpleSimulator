package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.technicalnoise.simulator.casino.card.TableCardManagement;

/**
 * A generic representation of a card game table and is generally responsible for managing the game; primarily consisting of the Dealer, Seats, for players, and a card Deck.
 */
public abstract class Table implements TableCardManagement {
    // private Dealer dealer;
    private ArrayList<OtherParticipantSeat> seats;

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
    public ArrayList<OtherParticipantSeat> getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(ArrayList<OtherParticipantSeat> seats) {
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

    // TODO:  Whenever a card movement action occurs, refesh the table


    /**
     * Display the visible contents of the table
     */
    public void showTable() {
        System.out.println("--- Table Contents ----------");
        seats.forEach((s) -> {
            System.out.println("------ Participant -------");
            System.out.println(String.format(Locale.US, "Player Name: {0}", s.getParticipantName()));
            System.out.println(String.format(Locale.US, "Player Type: ", s.getParticipantType()));
            System.out.println("--------- Hand ----");
            List<Card> participantCards = s.viewCards(null);
            for (Card c : participantCards) {
                System.out.print(String.format("|{0} {1}|", c.getFace(), c.getClass()));
            }
            
            System.out.println("");
        });

    }
}
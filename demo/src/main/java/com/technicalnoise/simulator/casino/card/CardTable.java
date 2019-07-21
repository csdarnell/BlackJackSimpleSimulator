package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import com.technicalnoise.simulator.casino.card.TableCardManagement;

/**
 * A generic representation of a card game table and is generally responsible for managing the game; primarily consisting of the Dealer, Seats, for players, and a card Deck.
 */
public abstract class CardTable implements TableCardManagement {
    // private Dealer dealer;
    private ArrayList<OtherParticipantSeat> seats;

    // TODO:  Manage the Deck as a QUEUE???  Maybe;  Is there a Queue in this language????
    private ArrayList<Card> deck = new ArrayList<Card>();
    private ArrayList<Card> discard = new ArrayList<Card>();

    private boolean gameOver = false;
    
    public CardTable() {
        createDeck();
        shuffleCardDeck();
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

    /**
    * Shuffle the deck using a Random generator
    */
    public void shuffleCardDeck() 
    { 
        // If any cards in the discard pile, move them to the deck, first
        discard.forEach((c) -> deck.add(c));
        discard.clear();

        Random rand = new Random(); 
        for (int slot1 = 0; slot1 < deck.size(); slot1++) 
        { 
            int slot2 = slot1 + rand.nextInt(deck.size() - slot1); 
            Card card = deck.get(slot2); 
            deck.set(slot2, deck.get(slot1)); 
            deck.set(slot1, card); 
        } 
    } 

    /**
     * Get the next card from the Deck
     * 
     * @return Card The next card from the top of the deck
     * @throws OutOfCardsException When there are no cards left in the deck
     */
    public Card getNextCard() throws OutOfCardsException {
        if (deck.size() == 0) {
            throw new OutOfCardsException("There are no cards left in the deck.");
        }
        return deck.remove(deck.size() - 1);
    }

    /**
     * Allow a Dealer to provide cards back to the Table, sending them to a Discard pile
     * @param discardedCards
     */
    public void addCardsToDiscard(List<Card> discardedCards) {
        for(Card card : discardedCards) {
            discard.add(card);
        }
    }

    /**
     * Are there any cards in the discard pile?
     */
    public boolean hasDiscardedCards() {
        return discard.size() > 0;
    }

    /**
     * Is the Deck empty?
     */
    public boolean isDeckEmpty() {
        return deck.size() == 0;
    }


    private void createDeck() {
        deck.clear();
        buildSuitCards("Heart").forEach((c) -> deck.add(c));
        buildSuitCards("Diamond").forEach((c) -> deck.add(c));
        buildSuitCards("Club").forEach((c) -> deck.add(c));
        buildSuitCards("Spade").forEach((c) -> deck.add(c));
    }

    private ArrayList<Card> buildSuitCards(String suit) {
        ArrayList<Card> cards = new ArrayList<Card>();
        for(Integer i = 2; i <= 10; i++) {
            cards.add(new Card(suit, i.toString(), i));
        }
        cards.add(new Card(suit, "J", 10));
        cards.add(new Card(suit, "Q", 10));
        cards.add(new Card(suit, "K", 10));
        cards.add(new Card(suit, "A", 11));

        return cards;
    }
}

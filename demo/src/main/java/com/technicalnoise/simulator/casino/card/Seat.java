package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.technicalnoise.simulator.global.*;
import com.technicalnoise.simulator.casino.card.services.*;

/**
 * A Seat represents the "interface" between a Participant and the Table
 */
public abstract class Seat implements DealerSeatInterface, OtherParticipantSeat {
    Table gameTable;
    Participant participant;
    ArrayList<Card> visibleCards = new ArrayList<Card>();
    ArrayList<Card> hiddenCards = new ArrayList<Card>();;
    
    public Seat(Table table, Participant player) {
        this.gameTable = table;
        this.participant = player;
    }
    
    public void addCard(Card card) {
        if (visibleCards.isEmpty()) {
            visibleCards.add(card);
        } else {
            hiddenCards.add(card);
        }
        
    }

    public List<Card> returnCards() {
        ArrayList<Card> returnedCards = new ArrayList<Card>();
        visibleCards.forEach((c) -> returnedCards.add(c));
        visibleCards.clear();
        hiddenCards.forEach((c) -> returnedCards.add(c));
        hiddenCards.clear();
        return Collections.unmodifiableList(returnedCards);
    }

    public void getHandValue() {

    }

    /**
     * @return String return the Participant's name
     */
    public String getParticipantName() {
        return this.participant.getName();
    }

    /**
     * @return String return the Participant's type
     */
    public String getParticipantType(){
        return this.participant.getPlayerType();
    }

    /**
     * Allow other Participants to view the current Participants cards, based on the current state of the game
     * @param requestingParticipant
     */
    public List<Card> viewCards(Participant requestingParticipant) {
        ArrayList<Card> viewableCards = new ArrayList<Card>();

        for ( Card card : visibleCards) {
            viewableCards.add(card);
        }

        boolean showHiddenCards = (requestingParticipant != null && requestingParticipant == this.participant) || (gameTable.isGameOver());
        Card dummyCard = new Card("X","X",0);
        for ( Card card : hiddenCards) {
            if (showHiddenCards) {
                viewableCards.add(card);
            } else {
                viewableCards.add(dummyCard);
            }
        }

        return Collections.unmodifiableList(viewableCards);
    }

    // public void RequestCard();

    // public ArrayList<Card> ReturnCards();

}
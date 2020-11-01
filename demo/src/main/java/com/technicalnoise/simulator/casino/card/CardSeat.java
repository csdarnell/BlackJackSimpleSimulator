package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.technicalnoise.simulator.global.*;

/**
 * A Seat represents the "interface" between a Participant and the Table
 */
public abstract class CardSeat implements DealerSeatInteraction, PlayerSeat, OtherParticipantSeat {
    private CardTable gameTable;
    private Participant player;
    private ArrayList<Card> visibleCards = new ArrayList<Card>();
    private ArrayList<Card> hiddenCards = new ArrayList<Card>();;
    
    public CardSeat(CardTable table) {
        this.gameTable = table;
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

    public void setPlayer(Participant player) {
        this.player = player;
    }

    /**
     * @return String return the Participant's name
     */
    public String getParticipantName() {
        return this.player.getName();
    }

    /**
     * @return String return the Participant's type
     */
    public String getParticipantType(){
        return this.player.getParticipantType();
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

        boolean showHiddenCards = (requestingParticipant != null && requestingParticipant == this.player) || (gameTable.isGameOver());
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

}
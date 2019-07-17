package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

import com.technicalnoise.simulator.global.*;
import com.technicalnoise.simulator.casino.card.services.*;

/**
 * A Seat represents the "interface" between a Participant and the Table
 */
public abstract class Seat implements DealerSeatInterface, OtherParticipantSeat {
    Table gameTable;
    Participant player;
    CardViewingService cardViewingService;
    ArrayList<Card> visibleCards = new ArrayList<Card>();
    ArrayList<Card> hiddenCards = new ArrayList<Card>();;
    
    public Seat(Table table, Participant player, CardViewingService cardViewingService) {
        this.gameTable = table;
        this.player = player;
        this.cardViewingService = cardViewingService;
    }
    
    public void addCard(Card card) {
        if (visibleCards.isEmpty()) {
            visibleCards.add(card);
        } else {
            hiddenCards.add(card);
        }
        
    }

    public ArrayList<Card> returnCards() {
        ArrayList<Card> returnedCards = new ArrayList<Card>();
        visibleCards.forEach((c) -> returnedCards.add(c));
        visibleCards.clear();
        hiddenCards.forEach((c) -> returnedCards.add(c));
        hiddenCards.clear();
        return returnedCards;
    }

    public void getHandValue() {

    }


    /**
     * Allow other Participants to view the current Participants cards, based on the current state of the game
     * @param requestingParticipant
     */
    public void ViewCards(Participant requestingParticipant) {
        cardViewingService.initiateCardShowing(String.format("Cards for player {0}", player.getName()));
        int cardsValue = 0;
        for ( Card card : visibleCards) {
            cardViewingService.showCard(card);
            cardsValue += card.getValue();

        }
        if ((requestingParticipant == this.player) || (gameTable.isGameOver())){
            for ( Card card : hiddenCards) {
                cardViewingService.showCard(card);
                cardsValue += card.getValue();
            }
        }

        cardViewingService.endCardShowing(String.format("Cards value:  ", cardsValue));
    }

    // public void RequestCard();

    // public ArrayList<Card> ReturnCards();

}
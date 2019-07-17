package com.technicalnoise.simulator.casino.card.services;

import com.technicalnoise.simulator.casino.card.Card;

/**
 * A Card Viewing Serivce that presents the cards on the Console
 */
public class ConsoleCardViewingService implements CardViewingService {

    @Override
    public void initiateCardShowing(String message) {
        if(message.length() == 0) {
            message = "-------------";
        }
        System.out.println(message);
    }

    @Override
    public void showCard(Card card) {
        System.out.print(String.format("|{0} {1}|", card.getFace(), card.getClass()));
    }

    @Override
    public void endCardShowing(String message) {
        if(message.length() == 0) {
            message = "-------------";
        }
        System.out.println(message);
    }

}
package com.technicalnoise.simulator.casino.card;

public class Card {
    private String suit;
    private String face;
    private int value;

    public Card (String suit, String face, int value) {
        this.suit = suit;
        this.face = face;
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }
    /**
     * @return the face
     */
    public String getFace() {
        return face;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
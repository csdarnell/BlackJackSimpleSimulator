package com.technicalnoise.simulator.casino.card;

public class Card {
    private String face;
    private short value;

    /**
     * @return the face
     */
    public String getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * @return the value
     */
    public short getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(short value) {
        this.value = value;
    }
}
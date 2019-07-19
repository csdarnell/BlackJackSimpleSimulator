package com.technicalnoise.simulator.global;

/**
 * A generic representation of any person that participates in a game
 */
public abstract class Participant {
    private String name;
    protected String participantType = "Participant";

    public Participant (String name) {
        this.name = name;
    }
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    public String getParticipantType() {
        return this.participantType;
    }

    public void performTurn() {}
}
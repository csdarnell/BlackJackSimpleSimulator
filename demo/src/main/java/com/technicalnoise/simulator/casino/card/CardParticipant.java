package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

import com.technicalnoise.simulator.global.Participant;

public abstract class CardParticipant implements Participant {

    private String name;
    private Seat seat;
    private ArrayList<OtherParticipantSeat> participantSeats;

    public CardParticipant(String name, Seat seat, ArrayList<OtherParticipantSeat> participantSeats) {
        this.name = name;
        this.seat = seat;
        this.participantSeats = participantSeats;

    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

}
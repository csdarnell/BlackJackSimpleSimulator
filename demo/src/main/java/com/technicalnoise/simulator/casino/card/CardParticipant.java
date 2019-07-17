package com.technicalnoise.simulator.casino.card;

import java.util.ArrayList;

import com.technicalnoise.simulator.global.Participant;

public abstract class CardParticipant extends Participant implements OtherParticipantSeat {

    protected Seat seat;
    protected ArrayList<OtherParticipantSeat> participantSeats;

    /**
     * @return String return the Participant's name
     */
    public String getParticipantName() {
        return this.getName();
    }

    public CardParticipant(String participantName, Seat seat, ArrayList<OtherParticipantSeat> participantSeats) {
        super(participantName);

        this.seat = seat;
        this.participantSeats = participantSeats;

    }


}
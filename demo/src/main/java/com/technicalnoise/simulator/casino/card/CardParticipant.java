package com.technicalnoise.simulator.casino.card;

import java.util.List;

import com.technicalnoise.simulator.global.Participant;

public abstract class CardParticipant extends Participant implements OtherParticipantSeat {

    protected PlayerSeat seat;
    protected List<OtherParticipantSeat> participantSeats;

    /**
     * @return String return the Participant's name
     */
    public String getParticipantName() {
        return this.getName();
    }

    public CardParticipant(String participantName, PlayerSeat seat, List<OtherParticipantSeat> participantSeats) {
        super(participantName);

        this.seat = seat;
        this.participantSeats = participantSeats;

        seat.setPlayer(this);
    }


}
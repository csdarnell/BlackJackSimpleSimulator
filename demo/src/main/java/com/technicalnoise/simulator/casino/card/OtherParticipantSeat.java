package com.technicalnoise.simulator.casino.card;

import com.technicalnoise.simulator.global.Participant;

/**
 * This interface determines what other Participants can see of the current Participant's Seat;  THIS IS FALSE SECURITY, BUT PROVIDES AN INTERESTING DESIGN
 */
public interface OtherParticipantSeat {

    
    /**
     * @return String return the Participant's name
     */
    String getParticipantName();

    /**
     * @return String return the Participant's type
     */
    String getParticipantType();

    /**
     * Allow other Participants to view the current Participants cards, based on the current state of the game
     * @param requestingParticipant
     */
    void ViewCards(Participant requestingParticipant);
    
}
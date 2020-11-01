package com.technicalnoise.simulator.casino.card.games.blackjack.basic;

import com.technicalnoise.simulator.casino.card.games.blackjack.basic.models.BlackjackTable;
import com.technicalnoise.simulator.global.services.UserCommService;
import com.technicalnoise.simulator.global.services.CommandLineUserCommService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.technicalnoise.simulator.casino.card.CardSeat;
import com.technicalnoise.simulator.casino.card.OtherParticipantSeat;
import com.technicalnoise.simulator.casino.card.TableCardManagement;
import com.technicalnoise.simulator.casino.card.TableStatusManagement;
import com.technicalnoise.simulator.casino.card.games.blackjack.basic.models.BlackjackDealer;
import com.technicalnoise.simulator.casino.card.games.blackjack.basic.models.BlackjackPlayer;
import com.technicalnoise.simulator.casino.card.games.blackjack.basic.models.BlackjackSeat;

public class BasicBlackjackApplication {

	public static void main(String[] args) {
		UserCommService commService = new CommandLineUserCommService();

		BlackjackTable table = new BlackjackTable();
		ArrayList<CardSeat> seats = new ArrayList<CardSeat>();
		table.setSeats((ArrayList<OtherParticipantSeat>)(Object)seats);

		BlackjackSeat dealerSeat = new BlackjackSeat(table);
		seats.add(dealerSeat);
		BlackjackSeat playerSeat = new BlackjackSeat(table);
		seats.add(playerSeat);

		// For this simple system, the Table supports both the TableStatusManagement and TableCardManagement interfaces
		BlackjackDealer dealer = new BlackjackDealer(
			"Dealer", 
			dealerSeat, 
			(List<OtherParticipantSeat>)(Object)Collections.unmodifiableList(seats), 
			(TableCardManagement)table, 
			(TableStatusManagement)table);

		BlackjackPlayer player = new BlackjackPlayer("Player", playerSeat, (List<OtherParticipantSeat>)(Object)Collections.unmodifiableList(seats),commService);

		
	}

}

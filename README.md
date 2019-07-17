# BlackJackSimpleSimulator

I created this project simply to refresh my memory on the Java language.  I have a lot of experience with Microsoft C#.  Where I could, I attempted to carry architectural and "patterns and practices" that I am familiar with into this Java program.  These include:  the use of interfaces, abstract classes, and Inversion of Control (IoC) (though I would really like to have implemented Dependency Injection (DI)).  Where appropriate, I used unmodifiable lists, which are Java's equivalent to the .Net immutable collections.

The basic approach of this project demonstration is that my fictitions company wants to create an online casino.  This casino will eventually have machines and table games, but will start with only Blackjack.  Plus, that initial Blackjack game will be a basic game, without any of the more advanced Blackjack concepts.  Those advanced concepts would be added by adding a new Blackjack game design, which would likely use the initial Blackjack game as a foundation.

To support this "casino" idea, the concept of a Participant has been separated from all games.  This allows for future growth, where a Participant exists outside of games.  Such growth would include traits that would allow them to have an account, a biography, and a photo.  Since casinos are interested in tracking what their attendees do, an abstracted Participant would allow the casino to have historical information about that Participant, no matter what gaming activities the Participant participated in.

To continue the "casino" idea:

- card games would introduce a common concept of a Table, which is capable of managing the card deck for any type of card game.
-- The Table must manage the card deck, including shuffling
-- The Table must provide an interface for a Dealer to move cards around
--- Move cards from the deck to a Seat's hand
--- Retrieve cards from all Seats
-- The Table must support a discard pile, incase several rounds occur in between shuffling
- card games would introduce a common concept of a Seat, which is responsible for managing a Participant's card hand
-- Participants actually don't directly interact with their card hand.  
-- most card games support visible and hidden cards, so the seat's card management differenciates them.
- Dealers and Players are very similar, so they are based on a Participant class

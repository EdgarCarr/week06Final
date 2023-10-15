package week06codingproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	List<Card> deck = new ArrayList<Card>();
	
	public Card drawCard() {
		Card drawnCard = this.deck.get(0);
		this.deck.remove(0);
		return drawnCard;
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}

public Deck() {
	for(int a = 2; a <= 14; a++) {
		for(int b = 0; b < 4; b++) {
			deck.add(new Card(b, a));
		}
	}
}

public List<Card> getCards() {
	return deck;
	
}
public void setCards(List<Card> deck) {
	this.deck = deck;
}

public Card draw() {
	if (deck.isEmpty()) {
		System.out.println("End of cards.");
		return null;
	} else {
		Card topCard = deck.get(0);
		deck.remove(0);
		return topCard;
	}
}

}

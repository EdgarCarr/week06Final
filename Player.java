package week06codingproject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;

public Player(String name) {
	this.name = name;
	this.score = 0;
	
}
public void describe() {
	System.out.println("These are the cards" + " " + name + " " + "has:");
	for (Card card : hand) {
		card.describe();
	}
	System.out.println("************");
	
}
public Card flip() {
	Card topCard = hand.get(0);
	hand.remove(0);
	return topCard;
}
public void incrementScore() {
	this.score++;
} 
public int getScore() {
	return score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	
}

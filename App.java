package week06codingproject;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	
	Deck deck = new Deck();
	System.out.print("Name of Player 1?");
	Player playerOne = new Player(s.nextLine());
	System.out.print("Name of Player 2?");
	Player playerTwo = new Player(s.nextLine());
	System.out.println("--------------");
	
	
	deck.shuffle();
	
	
	for (int i = 1; i <= 26; i++) {
		playerOne.hand.add(deck.draw());
		playerTwo.hand.add(deck.draw());
		}
	
	for (int i = 1; i <= 26; i++) {
		System.out.println("Number of Rounds:" + i);
		
		Card cardOne = playerOne.flip();
		System.out.print(playerOne.getName());
		cardOne.describe();
		Card cardTwo = playerTwo.flip();
		System.out.print(playerTwo.getName());
		cardTwo.describe();
		
		if (cardOne.getValue() > cardTwo.getValue()) {
			playerOne.incrementScore();
			System.out.println("\n" + playerOne.getName() + " " + "Has won Round " + i + ".");
			} else if (cardOne.getValue() < cardTwo.getValue()) {
				playerTwo.incrementScore();
				System.out.println("\n" + playerTwo.getName() + " " + "Has won Round " + i + ".");
		}
		System.out.println("-----------");
		}
	
	System.out.println("Final " + "\n" + playerOne.getName() + ": " + playerOne.getScore() + "\n" + playerTwo.getName() + ":" + playerTwo.getScore()); 
	if (playerOne.getScore() > playerTwo.getScore()) {
		System.out.println("\n" + playerOne.getName().toUpperCase() + " " + "Has won!");
		} else if (playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("\n" + playerTwo.getName().toUpperCase() + " " + "Has won!");
		}else {
			System.out.println("It is a Draw!");
		}
	s.close();

	}

}

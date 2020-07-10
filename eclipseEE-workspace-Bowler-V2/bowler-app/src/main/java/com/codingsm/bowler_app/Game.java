package com.codingsm.bowler_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	// ArrayList for the RegularFrames
	private static ArrayList<RegularFrame> game = new ArrayList<>();
	// Keep track of the RegularFrame
	private int RegularFrame = 1;
	private Scanner sc = new Scanner(System.in);
	private boolean isOver = false;
	
	public void startGame() {
		//TODO logic for adding bowlers with arraylist of bowlers
		ArrayList<Bowler> bowlerList = new ArrayList<>();
		
		setGame();
	}
	// Start the game from the main()
	public void setGame() {
		
		
		//TODO Logic to loop through each bowler assigning one frame of balls
		
		
		// Loop through 10 RegularFrames
		while (!isOver) {
			System.out.println("Now bowling in RegularFrame # "+ RegularFrame);
			// Set up 11 and 12 RegularFrame
			if (RegularFrame == 11)
				getScoreExtra();
			// Get the score from the user's input
			else
				//getScore();
			// Show the score after every RegularFrame
			showScore();
		}
		System.out.println(" GAME OVER! ");
	}
	
	private void getScoreExtra() {
		// Check if last RegularFrame was a spare or strike
		if(game.get(9).isSpare) {
			try {
				// Since a spare only get one ball
				System.out.println("You get one extra ball.");
				System.out.println("[X = Strike]");
				String ball1 = sc.nextLine().toUpperCase();
				game.add(new RegularFrame(ball1.charAt(0),'0'));
				RegularFrame++;
				// Finish the game
				isOver = true;
			} catch (FrameException e) {
				System.out.println("Could not create Frame, " + e.getMessage());
			}			
			return;
		}
		// Strike gets two balls
		try {
			System.out.println("You get two extra balls.");
			System.out.println("Enter your first ball.");
			System.out.println("[X = Strike]");
			String ball1 = sc.nextLine().toUpperCase();
			System.out.println("Enter your second ball.");
			System.out.println("[X = Strike]");
			String ball2 = sc.nextLine().toUpperCase();
			// If a strike will need to add two RegularFrames
			if (ball1.charAt(0) == 'X') {
				game.add(new RegularFrame(ball1.charAt(0),' '));
				game.add(new RegularFrame(ball2.charAt(0),' '));
			}
			else {
				game.add(new RegularFrame(ball1.charAt(0),ball2.charAt(0)));				
			}
			RegularFrame++;
			// Finish the game
			isOver = true;
		} catch (FrameException e) {
			System.out.println("Could not create RegularFrame, " + e.getMessage());
		}
		return;
	}
	
	
	
	private void showScore() {
		System.out.println(" 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |");
		System.out.println("-----------------------------------------");
		// Loop through the entire array
		
		for (int x = 0; x < game.size(); x++) {
			if (game.get(x).isStrike)
				System.out.print( "  X ");
			else if (game.get(x).isSpare)
				System.out.print( game.get(x).b1 + " / ");
			else {
				System.out.print( game.get(x).b1 + " " + game.get(x).b2 + " ");
				if (RegularFrame == 11) 
					isOver = true;
			}
		}
		System.out.println();
		System.out.println("\n Game Total = " + calculateScore());
	}
	
	private int calculateScore() {
		int score = 0;
		
		for (int x = 0; x < game.size(); x++) {
			if (game.get(x).isSpare && x < game.size()-1)
				score += game.get(x+1).b1 + 10; 
			else if (game.get(x).isStrike && x < game.size()-1 && !game.get(x+1).isStrike)
				score += game.get(x+1).b1 + game.get(x+1).b2 + 10; 
			else if (game.get(x).isStrike && (x+1) < game.size()-1 && game.get(x+1).isStrike)
				score += game.get(x+2).b1 + 20; 
			else if (!game.get(x).isSpare && !game.get(x).isStrike)
				score += game.get(x).b1 + game.get(x).b2; 
			
		}
		return score;
	}
	
}
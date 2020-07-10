package com.codingsm.bowler_app;

import java.util.ArrayList;

public class Bowler {

	private static ArrayList<Frame> game = new ArrayList<>();
	String firstName;
	String lastName = null;
	int score;
	
	private void updateScore() {
		//TODO
		
		String ball1, ball2;
		try {
			System.out.println("Enter pins for Frame #" + RegularFrame.getFrame() + " Ball #1 ");
			System.out.println("[X = Strike]");
			// Grab the input from the user
			ball1 = sc.nextLine().toUpperCase();
			if (!ball1.equals("X")) {
				System.out.println("Enter pins for Frame #" + RegularFrame.getFrame() + " Ball #2 ");
				// Get the second ball from the user
				ball2 = sc.nextLine();
			}
			else {
				ball2 = " ";
			}
			game.add(new RegularFrame(ball1.charAt(0),ball2.charAt(0)));
			RegularFrame.setFrame(++);
		} catch (FrameException e) {
			System.out.println("Could not create RegularFrame, " + e.getMessage());
		}
	}
}

package com.codingsm.bowler_app;

public class TenthFrame {

	public static int frame = 1;
	public int b1;
	public int b2;
	public int b3;
	public int score = 0;
	public boolean isStrike;
	public boolean isSpare;
	
	// -1 = STRIKE
	// -2 = SPARE
	// 0  = OPEN
	
	
	TenthFrame (char ball1, char ball2) throws FrameException {
		//TODO
		
	}
	
//	private void getScoreExtra() {
//		// Check if last frame was a spare or strike
//		if(game.get(9).isSpare) {
//			try {
//				// Since a spare only get one ball
//				System.out.println("You get one extra ball.");
//				System.out.println("[X = Strike]");
//				String ball1 = sc.nextLine().toUpperCase();
//				game.add(new Frame(ball1.charAt(0),'0'));
//				frame++;
//				// Finish the game
//				isOver = true;
//			} catch (FrameException e) {
//				System.out.println("Could not create Frame, " + e.getMessage());
//			}			
//			return;
//		}
//		// Strike gets two balls
//		try {
//			System.out.println("You get two extra balls.");
//			System.out.println("Enter your first ball.");
//			System.out.println("[X = Strike]");
//			String ball1 = sc.nextLine().toUpperCase();
//			System.out.println("Enter your second ball.");
//			System.out.println("[X = Strike]");
//			String ball2 = sc.nextLine().toUpperCase();
//			// If a strike will need to add two frames
//			if (ball1.charAt(0) == 'X') {
//				game.add(new Frame(ball1.charAt(0),' '));
//				game.add(new Frame(ball2.charAt(0),' '));
//			}
//			else {
//				game.add(new Frame(ball1.charAt(0),ball2.charAt(0)));				
//			}
//			frame++;
//			// Finish the game
//			isOver = true;
//		} catch (FrameException e) {
//			System.out.println("Could not create Frame, " + e.getMessage());
//		}
//		return;
//	}
}

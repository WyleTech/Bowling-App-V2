package com.codingsm.bowler_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Bowler {
	
	Scanner sc = new Scanner(System.in);
	private static ArrayList<Frame> game = new ArrayList<>();
	String name;
	String lastName = null;
	int score;
	


	//***Kyle Additions//
	Bowler(String name, String lastName, int score){
		this.name = name;
		
		//TEMP COMMENT EXIT TO TEST GAME CLASS CAll
		//this.score = score;
		//this.lastName = lastName;
	}
	
//	private void updateScore() {
//		//TODO
//		
//		String ball1, ball2;
//		try {
//			System.out.println("Enter pins for Frame #" + RegularFrame.getFrame() + " Ball #1 ");
//			System.out.println("[X = Strike]");
//			// Grab the input from the user
//			ball1 = sc.nextLine().toUpperCase();
//			if (!ball1.equals("X")) {
//				System.out.println("Enter pins for Frame #" + RegularFrame.getFrame() + " Ball #2 ");
//				// Get the second ball from the user
//				ball2 = sc.nextLine();
//			}
//			else {
//				ball2 = " ";
//			}
//			game.add(new RegularFrame(ball1.charAt(0),ball2.charAt(0)));
//			RegularFrame.setFrame(++);
//		} catch (FrameException e) {
//			System.out.println("Could not create RegularFrame, " + e.getMessage());
//		}
//	}
	
	//****Kyle Edits**** Getters and Setters for Name - 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}





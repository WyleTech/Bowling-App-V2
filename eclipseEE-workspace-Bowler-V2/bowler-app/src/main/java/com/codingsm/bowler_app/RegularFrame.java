package com.codingsm.bowler_app;

public class RegularFrame {
	
	public static int frame = 1;
	public int b1;
	public int b2;
	// -1 = STRIKE
	// -2 = SPARE
	// 0  = OPEN
	public int score = 0;
	public boolean isStrike;
	public boolean isSpare;
	
	RegularFrame (char ball1, char ball2) throws FrameException{
		if (ball1 == 'X' || ball1 == 10) {
			b1 = 10;
			b2 = -1;
			isStrike = true;
			System.out.println("STRRRRRIKE!!!!");
			return;
		}
		b1 = Character.getNumericValue(ball1);
		b2 = Character.getNumericValue(ball2);
		if (b1 < 0 || b2 < 0)
			throw new FrameException("Entered invalid pin count!");
			
		if ((b1 + b2) == 10) {
			isSpare = true;
			System.out.println("Picked up the spare!");
			return;
		}
		if ((b1 + b2) < 10) {
			System.out.println("Open frame - Oops!");
			return;
		}
		throw new FrameException("Entered invalid pin count!");
	}
	
	public int getScore() {
		return 0;
	}

	public static int getFrame() {
		return frame;
	}

	public void setFrame(int frame) {
		RegularFrame.frame = frame;
	}

	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getB2() {
		return b2;
	}

	public void setB2(int b2) {
		this.b2 = b2;
	}

	public boolean isStrike() {
		return isStrike;
	}

	public void setStrike(boolean isStrike) {
		this.isStrike = isStrike;
	}

	public boolean isSpare() {
		return isSpare;
	}

	public void setSpare(boolean isSpare) {
		this.isSpare = isSpare;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}
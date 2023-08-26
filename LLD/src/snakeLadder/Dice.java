package snakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
 
	int dicecount;
	public Dice(int i) {
		this.dicecount = i;
	}
	public int rollDice() {
		return ThreadLocalRandom.current().nextInt(1,6);
	}

}

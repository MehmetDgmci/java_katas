package RockPaperScissors;

public class Solution {
	public static String rps(String p1, String p2) {
		if (p1.equals(p2)) {
			return "Draw!";
		}

		switch (p1) {
			case "rock":
				return p2.equals("paper") ? "Player 2 won!" : "Player 1 won!";
			case "paper":
				return p2.equals("scissors") ? "Player 2 won!" : "Player 1 won!";
			case "scissors":
				return p2.equals("rock") ? "Player 2 won!" : "Player 1 won!";
			default:
				return "Invalid option!";
		}
	}
}

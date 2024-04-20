package RockPaperScissors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	@Test
	public void test1() {
		System.out.println("Fixed Tests Player 1 won!");
		assertEquals("Player 1 won!", Solution.rps("rock", "scissors"));
		assertEquals("Player 1 won!", Solution.rps("scissors", "paper"));
		assertEquals("Player 1 won!", Solution.rps("paper", "rock"));
	}
	@Test
	public void test2() {
		System.out.println("Fixed Tests Player 2 won!");
		assertEquals("Player 2 won!", Solution.rps("scissors", "rock"));
		assertEquals("Player 2 won!", Solution.rps("paper", "scissors"));
		assertEquals("Player 2 won!", Solution.rps("rock", "paper"));
	}
	@Test
	public void test3() {
		System.out.println("Fixed Tests Draw!");
		assertEquals("Draw!", Solution.rps("scissors", "scissors"));
		assertEquals("Draw!", Solution.rps("paper", "paper"));
		assertEquals("Draw!", Solution.rps("rock", "rock"));
	}


}
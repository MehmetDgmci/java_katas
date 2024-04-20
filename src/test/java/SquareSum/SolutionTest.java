package SquareSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
	@Test
	public void testBasic()
	{
		assertEquals(9, Solution.squareSum(new int[] {1,2,2}));
		assertEquals(5, Solution.squareSum(new int[] {1,2}));
		assertEquals(50, Solution.squareSum(new int[] {5,-3,4}));
		assertEquals(0, Solution.squareSum(new int[] {}));
	}

}
package JadenCasingStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

	private Solution testEnv;

	@BeforeEach
	void setUp() {
		this.testEnv = new Solution();
		
	}
	@Test
	public void test() {
		assertEquals("Most Trees Are Blue", testEnv.toJadenCase("most trees are blue"));
	}

	@Test
	public void testNullArg() {
		assertNull(testEnv.toJadenCase(null));
	}

	@Test
	public void testEmptyArg() {
		assertNull(testEnv.toJadenCase(""));
	}
}
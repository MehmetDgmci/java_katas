package StringRepeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringRepeatSolutionTest {

	@Test
	public void test4a() {
		assertEquals("aaaa", StringRepeatSolution.repeatStr(4, "a"));
	}

	@Test
	public void test3Hello() {
		assertEquals("HelloHelloHello", StringRepeatSolution.repeatStr(3, "Hello"));
	}

	@Test
	public void test5empty() {
		assertEquals("", StringRepeatSolution.repeatStr(5, ""));
	}

	@Test
	public void test0kata() {
		assertEquals("", StringRepeatSolution.repeatStr(0, "kata"));
	}

}
package ReverseWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsSolutionTest {
	@Test
	public void exampleCases() {
		assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWordsSolution.reverseWords("The quick brown fox jumps over the lazy dog."));
		assertEquals("elppa", ReverseWordsSolution.reverseWords("apple"));
		assertEquals("a b c d", ReverseWordsSolution.reverseWords("a b c d"));
		assertEquals("elbuod  decaps  sdrow", ReverseWordsSolution.reverseWords("double  spaced  words"));
	}

}
package AbbreviateaTwoWordName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionAbbreviateaTwoWordNameTest {

	@Test
	public void testFixed() {
		assertEquals("S.H", SolutionAbbreviateaTwoWordName.abbrevName("Sam Harris"));
		assertEquals("P.F", SolutionAbbreviateaTwoWordName.abbrevName("Patrick Feenan"));
		assertEquals("E.C", SolutionAbbreviateaTwoWordName.abbrevName("Evan Cole"));
		assertEquals("P.F", SolutionAbbreviateaTwoWordName.abbrevName("P Favuzzi"));
		assertEquals("D.M", SolutionAbbreviateaTwoWordName.abbrevName("David Mendieta"));
		assertEquals("D.M", SolutionAbbreviateaTwoWordName.abbrevName("david mendieta"));
	}


}
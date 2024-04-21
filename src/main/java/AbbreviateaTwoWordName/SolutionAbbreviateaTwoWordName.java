package AbbreviateaTwoWordName;

public class SolutionAbbreviateaTwoWordName {

	public static String abbrevName(String name) {

		StringBuilder resultString = new StringBuilder();
		String[] resultArray = name.split(" ");
		resultString.append(resultArray[0].charAt(0)).append(".").append(resultArray[1].charAt(0));

		return resultString.toString().toUpperCase();
	}
}

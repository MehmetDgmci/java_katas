package StringRepeat;

public class StringRepeatSolution {
	public static String repeatStr(final int repeat, final String string) {

		StringBuilder resultString = new StringBuilder();

		for (int i = 0; i < repeat; i++) {
		resultString.append(string);
		}
		return resultString.toString();
	}
}

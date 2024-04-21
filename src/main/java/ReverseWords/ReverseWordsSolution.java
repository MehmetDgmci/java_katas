package ReverseWords;

public class ReverseWordsSolution {

	public static String reverseWords(final String original) {
		if (original.isBlank()) {
			return original;
		} else {
			StringBuilder result = new StringBuilder();
			String[] words = original.split(" ");
			for (String word : words) {
				StringBuilder temp = new StringBuilder(word).reverse();
				result.append(temp.toString()).append(' ');
			}
			return result.deleteCharAt(result.length() - 1).toString();
		}
	}
}

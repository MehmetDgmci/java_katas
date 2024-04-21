package ReverseWords;

public class ReverseWordsSolution {

	public static String reverseWords(final String original) {
		StringBuilder result = new StringBuilder();
		String[] words = original.split(" ");
		for (String word : words) {
			StringBuilder temp = new StringBuilder(word).reverse();
			result.append(temp.toString()).append(' ');
		}
		return result.toString().trim();
	}
}

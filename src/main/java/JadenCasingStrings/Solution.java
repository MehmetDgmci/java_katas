package JadenCasingStrings;

public class Solution {
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		String[] words = phrase.split("\\s+");

		for (String word : words) {
			char initial = word.charAt(0);
			if (Character.isUpperCase(initial)) {
				result.append(word).append(" ");
			} else {
				initial = Character.toUpperCase(initial);
				result.append(initial).append(word.substring(1)).append(" ");

			}
		}
		return result.toString().trim();
	}


}

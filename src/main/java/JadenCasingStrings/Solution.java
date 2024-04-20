package JadenCasingStrings;

public class Solution {
	public String toJadenCase(String phrase) {
		if (phrase == null || phrase.length() == 0) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		String[] words = phrase.split("\\s+");

		for (String word : words) {
			char initial = word.charAt(0);
			if (Character.isUpperCase(initial)) {
				result.append(word + " ");
			} else {
				initial = Character.toUpperCase(initial);
				result.append(initial + word.substring(1) + " ");

			}
		}
		return result.toString().trim();
	}


}

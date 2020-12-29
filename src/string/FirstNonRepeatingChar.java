package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * Problem Statement: Given a string, find its first non-repeating character
 */
public class FirstNonRepeatingChar {

	char getFirstNonRepeatedChar(String input) {
		Map<Character, Integer> counts = new LinkedHashMap<>(input.length());
		for (char c : input.toCharArray()) {
			if (counts.containsKey(c))
				counts.put(c, counts.get(c) + 1);
			else
				counts.put(c, 1);
		}

		Map.Entry<Character, Integer> entry = counts.entrySet().stream()
				.filter(e -> e.getValue() == 1)
				.findFirst()
				.get();

		return entry.getKey();

	}

}

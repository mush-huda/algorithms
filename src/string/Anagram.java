package string;

import java.util.Arrays;

/*
 * Problem Statement: Given two strings, write a program to check whether they
 * are anagrams of each other. 
 * For example. LISTEN & SILENT are anagrams.
 */

public class Anagram {

	private static int CHARACTER_RANGE = 256;

	/*
	 * Way 1: Check by sorting Time Complexity. O(n log(n))
	 */
	boolean isAnagramUsingSorting(String str1, String str2) {

		// Strings with different lengths cannot be anagrams
		if (str1.length() != str2.length())
			return false;

		char[] input1 = str1.toLowerCase().toCharArray();
		char[] input2 = str2.toLowerCase().toCharArray();

		Arrays.sort(input1); // This sort offers O(n log(n))
		Arrays.sort(input2);

		return Arrays.equals(input1, input2);
	}

	/*
	 * Way 2: Check by counting 
	 * 1. We will create a Histogram. For that we take a long array to hold all the possible characters. 
	 * 2. Run a loop and: Increment the count for each character in the first 
	 * string and decrement the count for each character in the second string 
	 * 3. If all the numbers of the histogram is finally 0 then it means that both strings are anagrams.
	 * Time Complexity: O(n)
	 */

	 boolean isAnagramUsingCounting(String str1, String str2) {

		// Strings with different lengths cannot be anagrams
		if (str1.length() != str2.length())
			return false;

		int[] count = new int[CHARACTER_RANGE];

		for (int i = 0; i < str1.length(); i++) {
			count[str1.toLowerCase().charAt(i)]++;
			count[str2.toLowerCase().charAt(i)]--;
		}

		for (int i = 0; i < CHARACTER_RANGE; i++) {
			if (count[i] != 0)
				return false;
		}

		return true;
	}
}

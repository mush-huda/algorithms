package string;

public class Palindrome {

	protected boolean isPalindrome(String inputString) {
		int wordSize = inputString.length();
		for (int i = 0; i < wordSize / 2; i++) {
			if (inputString.charAt(i) != inputString.charAt(wordSize - 1 - i))
				return false;
		}
		return true;
	}
}

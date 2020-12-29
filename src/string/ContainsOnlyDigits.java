package string;

/*
 * Write a program that check if a given string contains only digits (0 -9)
 */
public class ContainsOnlyDigits {

	protected boolean containsOnlyDigits(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}

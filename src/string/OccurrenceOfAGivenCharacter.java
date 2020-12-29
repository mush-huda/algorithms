package string;

/*
 * Problem Statement: Given a String and a character, write a program that counts
 * the number of occurrences of the given character in the given string.
 */
public class OccurrenceOfAGivenCharacter {
	
	protected int countOccurrence(String str, char ch) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.toLowerCase().charAt(i) == ch)
				count++;
		}
		return count;
	}
	
	protected long countUsingStream(String str, char ch) {
		long count = str.chars().filter(c -> c == ch).count();
		return count;
		
	}
	

}

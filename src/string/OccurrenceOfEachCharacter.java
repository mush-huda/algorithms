package string;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Statement: Given a String, write a program that counts the number
 * of occurrences of each character in the given string.
 */

public class OccurrenceOfEachCharacter {
	
	/*
	 * 1. Declare a HashMap of <Character, Integer>
	 * 2. Traverse the string and check if the Hashmap already contains the 
	 *  	traversed character.
	 * 3. If the character is already present, then get count and increment it 
	 *  	by 1 and then put it back.
	 * 4. If the character is not present then put the count as 1. 
	 */

	public static void main(String[] args) {
		String inputString = "Hello";
		
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		
		char[] strArray = inputString.toCharArray();
		
		for(char c : strArray) {
			if(charCountMap.containsKey(c))
				charCountMap.put(c, charCountMap.get(c) + 1);
			else
				charCountMap.put(c, 1);
		}
		
		// Printing the map
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " occurred " + entry.getValue() + " times");
		}
	}
	
}

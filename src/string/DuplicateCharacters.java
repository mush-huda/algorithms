package string;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem Statement: Find the duplicate characters in a String and the number of
 * times they appeared.
 */
public class DuplicateCharacters {
	
	public static void main(String[] args) {
		DuplicateCharacters findDuplicate = new DuplicateCharacters();
		findDuplicate.countDuplicatesUsingMap("Go greetings");
		findDuplicate.countDuplicates("Go greetings");
	}
	
	protected void countDuplicatesUsingMap(String inputString) {
		char[] charArray = inputString.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : charArray) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey() + " apeeared: " + entry.getValue() + " times" );
			}
		}
	}
	
	/*
	 * 1. The outer loop will select a character and initialize the count as 1  
	 * 		(means that the character appeared already once).
	 * 2. The inner loop will compare the selected character with rest of the characters
	 * 3. If a match is found, it will increase the count by 1 and set the duplicate
	 *    	characters as 0 to mark them as visited.
	 * 4. After inner loop, if the count of the character is greater than 1, then 
	 * 		it means that the character appeared more than once and thus has duplicates.
	 * 5. So we print the character and the number of times it appeared (count).
	 */
	
	private void countDuplicates(String str) {	
		char[] input = str.toCharArray();
	
		for(int i = 0; i < input.length; i++) {
			int count = 1;
			for(int j = i+1; j < input.length; j++) {
				if(input[i] == input[j] && input[i] != ' ') {
					count++;
					input[j] = '0';
				}
			}
			if(count > 1 && input[i] != '0'){
				System.out.println(input[i] + " appeared: " + count + "times.");
			}
		}
		
	}
	
	

}

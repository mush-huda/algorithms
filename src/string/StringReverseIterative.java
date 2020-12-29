package string;

public class StringReverseIterative {
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	protected String reverseString(String input) {
		StringBuffer output = new StringBuffer();
		
		for(int i = input.length()-1; i >=0; i--) {
			output.append(input.charAt(i));
		}
		return output.toString();
	}


}

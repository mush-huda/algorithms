package string;

import java.util.Stack;

public class StringReverseStack {

	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	protected String reverseUsingStack(String input) {
		char[] output = new char[input.length()]; 
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		for(int i = 0; i < input.length(); i++) {
			output[i] = stack.peek();
			stack.pop();
		}
		
		return String.valueOf(output);
		
	}
}

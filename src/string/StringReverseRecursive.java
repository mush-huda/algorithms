package string;

/*
 * Given a string, write a recursive function to print the reverse of it.
 */
public class StringReverseRecursive {

	public static void main(String[] args) {
		reverse("APPLE");
	}

	/*
	 * Time Complexity: O(n)
	 */
	public static void reverse(String str) {
		if (str == null || str.length() <= 1)
			System.out.println(str);
		else {
			System.out.println(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}
	
}

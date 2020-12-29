package searching;

public class UnorderedLinearSearch {
	public int unOrderedLinearSearch(int[] arrayOfInt, int data) {
		
		for(int i = 0; i < arrayOfInt.length; i++) {
			if(arrayOfInt[i] == data)
				return i;
		}
		return -1;
	}
}

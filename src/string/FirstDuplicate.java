package string;

import java.util.HashSet;
import java.util.Set;

/*
 * Find the first duplicate in an array.
 * For an array a = [2, 1, 3, 5, 3, 2], firstDuplicate(a) will return 3 because although
 * 2 and 3 both have duplicates, the second occurrence of 3 has the minimal index.
 */
public class FirstDuplicate {
	
	int firstDuplicate(int[] a) {
		//HashMap will not work because of the minimal index constraint
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < a.length; i++) {
			if(!set.add(a[i]))
				return a[i];
		}
		
		return -1;
	}

}

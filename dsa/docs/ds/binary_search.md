# Linear Search

#### Problem:
- Given a SORTED list or array of elements, search for a specific element.

#### Steps:
1. Define two pointers, low (start of the array) and high (end of the array). 
2. Compute the middle index: mid = low + (high - low) / 2. 
3. Check if the middle element matches the target, return the index
4. Ask question if the target is less than the middle element
    - If yes, focus on the left half of the array
    - If no, focus on the right half of the array
5. Continue until the target is found or the search range becomes invalid.

#### Time Complexity:
- O(log n) where n is the number of elements in the list or array.
- This is because the search space is halved with each iteration.
  1. n elements
  2. n/2 elements
  3. n/4 elements
  4. ......
  5. 1 element
- 

#### Space Complexity:
- `O(1)` as the algorithm handles one single element at a time.

#### Application:
- The prerequisite of this algorithm is that the dataset must be sorted.
- Fast lookups are needed (e.g., searching in a large database or index).


#### Notes:
- For sorted data, Ordered Linear Search is slightly more efficient as it can avoid unnecessary comparisons.


#### Algorithm Explanation: 

##### Overflow prevention for calculation of mid:
```
mid = low + (high - low) / 2;
```
- THe naive approach is to calculate mid as `(low + high) / 2`. But this approach can cause an integer overflow.
- In programming languages like Java, integers have a maximum value, `Integer.MAX_VALUE = 2,147,483,647`.
- If low and high are both large values close to the maximum, their sum (low + high) might exceed Integer.MAX_VALUE, 
causing an integer overflow.
- Instead of doing `(low + high)`, the formula computes the difference `(high - low)`, which is guaranteed to be within 
the range of valid integers.

##### Base Case for recursive function:
```
if (low > high) {
    return -1;
}
```
- When the target element is not present in the array and larger than the largest element in the array.
Given an array [10, 20, 30, 40, 50], find the target 60.
First iteration: low = 0, high = 4, mid = 2
Second iteration: low = 3, high = 4, mid = 3
Third iteration: low = 4, high = 4, mid = 4
Fourth iteration: low = 5, high = 4 => Base case violation, return -1 

- When the target element is not present in the array and smaller than the smallest element in the array.
Given an array [10, 20, 30, 40, 50], find the target 5.
First iteration: low = 0, high = 4, mid = 2
Second iteration: low = 0, high = 1, mid = 1
Third iteration: low = 0, high = 0, mid = 0
Fourth iteration: low = 0, high = -1 => Base case violation, return -1

- When the target element is not present in the array but within bounds.
Given an array [10, 20, 30, 40, 50], find the target 25.
First iteration: low = 0, high = 4, mid = 2
Second iteration: low = 0, high = 1, mid = 1
Fourth iteration: low = 2, high = -1 => Base case violation, return -1

##### `if (low > high)` and `while (low <= high)`:
- In the recursive function, the base case is in if clause, which means even `if (4 > 4) -> false`, the rest of the code
will be executed, meaning that the last element will be checked.
- But in the iterative function, `low <= high` is used a condition to execute the `while` loop. For `while (4 > 4)` the 
iteration will stop and the last element will not be checked.

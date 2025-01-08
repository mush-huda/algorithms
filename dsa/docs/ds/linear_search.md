# Linear Search

#### Problem: 
- Given a list or array of elements, search for a specific element.

#### Steps:
1.	Start from the beginning of a list or array.
2.	Compare each element to the target value.
3.	Continue until the target is found or the end of the list is reached.

#### Time Complexity:
- `O(n)` where n is the number of elements in the list or array.
- This is because every element may need to be examined in the worst case.

#### Space Complexity:
- `O(1)` as the algorithm handles one single element at a time.

#### Application: 
- Small datasets where the simplicity of the algorithm outweighs the performance cost.
- Unsorted data, as other algorithms like binary search require sorted data.

#### Types of Linear Search:
Linear Search can be classified into two types:
1. Unordered Linear Search
2. Ordered Linear Search

#### Unordered Linear Search
- The above example is an unordered linear search.
- Use it on datasets that are not sorted.
- The algorithm will iterate through all elements until it finds the target or reaches the end of the list.

#### Ordered Linear Search
- It works only if the dataset is sorted in an ascending or descending order.
- The algorithm can stop early if the current element exceeds (or is less than, in descending order) the target value, 
as all subsequent elements are guaranteed not to match.
- Example: In a sorted array [10, 20, 30, 40, 50], if the target is 25, the search can stop at 30 because no element 
after 30 can match 25.

#### Notes:
- For sorted data, Ordered Linear Search is slightly more efficient as it can avoid unnecessary comparisons.

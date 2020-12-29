package tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tree.SortedBinaryTree;

class SortedBinaryTreeTest {

	static SortedBinaryTree bt;
	
	@BeforeAll
	static void initAll() {
		bt = new SortedBinaryTree();
		bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	}

	@Test
	void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
		assertTrue(bt.containsNode(6));
		assertTrue(bt.containsNode(4));
		assertFalse(bt.containsNode(1));
	}

}

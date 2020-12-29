package tree;

public class SortedBinaryTree {

	Node root;

	public void add(int data) {
		root = addRecursive(root, data);
		System.out.println(root);
	}

	private Node addRecursive(Node current, int data) {
		if (current == null) {
			return new Node(data);
		}

		if (data < current.data) {
			current.leftNode = addRecursive(current.leftNode, data);
		} else if (data > current.data) {
			current.rightNode = addRecursive(current.rightNode, data);
		} else {
			// value already exists
			return current;
		}
		
		System.out.println(data);
		System.out.println(current);
		return current;
	}

	public boolean containsNode(int data) {
		return containsNodeRecursive(root, data);
	}

	private boolean containsNodeRecursive(Node current, int data) {
		if (current == null) {
			return false;
		}
		if (data == current.data) {
			return true;
		}
		return data < current.data ? containsNodeRecursive(current.leftNode, data)
				: containsNodeRecursive(current.rightNode, data);
	}

	public void delete(int data) {
		root = deleteRecursive(root, data);
	}

	private Node deleteRecursive(Node current, int data) {
		if (current == null) {
			return null;
		}

		if (data == current.data) {
			// Node to delete found
			// ... code to delete the node will go here
		}
		if (data < current.data) {
			current.leftNode = deleteRecursive(current.leftNode, data);
			return current;
		}
		current.rightNode = deleteRecursive(current.rightNode, data);
		return current;
	}

}

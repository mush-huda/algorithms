package tree;

public class BinaryTree {
	
	private Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public void insert(int data) {
		root = insert(root, data);
		System.out.println(root);
	}
	
	private Node insert(Node node, int data) {
		
		if(node == null)
			node = new Node(data);
		
		else {
			if(node.getRightNode() == null)
				node.rightNode = insert(node.rightNode, data);
			else
				node.leftNode = insert(node.leftNode, data);
		}
		System.out.println(data);
		System.out.println(node);
		return node;
	}
	
	public boolean isEmpty() {
		return root == null;
	}

}

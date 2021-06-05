package linkedlist;


public class LinkedListCTCI {
	
	private static class Node {
		private Node next;
		private int data;

		private Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	/*
	 * Case : If there is no head which means empty LinkedList then just create a
	 * node and assign it as head and exit from the rest of the method.
	 * 
	 * (1) Start from the head (2) Keep moving till the end node (3) When the end
	 * node is reached, add a new node
	 * 
	 */
	public void addLast(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	/*
	 * (1) Create a new node (2) New node's next should refer to the head (3) Now
	 * this new node should be the head
	 */
	public void addFirst(int data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}

	/*
	 * Case : If there's no head which means empty list, get out of the program.
	 * 
	 * Case : If we want to delete the head then just make the second node as head.
	 * So we're actually dereferencing the current head.
	 * 
	 * (1) Start from the head (2) Keep moving till the end node and keep checking
	 * if the next node is the node that we want to delete (3) If the next node is
	 * the node to be deleted then we take a jump to the next next node. So we
	 * dereference the next node and make the next next node as the next node.
	 */
	public void deleteWithValue(int data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}

	@Override
	public String toString() {
		Node current = head;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (current.next != null) {
			sb.append(current.data);
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}


}

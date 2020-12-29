package stack;

public interface Stack<E> {
	
	boolean push(E t);
	E pop();
	E peek();
	boolean isEmpty();
	boolean isFull();

}

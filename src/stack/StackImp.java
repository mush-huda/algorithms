package stack;

import java.util.EmptyStackException;

public class StackImp<E> implements Stack<E> {

	private int maxSize;
	private int top;
	private Object[] array;

	public StackImp(int maxSize) {
		this.maxSize = maxSize;
		this.array = new Object[maxSize];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean push(E obj) {
		if (this.isFull()) {
			throw new StackOverflowError();
		} else {
			top++;
			array[top] = obj;
			return true;
		}
	}

	public E pop() {
		if (this.isEmpty())
			throw new EmptyStackException();
		return element(top--);
	}

	public E peek() {
		if (this.isEmpty())
			throw new EmptyStackException();
		return element(top);
	}

	@SuppressWarnings("unchecked")
	private E element(int index) {
		return (E) array[index];
	}

}

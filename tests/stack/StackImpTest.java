package stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;

import org.junit.jupiter.api.Test;

import stack.StackImp;

class StackImpTest {

	@Test
	void emptyStackShouldReturnTrue() {
		StackImp<Integer> stack = new StackImp<>(2);
		assertTrue(stack.isEmpty());
	}
	
	@Test
	void nonEmptyStackShouldReturnFalse() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	void notFullStackShouldReturnFalse() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		assertFalse(stack.isFull());
	}

	@Test
	void fullStackShouldReturnTrue() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		stack.push(20);
		assertTrue(stack.isFull());
	}
	
	@Test
	void pushShouldRetunTrue() {
		StackImp<Integer> stack = new StackImp<>(2);
		assertTrue(stack.push(10));
	}
	
	@Test
	void pushingMoreThanStackSizeThrowsStackoverflowException() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		stack.push(20);
		assertThrows(StackOverflowError.class, () -> stack.push(30));
	}
	
	@Test
	void peekShouldRetunLastPushedElement() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		assertEquals(Integer.valueOf(10), stack.peek());
	}
	
	@Test
	void popShouldRetunLastPushedElement() {
		StackImp<Integer> stack = new StackImp<>(2);
		stack.push(10);
		assertEquals(Integer.valueOf(10), stack.pop());
	}
	
	@Test
	void popingFromEmptyStackThrowsStackunderflowException() {
		StackImp<Integer> stack = new StackImp<>(2);
		assertThrows(EmptyStackException.class, () -> stack.pop());
	}

}

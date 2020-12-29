package stack;

public class StackTest {
	public static void main(String[] args) {
		
		StackImp<String> myStack = new StackImp<>(5);
		
		System.out.println(myStack.isEmpty());
		
		String myString1 = new String("Hello");
		String myString2 = new String("Hi");
		String myString3 = new String("Ciao");
		String myString4 = new String("Servus");
		String myString5 = new String("Hallo");
		String myString6 = new String("Guten Tag");
		
		
		System.out.println("1st element: " + myStack.push(myString1));
		System.out.println("2nd element: " + myStack.push(myString2));
		System.out.println("3rd element: " + myStack.push(myString3));
		System.out.println("4th element: " + myStack.push(myString4));
		System.out.println("5th element: " + myStack.push(myString5));
//		
//		
		System.out.println("Poping element: " + myStack.pop());
		System.out.println("Poping element: " + myStack.pop());
		System.out.println("Poping element: " + myStack.pop());
		System.out.println("Poping element: " + myStack.pop());
		System.out.println("Poping element: " + myStack.pop());
		
//		System.out.println("Poping element: " + myStack.pop());
		
		
		
		StackImp<Integer> myIntStack = new StackImp<>(4);
		
		System.out.println("1st element: " + myIntStack.push(4));
		System.out.println("2nd element: " + myIntStack.push(2));
		System.out.println("peeking: " + myIntStack.peek());
		System.out.println("3rd element: " + myIntStack.push(10));
		System.out.println("4th element: " + myIntStack.push(15));
		System.out.println("peeking: " + myIntStack.peek());
		
	}

}

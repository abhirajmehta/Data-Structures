
public class StackUse {

	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<Integer>();
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack.size());

	}
}
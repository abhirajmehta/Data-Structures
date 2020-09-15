
public class Stack<T> {
	
	private StackNode<T> head;
	private StackNode<T> tail;
	private int size;
	
	public Stack() {
		
		head = null;
		tail = null;
		size = 0;
		
	}
	
	
	public void push(T data){
		
		if(head == null) {
			
			StackNode<T> temp = new StackNode<T>(data);
			head = temp;
			tail = null;
			
		//create tail if stack has head	only
		}else if(tail == null) {
			
			StackNode<T> temp = new StackNode<T>(data);
			head.next = temp;
			tail = temp;
			
		//create a temporary node and assign it as tail of the stack
		}else {
			
			StackNode<T> temp = new StackNode<T>(data);
			tail.next = temp;
			tail = tail.next;
			
		}
		
		size++;
		
	}
	
	public T pop() {
		
		T removed;
		
		if(size == 0) {
			
			return null;
			
		//if stack has only one node, empty the stack
		}else if(size == 1) {
			
			StackNode<T> temp = head;
			head = null;
			tail = null;
			
			removed = temp.data;
			
		//remove the tail node
		}else {
			
			StackNode<T> temp = new StackNode<T>(head.data);
			temp = head;
			removed = tail.data;
			
			//Iterate till tail node and assign it as null
			while(temp.next != tail) {
				
				temp = temp.next;
				
			}
			
			tail = temp;
			tail.next = null;
			
		}
		
		size--;
		return removed;
	
	}
	
	public boolean isEmpty() {
		
		if(size == 0) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public T peek() {
		
		if(tail == null) {
			
			return null;
			
		}
		
		return tail.data;
		
	}
	
}



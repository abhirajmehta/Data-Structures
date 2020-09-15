
public class StackNode<T> {
	
	T data;
	StackNode<T> next;
	StackNode<T> prev;
	
	public StackNode(T data) {
		
		this.data = data;
		this.next = null;
		this.prev = null;
		
	}
	
}

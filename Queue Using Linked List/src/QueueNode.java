
public class QueueNode<T> {
	
	T data;
	QueueNode<T> next;
	QueueNode<T> prev;
	
	//Constructor
	public QueueNode(T data) {
		
		this.data = data;
		this.next = null;
		this.prev = null;
		
	}
	
}
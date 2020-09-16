
public class Queue<T> {
	
	private QueueNode<T> head;
	private QueueNode<T> tail;
	private int size;
	
	//Constructor
	public Queue() {
		
		head = null;
		tail = null;
		size = 0;
		
	}
	
	//add or insert data into queue
	public void enqueue(T data) {
		
		//create head node if the queue is empty
		if(head == null) {
			
			QueueNode<T> temp = new QueueNode<T>(data);
			head = temp;
			head.prev = null;
			tail = null;
			
		//create tail if queue has head	only
		}else if(tail == null) {
			
			QueueNode<T> temp = new QueueNode<T>(data);
			head.next = temp;
			tail = temp;
			tail.prev = head;
			
		//create a temporary node and assign it as tail of the queue
		}else {
			
			QueueNode<T> temp = new QueueNode<T>(data);
			temp.prev = tail;
			tail.next = temp;
			tail = tail.next;
			
		}
		
		size++;
		
	}
	
	//remove or delete data from the queue
	public T dequeue() {
		
		T deleted = null;
		
		//return null if the queue is empty
		if(size == 0) {
			
			return null;
		
		//if queue has only one node, empty the queue
		}else if(size == 1) {
			
			deleted = head.data;
			head = null;
			tail = null;
			
		//make the next node of the head our new head
		}else {
			
			deleted = head.data;
			head = head.next;
			head.prev = null;
			
		}
		
		size--;
		return deleted;
		
	}
	
	//return true if size is zero else return false
	public boolean isEmpty() {
		
		return size ==0;
		
	}
	
	//return size of the queue
	public int size() {
		
		return size;
		
	}
	
	public T front() {
		
		if(size ==0) {
			
			return null;
			
		}
		
		return head.data;
	}
	
}

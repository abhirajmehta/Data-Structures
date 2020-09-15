
public class LinkedList<T> {
	
	private LinkedListNode<T> head;
	private LinkedListNode<T> tail;
	private int size;
	
	//Constructor
	public LinkedList()	{
		
		this.head = null;
		this.tail = null;
		this.size = 0;
		
	}
	
	//Insert at the front of the list
	public void insertAtFront(T data) {
		
		//create head if list is empty
		if(head == null) {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			head = temp;
			tail = null;
			
		//create tail if list only has head
		}else if(tail == null) {
			
			tail = head;
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			head = temp;
			head.next = tail;
			
		//create a temporary node and assign it as head of the list	
		}else {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			temp.next = head;
			head = temp;
			
		}
		
		size++;
		
	}
	
	//Insert at the end of the list
	public void insertAtEnd(T data) {
		
		//create head if list is empty
		if(head == null) {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			head = temp;
			tail = null;
			
		//create tail if list only has head	
		}else if(tail == null) {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			head.next = temp;
			tail = temp;
			
		//create a temporary node and assign it as tail of the list	
		}else {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(data);
			tail.next = temp;
			tail = tail.next;
			
		}
		
		size++;
		
	}
	
	//Delete the front of the list
	public void deleteFront() {
		
		//return if the list is empty
		if(size == 0) {
			
			return;
		
		//if list has only one node, empty the list
		}else if(size == 1) {
			
			head = null;
			tail = null;
		
		//make the next node of the head our new head
		}else {
			
			head = head.next;
			
		}
		
		size--;
		
	}
	
	public void deleteEnd() {
		
		//return if the list is empty
		if(size == 0) {
			
			return;
			
		//if list has only one node, empty the list
		}else if(size == 1) {
			
			head = null;
			tail = null;
			
		//remove the tail node
		}else {
			
			LinkedListNode<T> temp = new LinkedListNode<T>(head.data);
			temp = head;
			
			//Iterate till tail node and assign it as null
			while(temp.next != tail) {
				
				temp = temp.next;
				
			}
			
			tail = temp;
			tail.next = null;
			
		}

		size--;
		
	}
	
	public boolean isPresent(T data) {
		
		//return false if list is empty
		if(size == 0) {
			
			return false;
			
		}
		
		//Iterate through the list and check the data of every node and return true if found
		LinkedListNode<T> temp = head;
		while(temp != null) {
			
			if(temp.data == data) {
				return true;
			}
			
			temp = temp.next;
			
		}
		
		return false;
	
	}
	
	public void remove(T data) {
		
		//check if the data is present in the list
		if(isPresent(data)) {
			
			//if head's data is equal, remove head
			if(head.data == data) {
				
				deleteFront();
				
			//if tail's data is equal, remove tail
			}else if(tail.data == data) {
				
				deleteEnd();
				
			//iterate through list and remove the node if data matches
			}else {
				
				LinkedListNode<T> temp = head;
				while(temp != tail) {
					
					if(temp.next.data == data) {
						
						temp.next = temp.next.next;
						break;
						
					}
					
					temp = temp.next;
				
				}
				
			}
			
			size--;
			
		//return if data is not present in the list
		}else {
			
			return;
		
		}
		
	}
	
	//return size
	public int size() {
		
		return size;
		
	}
	
	//print the size
	public void printList() {
		
		//return if the list empty
		if(size == 0) {
			
			return;
			
		//if list has only one element, print it
		}else if(size == 1) {
			
			System.out.println(head.data);
			
		//print the data of every node while iterating through the list
		}else {
			
			LinkedListNode<T> temp = head;
			while(temp != null) {
				
				System.out.println(temp.data);
				temp = temp.next;
				
			}
			
		}
		
	}
	
}




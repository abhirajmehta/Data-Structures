
public class LinkedListUse {

	public static void main(String[] args) {
		
		LinkedList<Integer> myList = new LinkedList<Integer>();
		
		myList.size();
		
		myList.insertAtFront(20);
		myList.insertAtEnd(30);
		myList.insertAtFront(10);
		myList.insertAtEnd(40);
		myList.printList();
		System.out.println(myList.size());
		System.out.println(myList.isPresent(10));
		myList.deleteEnd();
		myList.deleteFront();
		myList.printList();
		System.out.println(myList.size());
		System.out.println(myList.isPresent(10));
		myList.insertAtFront(10);
		myList.insertAtEnd(50);
		System.out.println(myList.size());
		myList.printList();
	}

}
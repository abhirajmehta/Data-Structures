
public class QueueUse {

	public static void main(String[] args) {
		
		Queue<Integer> myQueue = new Queue<Integer>();
		
		myQueue.enqueue(10);
		myQueue.enqueue(20);
		myQueue.enqueue(30);
		myQueue.enqueue(40);
		myQueue.enqueue(50);
		System.out.println(myQueue.size());
		System.out.println(myQueue.front());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.front());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.dequeue());
		System.out.println(myQueue.front());
		System.out.println(myQueue.isEmpty());
		System.out.println(myQueue.size());
		
	}

}

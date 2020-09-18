
public class MinHeapUse {

	public static void main(String[] args) {
		
		MinHeap myMinHeap = new MinHeap();
		
		myMinHeap.insert(1);
		myMinHeap.insert(2);
		myMinHeap.insert(3);
		myMinHeap.insert(4);
		
		System.out.println(myMinHeap.getMin());
		System.out.println(myMinHeap.removeMin());
		System.out.println(myMinHeap.getMin());
		System.out.println(myMinHeap.isEmpty());
		System.out.println(myMinHeap.size());
		myMinHeap.removeMin();
		myMinHeap.removeMin();
		myMinHeap.removeMin();
		
		System.out.println(myMinHeap.size());
		System.out.println(myMinHeap.isEmpty());
		System.out.println(myMinHeap.getMin());

	}

}

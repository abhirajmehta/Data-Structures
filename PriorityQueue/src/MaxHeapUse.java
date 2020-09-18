
public class MaxHeapUse {

	public static void main(String[] args) {
		
		MaxHeap myMaxHeap = new MaxHeap();
		
		myMaxHeap.insert(1);
		myMaxHeap.insert(2);
		myMaxHeap.insert(3);
		myMaxHeap.insert(4);
		myMaxHeap.insert(5);
		
		System.out.println(myMaxHeap.getSize());
		myMaxHeap.removeMax();
		myMaxHeap.removeMax();
		myMaxHeap.removeMax();
		myMaxHeap.removeMax();
		System.out.println(myMaxHeap.isEmpty());
		myMaxHeap.removeMax();
		System.out.println(myMaxHeap.isEmpty());

	}

}

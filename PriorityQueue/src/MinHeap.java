import java.util.ArrayList;

public class MinHeap {
	
	private ArrayList<Integer> heap;
	
	//Constructor
	public MinHeap() {
		
		heap = new ArrayList<Integer>();
		
	}
	
	//is heap empty
	public boolean isEmpty(){
		
		return heap.size() == 0;
	
	}

	//size of the heap
	public int size(){
		
		return heap.size();
	
	}

	//get the smallest number in the heap
	public int getMin() {
		//return negative infinity if heap is empty
		if(isEmpty()){
			
			return Integer.MIN_VALUE;
		
		}
		
		return heap.get(0);
	
	}
	
	//insert an element in the heap
	public void insert(int element){
		
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;
		
		//swap number until heap order property is satisfied
		while(childIndex > 0){
			
			//swapping
			if(heap.get(childIndex) < heap.get(parentIndex)){
			
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			
			}else{
			
				return;
			
			}
		}
	}
	
	//remove element from the heap
	public int removeMin() {
		
		//if heap has no element
        if(heap.isEmpty()){
            return Integer.MIN_VALUE;
        }
        
        int numberRemoved = heap.get(0);
        
        if(heap.size() == 1){
            heap.remove(0);
            return numberRemoved;
        }
        
        int parentIndex = 0;
        int child1Index = (2 * parentIndex) + 1;
        int child2Index = (2 * parentIndex) + 2;
        int lastIndex = heap.size() - 1;
        
        int lastElement = heap.get(lastIndex);
        heap.set(0,lastElement);
        heap.remove(lastIndex);
        
        //swap until heap order property is satisfied
        while(child1Index < heap.size()){
            
        	//if elements are present at both the child indexes
            if(child1Index < heap.size() && child2Index < heap.size()){
                int childOne = heap.get(child1Index);
                int childTwo = heap.get(child2Index);
                
                if(childOne < childTwo){
                    if(heap.get(parentIndex) > heap.get(child1Index)){
                
                        int temp = heap.get(parentIndex);
                        int child1 = heap.get(child1Index);
                        heap.set(parentIndex,child1);
                        heap.set(child1Index,temp);
                        parentIndex = child1Index;

                    }
                }else{
                    if(heap.get(parentIndex) > heap.get(child2Index)){

                        int temp = heap.get(parentIndex);
                        int child2 = heap.get(child2Index);
                        heap.set(parentIndex,child2);
                        heap.set(child2Index,temp);
                        parentIndex = child2Index;

                   }
                }
            
            }else if(child1Index < heap.size()){
                if(heap.get(parentIndex) > heap.get(child1Index)){
                
                    int temp = heap.get(parentIndex);
                    int child1 = heap.get(child1Index);
                    heap.set(parentIndex,child1);
                    heap.set(child1Index,temp);
                    parentIndex = child1Index;

                }else{

                    if(child2Index >= heap.size()){
                    	
                        return numberRemoved;
                    
                    }else{

                        if(heap.get(parentIndex) > heap.get(child2Index)){

                            int temp = heap.get(parentIndex);
                            int child2 = heap.get(child2Index);
                            heap.set(parentIndex,child2);
                            heap.set(child2Index,temp);
                            parentIndex = child2Index;

                        }else{
                    
                        	return numberRemoved;
                        
                        }
                    }
                }
            }
			
            child1Index = (2 * parentIndex) + 1;
            child2Index = (2 * parentIndex) + 2;
        }
        
        return numberRemoved;
	}
	
}
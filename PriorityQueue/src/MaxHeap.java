import java.util.ArrayList;

public class MaxHeap {
	
	ArrayList<Integer> heap;
	
	//Constructor
	public MaxHeap() {
		
		heap = new ArrayList<Integer>();
		
	}
	
	//size of the heap
	int getSize(){
        
		return heap.size();
    
	}
    
	//is heap empty
    boolean isEmpty(){
    
    	return heap.size() == 0;
    
    }
    
    //get the largest element in the heap
    int getMax(){
        
        if(heap.size() == 0){
    
        	return Integer.MAX_VALUE;
        
        }
        
        return heap.get(0);
    
    }
    
    //insert an element in the heap
    void insert(int num){
        
        if(heap.size() == 0){
         
        	heap.add(num);
        	return;
        
        }else{
            
            heap.add(num);
            int childIndex = heap.size() - 1;
            int parentIndex = (childIndex - 1) / 2;
            
            while(childIndex >  0){
                
                if(heap.get(childIndex) > heap.get(parentIndex)){
        
                	int temp = heap.get(parentIndex);
                    heap.set(parentIndex,(heap.get(childIndex)));
                    heap.set(childIndex,temp);
                    childIndex = parentIndex;
                    parentIndex = (childIndex - 1) / 2;
                
                }else{
                
                	return;
                
                }   
            }
        }  
    }
    
    //remove the largest number from the heap
    int removeMax(){
        
    	//if heap is empty return positive infinity
        if(heap.size() == 0){
            
        	return Integer.MAX_VALUE;
        
        }
        
        int numberRemoved = heap.get(0);
        int parentIndex = 0;
        int child1Index = (2 * parentIndex) + 1;
        int child2Index = (2 * parentIndex) + 2;
        
        if(heap.size() == 1){
        
        	heap.remove(0);
            return numberRemoved;
        
        }else{
            
            heap.set(0,heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            
            //swap until heap order property is satisfied
            while(child1Index < heap.size()){
                
                if(child1Index < heap.size() && child2Index < heap.size()){
                
                	if(heap.get(child1Index) > heap.get(child2Index)){
                        
                        if(heap.get(child1Index) > heap.get(parentIndex)){
                            
                            int temp = heap.get(parentIndex);
                            heap.set(parentIndex,heap.get(child1Index));
                            heap.set(child1Index,temp);
                            parentIndex = child1Index;
                            
                        }
                    }else{
                        
                        if(heap.get(child2Index) > heap.get(parentIndex)){
                            
                            int temp = heap.get(parentIndex);
                            heap.set(parentIndex,heap.get(child2Index));
                            heap.set(child2Index,temp);
                            parentIndex = child2Index;
                            
                        }else{
                        	return numberRemoved;
                    	}
                    }

                }else if(child1Index < heap.size()){
        
                	if(heap.get(child1Index) > heap.get(parentIndex)){

                        int temp = heap.get(parentIndex);
                        heap.set(parentIndex,heap.get(child1Index));
                        heap.set(child1Index,temp);
                        parentIndex = child1Index;

                    }else{
                   
                    	return numberRemoved;
                    
                    }
                }
                
                child1Index = (2 * parentIndex) + 1;
                child2Index = (2 * parentIndex) + 2;
            }
            
            
        }
        
        return numberRemoved;
    }
	
}

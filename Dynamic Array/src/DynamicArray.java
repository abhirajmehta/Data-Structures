public class DynamicArray<T> {
	
	private T[] defaultArray;
	private int pointer;
	private int size;
	private int lengthOfDefaultArray;
	
	
	//Constructor
	@SuppressWarnings("unchecked")
	public DynamicArray(){
		
		defaultArray =(T[]) new Object[10];
		pointer = 0;
		size = 0;
		lengthOfDefaultArray = 10;
	}
	
	
	//Add element to the  default array
	@SuppressWarnings("unchecked")
	public void add(T element) {
		
		//Increase the size of default array if necessary
		if(pointer >= lengthOfDefaultArray) {

			defaultArray = (T[]) reassemble(defaultArray);
		
		}
		
		defaultArray[pointer] = element;
		pointer++;
		size++;
	}
	
	//Increase the size of default array
	private Object[] reassemble(Object[] array) {
		
		@SuppressWarnings("unchecked")
		Object[] newArray =(T[]) new Object[2*lengthOfDefaultArray];
		
		//Copy all the elements of default array into the new array
		for(int start = 0; start < size; start++) {
			
			newArray[start] = array[start];
			
		}
		
		lengthOfDefaultArray = newArray.length;
		return newArray;
	}
	
	
	//Get the size of default array
	public int getSize() {
		
		return this.size;
		
	}
	
	
	//Remove the last element from the default array
	public void remove() throws IndexOutOfBoundsException{
		
		//throw an exception if the size of default array is zero
		if(this.size == 0) {
			IndexOutOfBoundsException e = new IndexOutOfBoundsException();
			throw e;
		}
		
		defaultArray[pointer] = null;
		pointer--;
		size--;
		
	}
	
	
	//Get the element on given index
	public Object get(int index) throws IndexOutOfBoundsException{
		
		//throw an exception if the index is greater than the size of default array
		if(index >= size){
			IndexOutOfBoundsException e = new IndexOutOfBoundsException();
			throw e;
		}
		
		return defaultArray[index];
	}
	
}
import java.util.ArrayList;

public class Map<K, V> {
	
	private ArrayList<MapNode<K, V>> buckets;
	private int size;
	private int numberOfBuckets;
	
	//Constructor
	public Map() {
		
		numberOfBuckets = 5;
		buckets = new ArrayList<MapNode<K,V>>();
		size = 0;
		for(int count = 0; count < numberOfBuckets; count++) {
			
			buckets.add(null);
			
		}
		
	}
	
	//insert data in the set
	public void put(K key, V value) {
		//get index for the key by calling hash function
		int bucketIndex = hash(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		
		//search for a previous entry with the same key
		while(head != null) {
			//if entry for the same key is found replace it's value with new value
			if(head.key.equals(key)) {
				
				head.value = value;
				return;
				
			}
			
			head = head.next;
		}
		
		//if no previous entry is found make a new node with key and value and set it as the head
		head = buckets.get(bucketIndex);
		MapNode<K, V> newNode = new MapNode<K, V>(key, value);
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		size++;
		
	}
	
	//this function return the index for a key
	private int hash(K key) {
		
		//hashCode() gives us hash code for a particular key
		int hashCode = key.hashCode();
		return hashCode % numberOfBuckets;
	
	}
	
	//remove data from the set
	public V remove(K key) {
		//get index for the key by calling hash function
		int bucketIndex = hash(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null;
		
		//search for the node having the same key
		while (head != null) {
			//if the same key is found delete that node
			if (head.key.equals(key)) {
				
	
				if (prev == null) {
					
					buckets.set(bucketIndex, head.next);
				
				} else {
				
					prev.next = head.next;
				
				}
				
				size--;
				return head.value;
				
			}
			
			prev = head;
			head = head.next;
			
		}
		//if no key is found, return null
		return null;
		
	}
	
	//get the value for a key
	public V get(K key) {
		
		//get index for the key by calling hash function
		int bucketIndex = hash(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		
		//search for the same key and if found, return the value associated
		while(head != null) {
			
			if(head.key.equals(key)) {
				
				return head.value;
				
			}
			
			head = head.next;
			
		}
		//return null if no entry found
		return null;
		
	}
	
	public int size() {
		
		return size;
		
	}
	
}
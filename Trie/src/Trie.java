
public class Trie {
	
	private TrieNode root;
	private int numWords;
	
	//Constructor
	public Trie() {
		
		root = new TrieNode('\0');
		numWords = 0;
	
	}
	
	//search a word 
	public boolean search(String word){
	
		return search(root, word);
	
	}
	
	//helper function for searching a word
	private boolean search(TrieNode root, String word) {
		
		if(word.length() == 0){
		
			return root.isTerminating;
		
		}
	
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		
		if(child == null){
		
			return false;
		
		}
		
		return search(child, word.substring(1));
	
	}
	
	//remove a word
	public void remove(String word){
	
		if(remove(root, word)) {
		
			numWords--;
		
		}
	
	}
	
	//helper function for removing the word
	private boolean remove(TrieNode root, String word) {
	
		if(word.length() == 0){
		
			if(root.isTerminating) {
			
				root.isTerminating = false;
				return true;
			
			}else {
			
				return false;
			
			}
		}
		
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		
		if(child == null){
		
			return false;
		
		}
		
		boolean ans = remove(child, word.substring(1));
		
		//remove child node only if it is non terminating and its number of children are 0	
		if(!child.isTerminating && child.childCount == 0){
		
			root.children[childIndex] = null;
			child = null;
		
			root.childCount--;
		}
		
		return ans;
	
	}
	
	//add a word
	public void add(String word){
		
		if(add(root, word)) {
		
			numWords++;
		
		}
	
	}
	
	//helper function for adding a word
	private boolean add(TrieNode root, String word){
		
		if(word.length() == 0){
		
			if(root.isTerminating) {
			
				return false;
			
			}else {
			
				root.isTerminating = true;
				return true;
			
			}
		}		
	
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		
		if(child == null){
		
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		
		}
		
		return add(child, word.substring(1));
	
	}
	
	//return number of word
	public int countWords() {
		
		return numWords;
	
	}
	
}

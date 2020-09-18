
public class TrieUse {

	public static void main(String[] args) {
		
		Trie t = new Trie();
		
		t.add("abc");
		t.add("bbc");
		t.add("acc");
		t.add("hello");
		t.add("world");
		
		System.out.println(t.search("hello"));
		t.remove("hello");
		System.out.println(t.search("hello"));
		System.out.println(t.countWords());
		
	}

}

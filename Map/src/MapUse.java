
public class MapUse {

	public static void main(String[] args) {
		
		Map<String, Integer> myMap = new Map<String, Integer>();
		
		myMap.put("a", 1);
		myMap.put("b", 2);
		myMap.put("c", 3);
		myMap.put("d", 4);
		myMap.put("e", 5);
		
		System.out.println(myMap.size());
		System.out.println();
		System.out.println(myMap.get("c"));
		
		myMap.remove("a");
		myMap.remove("b");
		
		System.out.println();
		System.out.println(myMap.size());
		
	}

}
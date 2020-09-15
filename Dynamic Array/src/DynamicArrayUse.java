
public class DynamicArrayUse {

	public static void main(String[] args) {
		
		DynamicArray<Character> myChars = new DynamicArray<Character>();
		
		myChars.add('a');
		myChars.add('b');
		myChars.add('c');
		myChars.add('d');
		myChars.add('e');
		myChars.add('f');
		myChars.add('g');
		myChars.add('h');
		myChars.add('i');
		myChars.add('j');
		myChars.add('k');
		myChars.add('l');
		myChars.add('m');
		myChars.add('n');
		myChars.add('o');
		
		System.out.print(myChars.get(0));
		System.out.print(myChars.get(1));
		System.out.print(myChars.get(7));
		System.out.println(myChars.get(8));
		System.out.println(myChars.getSize());
	}

}

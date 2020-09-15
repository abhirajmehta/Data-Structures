
public class DynamicArrayUse {

	public static void main(String[] args) {
		
		
//		DynamicArray<Integer> myArray= new DynamicArray<>();
//		
//		myArray.add(2);
//		myArray.add(4);
//		myArray.add(6);
//		myArray.add(2);
//		myArray.add(4);
//		myArray.add(6);
//		myArray.add(2);
//		myArray.add(4);
//		myArray.add(6);
//		myArray.add(2);
//		myArray.add(4);
//		myArray.add(6);
//		
//		System.out.println(myArray.get(0));
//		System.out.println(myArray.getSize());
//		myArray.remove();
//		System.out.println(myArray.getSize());
		
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
		
		System.out.println(myChars.get(0));
		System.out.println(myChars.getSize());
		System.out.println(myChars.get(4));
		System.out.println(myChars.get(5));
		System.out.println(myChars.get(6));
		System.out.println(myChars.get(12));
		myChars.remove();
		System.out.println(myChars.getSize());
		myChars.remove();
		System.out.println(myChars.getSize());
		myChars.remove();
		System.out.println(myChars.getSize());
		myChars.remove();
		System.out.println(myChars.getSize());
		myChars.remove();
		System.out.println(myChars.getSize());
		myChars.remove();
		System.out.println(myChars.getSize());
	}

}


public class BSTUse {

	public static void main(String[] args) {
		
		BST myBST = new BST();
		myBST.insertData(4);
		myBST.insertData(2);
		myBST.insertData(3);
		myBST.insertData(1);
		myBST.insertData(6);
		myBST.insertData(5);
		
		myBST.printTree();
		
		myBST.deleteData(3);
		myBST.deleteData(2);
		
		System.out.println(myBST.search(4));
		myBST.printTree();
		
	}

}
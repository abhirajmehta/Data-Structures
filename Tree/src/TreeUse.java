
public class TreeUse {

	public static void main(String[] args) {
		
		Tree myTree = new Tree();
		
		myTree.takeInput(1);
		
		int heightOfMyTree = myTree.height();
		
		System.out.println(heightOfMyTree);
		
		myTree.printTree();
	}

}
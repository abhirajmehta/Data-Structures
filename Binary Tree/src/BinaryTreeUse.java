
public class BinaryTreeUse {

	public static void main(String[] args) {
		
		BinaryTree myTree = new BinaryTree();
		
		myTree.takeInput(1);
		myTree.printTree();
		
		System.out.println("\n\n" + myTree.height(myTree.root));
	}

}

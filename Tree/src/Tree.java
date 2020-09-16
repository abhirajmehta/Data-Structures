import java.util.Scanner;


import java.util.Queue;
import java.util.LinkedList;

public class Tree {

	private TreeNode root;
	
//	//Constructor
//	public Tree() {
//		
//	}

	//take input for the tree
	public void takeInput(int rootData) {
		
		root = new TreeNode(rootData);
		Queue<TreeNode> rootQueue = new LinkedList<TreeNode>();
		rootQueue.add(root);
		
		Scanner input = new Scanner(System.in);
		
		//add children for all the nodes available in the queue
		while(!rootQueue.isEmpty()) {
			
			//take out the node we want to add children for
			TreeNode temp = rootQueue.poll();
			System.out.println("Enter number of children of "+ temp.data);
			
			int numOfChildren = input.nextInt();
			
			//take children nodes as input for number of children times
			for(int count = 1; count <= numOfChildren; count++) {
				
				System.out.println("Enter child number " + count + " of " + temp.data);
				int tempNum = input.nextInt();
				TreeNode tempNode = new TreeNode(tempNum);
				temp.children.add(tempNode);
				rootQueue.add(tempNode);
				
			}
			
		}
		
		//Scanner close
		input.close();
		
	}
	
	//printing the tree
	public void printTree() {
		
		Queue<TreeNode> ansQueue = new LinkedList<TreeNode>();
		ansQueue.add(root);
		ansQueue.add(null);
		
		//call to a helper function to print the tree
		printTreeHelper(ansQueue);
		
	}

	private void printTreeHelper(Queue<TreeNode> ansQueue) {
		
		//go through queue until it is empty
		while(!ansQueue.isEmpty()) {
			
			TreeNode rootToPrint = ansQueue.poll();
			
			//if the node is null then print a new line and add one more null to the queue
			if(rootToPrint == null && !ansQueue.isEmpty()) {
				
				System.out.println();
				ansQueue.add(null);
				continue;
				
			//if the node is null and queue is also empty, it means the tree traversal is done so just return
			}else if(rootToPrint == null && ansQueue.isEmpty()) {
				
				return;
				
			}
			
			//print the data of the node and add it's children to the queue
			System.out.print(rootToPrint.data + " ");
			for(int count = 0; count < ( rootToPrint.children.size() ); count++) {
				
				ansQueue.add(rootToPrint.children.get(count));
				
			}
			
		}
		
	}

	//return height of the tree
	public int height() {
		
		//call to a helper function
		return heightHelper(this.root);
		
	}
	
	//height helper function
	private int heightHelper(TreeNode root) {
		
		//if it is a leaf node the return 1 as height
		if(root.children.size() == 0) {
			return 1;
		}
		
		int ans = 0;
        
		//call this function recursively on every child of the current node
        for(int i = 0 ;i < root.children.size(); i++){
        	
        	//recursive call
            int heightOfChild = heightHelper(root.children.get(i));
            
            //if the new height is greater than previous, replace it with the new one
            if(ans < heightOfChild){
                ans = heightOfChild;
            }
        }
		
        return ans + 1;
	}
	
	
}

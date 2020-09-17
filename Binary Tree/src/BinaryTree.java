import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class BinaryTree {
	
	BinaryTreeNode<Integer> root;
	
	//take input for tree
	public void takeInput(Integer data) {
		
		root = new BinaryTreeNode<Integer>(data);
		
		//queue initialization to take inputs for each node present in the queue
		Queue<BinaryTreeNode<Integer>> rootQueue = new LinkedList<BinaryTreeNode<Integer>>();
		rootQueue.add(root);
		
		//call to a helper function
		tekeInputHelper(rootQueue);
		
	}

	//helper function for tree input
	private void tekeInputHelper(Queue<BinaryTreeNode<Integer>> rootQueue) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter -1 if don't want that child !");
		
		//print the node and add it's children to queue
		while(!rootQueue.isEmpty()) {
			
			BinaryTreeNode<Integer> temp = rootQueue.poll();
			System.out.println("Enter left child of " + temp.data);
			Integer leftChildData = input.nextInt();
			
			//if node has a left child
			if(leftChildData != -1) {
				
				temp.left = new BinaryTreeNode<Integer>(leftChildData);
				rootQueue.add(temp.left);
				
			}
			
			System.out.println("Enter right child of " + temp.data);
			Integer rightChildData = input.nextInt();
			
			//if node has a right child
			if(rightChildData != -1) {
				
				temp.right = new BinaryTreeNode<Integer>(rightChildData);
				rootQueue.add(temp.right);
				
			}
			
		}
		
		input.close();
		
	}
	
	//print the tree
	public void printTree() {
		
		Queue<BinaryTreeNode<Integer>> rootQueue = new LinkedList<BinaryTreeNode<Integer>>();
		rootQueue.add(root);
		
		//continue printing nodes till the end
		while(!rootQueue.isEmpty()) {
			
			BinaryTreeNode<Integer> temp = rootQueue.poll();
			
			//if node has no child, just print the node
			if(temp.left == null && temp.right == null) {
				
				System.out.println(temp.data + ":");
				
			//print node as well as left child if present and right child if present
			}else {
				//give() function returns -1 if the child is absent else will return the data of that child
				System.out.println(give(temp) + ":L:" + give(temp.left) + ",R:" + give(temp.right));
			}
			
			//if left child is present, add it to the queue
			if(temp.left != null){
                rootQueue.add(temp.left);
            }
			//if right child is present, add it to the queue
            if(temp.right != null){
                rootQueue.add(temp.right);
            }
			
		}
		
		
	}
	
	//helper function to return the data of a node
	private int give(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			
			return -1;
			
		}
		
		return root.data;
	}
	
	//height of the tree
	public int height(BinaryTreeNode<Integer> root) {
		
		//if node is null, just return 0
		if(root == null) {
			
			return 0;
			
		}
		
		//recursive call on the left subtree
		int leftHeight = height(root.left);
		//recursive call on the right subtree
		int rightHeight = height(root.right);
		
		//add one to the maximum height and return that height
		return Math.max(leftHeight, rightHeight) + 1;
		
	}
	
}
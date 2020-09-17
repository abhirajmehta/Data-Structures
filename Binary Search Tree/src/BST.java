
public class BST {
	
	private BinaryTreeNode<Integer> root;
    
	//search data in the tree
    public boolean search(int input){
        
    	//call to a helper function
        return searchHelper(root,input);
        
    }
	
    //helper function for search
    private boolean searchHelper(BinaryTreeNode<Integer> root, int input){
        
    	//return false if node is empty
        if(root == null){
        	
            return false;
        
        //return true if node's data is equal to the input data
        }else if(root.data == input){
        
        	return true;
        
        }
        
        boolean ans;
       
        //recursive call on left subtree
        if(root.data > input){
        
        	ans = searchHelper(root.left,input);
        
        //recursive call on right subtree
        }else{
        
        	ans = searchHelper(root.right,input);
        
        }
        
        return ans;
    }
    
    //insert data into the tree
    public void insertData(int input){
        //call a helper function
        root = insertDataHelper(root,input);

    }
    
    //helper function to insert a data into the tree
    private BinaryTreeNode<Integer> insertDataHelper(BinaryTreeNode<Integer> root, int input){
        
    	//if node is empty, create a node with data to be inserted and return the new node
        if(root == null){
           
        	BinaryTreeNode<Integer> temp = new BinaryTreeNode<>(input);
            return temp;
        
        }
        
        //if current node's data is greater than input data, make a recursive call on left subtree
        if(root.data > input){
        	
            root.left = insertDataHelper(root.left,input);
        
        //else make a recursive call on the right subtree
        }else{
        
        	root.right = insertDataHelper(root.right,input);
        
        }
        
        return root;
    }
    
    //delete the data from tree
    public void deleteData(int input){
        
    	//if 0 is to be deleted, just return
        if(input == 0){
        	
            return;
        
        //if the tree does not have input data, just return
        }else if(!search(input)){
        
        	return;
        
        }
        
        //call to a helper function and make the returned node, current node
        root = deleteDataHelper(root,input);
        
    }
    
    private BinaryTreeNode<Integer> deleteDataHelper(BinaryTreeNode<Integer> root, int input){
        
        //if data to be deleted is found
        if(root.data == input){
            
        	//if the node has no child, return null as current node
            if(root.left == null && root.right == null){
            	
                return null;
            
            //if the node has right child only, return the right child
            }else if(root.left == null){
            
            	return root.right;
            
            //if the node has left child only, return the left child
            }else if(root.right == null){
            
            	return root.left;
            
            //if the node has both left and right child	
            }else{
            	
                //call to a function findSmallest()
                Integer smallestRight = findSmallest(root.right);
                
                //make the smallest node, current node
                root.data = smallestRight;
                
                //call to a function to rearrange the right subtree
                root.right = modified(root.right,smallestRight);
            }
            
        //if node's data is greater than input data
        }else if(root.data > input){
        	
        	//recursive call on left subtree
        	root.left = deleteDataHelper(root.left,input);
        
        }else{
        	
        	//else recursive call on right subtree
        	root.right = deleteDataHelper(root.right,input);
        
        }
        
        return root;
    }
    
    //this function returns the smallest value in the tree with given root node
    public int findSmallest(BinaryTreeNode<Integer> root){
        
    	//if node's left child is absent, return the node's data as the smallest one
        if(root.left == null){
            return root.data;
        }
        //recursive call on the left child of the node
        return findSmallest(root.left);
    }
    
    //this functions deletes the node with data smallestRight as it has been assigned to the node which was to be deleted
    private BinaryTreeNode<Integer> modified(BinaryTreeNode<Integer> root, int smallestRight){
        
    	//if the data found
        if(root.data == smallestRight){
            
        	//if it has no child, return null
        	if(root.right == null){
            
        		return null; 
            
        	//if it has a right child, return right child as a new child
        	}else{
            
        		return root.right;
            
        	}
        }
        
        //recursive call on left subtree of the node as smallest element will surely be on the left side
        root.left = modified(root.left,smallestRight);
        
        return root;
    
    }
    
    
    //print tree
    public void printTree(){
    	//call to a helper function
        printTreeHelper(root);
    
    }
    
    private void printTreeHelper(BinaryTreeNode<Integer> root){
        
    	//if node is empty, return
        if(root == null){
        	
            return;
        
        }
        
        //if node has both the children child, print node's data along with children's data
        if(root.left != null && root.right != null){
        
        	System.out.println(root.data + ":L:" + root.left.data + ",R:" + root.right.data);
        
        //if node has no child, print node's data only
        }else if(root.left == null && root.right == null){
        
        	System.out.println(root.data + ":");
       
        //if node has right child only, print root's data and right child's data
        }else if(root.left == null){
        
        	System.out.println(root.data + ":R:" + root.right.data);
        
        //if node has left child only, print node's data and leftchild's data only
        }else if(root.right == null){
        
        	System.out.println(root.data + ":L:" + root.left.data + ",");
        
        }
        
        //recursive call on left subtree
        printTreeHelper(root.left);
        //recursive call on right subtree
        printTreeHelper(root.right);
        
    }
	
}

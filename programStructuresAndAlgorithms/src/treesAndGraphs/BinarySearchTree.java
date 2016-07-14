package treesAndGraphs;

public class BinarySearchTree {

	TreeNode root;

	/**
	 * Time - O(logN)
	 * @param key
	 * @return
	 */
	public TreeNode find(int key) {
		TreeNode current = root;
		if (root == null) {
			return null;
		} else {
			
			while (current.key != key) {
				
				if (key < current.key) {
					current = current.leftChild;
				} else {
					current = current.rightChild;
				}
				if (current == null) {
					return null;
				}

			}

			return current;
		}
	}

	public void insertATreeNode(int value) {
		TreeNode nodeToBeInserted = new TreeNode(value);
		
		if(root==null){
			this.root = nodeToBeInserted;
		}else{
			TreeNode current = root;
			TreeNode parent;
			while(true){
				parent = current;
				
				if(value<current.key){
					
					//go left
					current = current.leftChild;
					if(current==null){
						parent.leftChild=nodeToBeInserted;
						return;
					}
					
				}else{
					
					//go right
					current = current.rightChild;
					if(current==null){
						parent.rightChild=nodeToBeInserted;
						return;
					}
					
				}
			}
		}
		
	}
	
	public TreeNode getRoot() {
		return root;
	}

	public void delete(int id) {

	}

}

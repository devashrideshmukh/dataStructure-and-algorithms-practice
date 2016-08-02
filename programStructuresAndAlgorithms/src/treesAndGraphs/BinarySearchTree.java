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
			root=nodeToBeInserted;
			return;
		}else{
			TreeNode cur = root;
			TreeNode parent;
			while(true){
				parent = cur;
				if(value<cur.key){
					cur=cur.leftChild;
					if(cur==null){
						parent.leftChild=nodeToBeInserted;
						return;
					}
				}else{
					cur=cur.rightChild;
					if(cur==null){
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
	
	 public void insert (int value)
	   {  root = insert ( value, root );  }

	// NOTE:  This implementation is allowing equal keys.
	 public TreeNode insert (Integer value, TreeNode node )
	   {
	      if ( node == null )
	         return new TreeNode(value);
	      else if (value < node.key)
	         node.leftChild = insert ( value, node.leftChild);
	      else
	         node.rightChild = insert ( value, node.rightChild);
	      return node;
	   }
	
	

}

package treesAndGraphs;


/**
 * 
 * Delete a node from Binary Search Tree Three Parameters to Be Considered 1)
 * Node to be deleted is a leaf node 2) Node to be deleted has one child 3) Node
 * to be deleted has two children
 * 
 * @author Devashri
 *
 */
public class DeleteNode {

	private class NodeAndParent {
		private TreeNode nodeToBeDeleted;
		private TreeNode parentNode;
		private boolean isLeftChild;

		public NodeAndParent(TreeNode nodeToBeDeleted, TreeNode parentNode,boolean isLeftChild) {
			this.nodeToBeDeleted = nodeToBeDeleted;
			this.parentNode = parentNode;
			this.isLeftChild = isLeftChild;
		}
	}
	
	private TreeNode getInorderSuccessor(TreeNode nodeToBeDeleted,TreeNode root){
		if(root==null){
			return null;
		}
		TreeNode next = null;
		TreeNode cur = root;
		while(cur!=null && cur.key!=nodeToBeDeleted.key){
			if(cur.key>nodeToBeDeleted.key){
				next = cur;
				cur = cur.leftChild;
			}else{
				cur = cur.rightChild;
			}
		}
		
		if(cur==null){
			return null;
		}
		
		if(cur.rightChild==null){
			return next;
		}
		
		cur = cur.rightChild;
		while(cur.leftChild!=null){
			cur=cur.leftChild;
		}
		
		return cur;
	}	
	

	/**
	 * This method finds the reference to the node to be deleted
	 * 
	 * @param value
	 * @param root
	 * @return
	 */
	private NodeAndParent getNodeToBeDeleted(int value, TreeNode root) {
		if (root == null) {
			return null;
		}

		TreeNode cur = root;
		TreeNode prev;
		boolean isLeftChild = true;
		while (cur != null) {
			prev = cur;
			if (value < cur.key) {
				isLeftChild = true;
				cur = cur.leftChild;
			} else {
				isLeftChild=false;
				cur = cur.rightChild;
			}

			if (cur != null && cur.key == value) {
				NodeAndParent np = new NodeAndParent(cur, prev, isLeftChild);
				return np;
			}
		}
		return null;
	}

	public boolean delete(int value, TreeNode root) {

		NodeAndParent nodeInfo = getNodeToBeDeleted(value, root);
		if (nodeInfo == null) {
			System.err.println("\n "+value+" Node does not exist");
			return false;
		}
		TreeNode nodeToBeDeleted = nodeInfo.nodeToBeDeleted;
		TreeNode parent = nodeInfo.parentNode;
		boolean isLeftChild = nodeInfo.isLeftChild;

		
		/**
		 * Case1: Node has no children
		 */
		if (nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null) {
			
			if(nodeToBeDeleted==root){
				//if node to be deleted is the root itself and a left
				root = null;
			}else if(isLeftChild){
				//if node to be deleted is left child of parent
				parent.leftChild=null;
			}else{
				//if node to be deleted is right child of parent
				parent.rightChild=null;
			}
		}
		
		/**
		 * Case2: Node has one child
		 */
		//if node has only left child and no right child
		else if(nodeToBeDeleted.rightChild==null){
			if(nodeToBeDeleted==root){
				root = nodeToBeDeleted.leftChild;
			}else if(isLeftChild){
				parent.leftChild=nodeToBeDeleted.leftChild;
			}else{
				parent.rightChild=nodeToBeDeleted.leftChild;
			}
		}
		
		//if node has only right child and no left child
		else if(nodeToBeDeleted.leftChild==null){
			if(nodeToBeDeleted==root){
				root=null;
			}else if(isLeftChild){
				parent.leftChild=nodeToBeDeleted.rightChild;
			}else{
				parent.rightChild=nodeToBeDeleted.rightChild;
			}
		}
		
		/**
		 * Case3: Node has two children
		 */
		else{
			TreeNode successor = getInorderSuccessor(nodeToBeDeleted,root);
			if(nodeToBeDeleted==root){
				root=successor;
			}else if(isLeftChild){
				parent.leftChild=successor;
			}else{
				parent.rightChild=successor;
				successor.leftChild=nodeToBeDeleted.leftChild;
			}
		}
		

		return true;
	}
	
	public static void main(String[] args) {
		
		TreeNode root2 = InsertBST.insertRec(50, null);
		InsertBST.insertRec(75, root2);
		InsertBST.insertRec(62, root2);
		InsertBST.insertRec(87, root2);
		InsertBST.insertRec(77, root2);
		InsertBST.insertRec(93, root2);
		InsertBST.insertRec(77, root2);
		InsertBST.insertRec(93, root2);
		InsertBST.insertRec(79, root2);
		System.out.println("Tree:");
		TreeTraversals.levelOrderTraversal(root2);
		System.out.println("\n");
		DeleteNode dl = new DeleteNode();
		TreeTraversals.levelOrder(root2);
		dl.delete(75, root2);
		TreeTraversals.levelOrder(root2);
	}

}

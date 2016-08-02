package treesAndGraphs;

/**
 * Given a binary search tree and a node in it, find the in-order successor of
 * that node in the BST.
 * 
 * @author Devashri
 *
 */
public class InorderSuccessor {
	
	public static TreeNode getInorderSuccessor(TreeNode node,TreeNode root){
		if(root==null){
			return null;
		}
		TreeNode next = null;
		TreeNode cur = root;
		while(cur!=null && cur.key!=node.key){
			if(cur.key>node.key){
				next = cur;
				cur=cur.leftChild;
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
	
	public static void main(String[] args) {
		TreeNode root = InsertBST.insertInBSTIterative(38, null);
		InsertBST.insertInBSTIterative(26, root);
		InsertBST.insertInBSTIterative(72, root);
		InsertBST.insertInBSTIterative(55, root);
		InsertBST.insertInBSTIterative(41, root);
		InsertBST.insertInBSTIterative(60, root);
		InsertBST.insertInBSTIterative(43, root);
		InsertBST.insertInBSTIterative(90, root);
		InsertBST.insertInBSTIterative(78, root);
		InsertBST.insertInBSTIterative(74, root);
		InsertBST.insertInBSTIterative(92, root);
		TreeTraversals.levelOrder(root);
		//TreeNode n1 = FindNodeBST.findNodeIterative(root, 90);
		//System.out.println(InorderSuccessor.getInorderSuccessor(n1,root).key);
		TreeNode n2 = FindNodeBST.findNodeIterative(root, 38);
		System.out.println(InorderSuccessor.getInorderSuccessor(n2,root).key);
	}
}
